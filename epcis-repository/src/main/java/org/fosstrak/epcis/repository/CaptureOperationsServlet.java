/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.accada.epcis.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

/**
 * CaptureOperationsModule implements the core capture operations. Converts XML
 * events delivered by HTTP POST into SQL and inserts them into the database.
 * 
 * @author David Gubler
 * @author Alain Remund
 * @author Marco Steybe
 */
public class CaptureOperationsServlet extends HttpServlet {

    private static final long serialVersionUID = -1507276940747086042L;

    private static final Logger LOG = Logger.getLogger(CaptureOperationsServlet.class);

    private CaptureOperationsModule captureOperationsModule = new CaptureOperationsModule();

    /**
     * @see javax.servlet.GenericServlet#init()
     * @throws ServletException
     *             If the context could not be loaded.
     */
    @Override
    public void init() throws ServletException {
        // load log4j config 
        String servletPath = getServletContext().getRealPath("/");
        String log4jConfigFile = getServletContext().getInitParameter("log4jConfigFile");
        if (log4jConfigFile != null) {
            // if no log4j properties file found, then do not try
            // to load it (the application runs without logging)
            PropertyConfigurator.configure(servletPath + log4jConfigFile);
        }

        // read configuration and set up hibernate ...
        try {
        	Configuration c = new Configuration();
        	c.configure(); // from WEB-INF/classes/hibernate.cfg.xml
        	SessionFactory sessionFactory = c.buildSessionFactory();
        	captureOperationsModule.setSessionFactory(sessionFactory);
        } catch (Exception e) {
            String msg = "Unable to configure Hibernate: " + e.toString();
            LOG.error(msg, e);
            throw new ServletException(msg, e);
        }

        // load properties
        String appConfigFile = getServletContext().getInitParameter("appConfigFile");
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(servletPath + appConfigFile));
        } catch (IOException e) {
            LOG.error("Unable to load application properties from " + servletPath + appConfigFile);
        }
        captureOperationsModule.setInsertMissingVoc(Boolean.parseBoolean(properties.getProperty("insertMissingVoc",
                "true")));
        String dbResetAllowedStr = getServletContext().getInitParameter("dbResetAllowed");
        captureOperationsModule.setDbResetAllowed(Boolean.parseBoolean(dbResetAllowedStr));
        captureOperationsModule.setDbResetScript(servletPath + getServletContext().getInitParameter("dbResetScript"));

        // load the schema validator
        try {
            String schemaPath = servletPath + getServletContext().getInitParameter("schemaPath");
            String schemaFile = getServletContext().getInitParameter("schemaFile");
            File xsd = new File(schemaPath + System.getProperty("file.separator") + schemaFile);
            LOG.debug("Reading schema from '" + xsd.getAbsolutePath() + "'.");
            if (!xsd.exists()) {
                LOG.warn("Unable to find the schema file (check 'pathToSchemaFiles' parameter in META-INF/context.xml)");
                LOG.warn("Schema validation will not be available!");
            } else {
                // load the schema to validate against
                SchemaFactory schemaFact = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                Source schemaSrc = new StreamSource(xsd);
                Schema schema = schemaFact.newSchema(schemaSrc);
                captureOperationsModule.setSchema(schema);
            }
        } catch (Exception e) {
            LOG.warn("Unable to load the schema validator.", e);
            LOG.warn("Schema validation will not be available!");
        }
        
    }

    /**
     * Returns a simple information page.
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     * @param req
     *            The HttpServletRequest.
     * @param rsp
     *            The HttpServletResponse.
     * @throws IOException
     *             If an error occurred while writing the response.
     */
    public void doGet(final HttpServletRequest req, final HttpServletResponse rsp) throws IOException {
        final PrintWriter out = rsp.getWriter();

        // return an HTML info page
        rsp.setContentType("text/html");

        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        out.println("   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        out.println("<html>");
        out.println("<head><title>EPCIS Capture Service</title></head>");
        out.println("<body>");
        out.println("<p>This service captures EPCIS events sent to it using HTTP POST requests.<br />");
        out.println("The payload of the HTTP POST request is expected to be an XML document conforming to the EPCISDocument schema.</p>");
        out.println("<p>For further information refer to the xml schema files or check the Example <br />");
        out.println("in 'EPC Information Services (EPCIS) Version 1.0 Specification', Section 9.6.</p>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }


    /**
     * Implements the EPCIS capture operation. Takes HTTP POST request, extracts
     * the payload into an XML document, validates the document against the
     * EPCIS schema, and captures the EPCIS events given in the document. Errors
     * are caught and returned as simple plaintext messages via HTTP.
     * 
     * @param req
     *            The HttpServletRequest.
     * @param rsp
     *            The HttpServletResponse.
     * @throws IOException
     *             If an error occurred while validating the request or writing
     *             the response.
     */
    @Override
    public void doPost(final HttpServletRequest req, final HttpServletResponse rsp) throws IOException {
        LOG.info("EPCIS Capture Interface invoked.");
        rsp.setContentType("text/plain");
        final PrintWriter out = rsp.getWriter();

        InputStream is = null;
        // check if we have a POST request with form parameters
        if ("application/x-www-form-urlencoded".equalsIgnoreCase(req.getContentType())) {
            // check if the 'event' or 'dbReset' form parameter are given
            String event = req.getParameter("event");
            String dbReset = req.getParameter("dbReset");
            if (event != null) {
                LOG.info("Found deprecated 'event=' parameter. Refusing to process request.");
                String msg = "Starting from version 0.2.2, the EPCIS repository does not accept the EPCISDocument in the HTTP POST form parameter 'event' anymore. Please provide the EPCISDocument as HTTP POST payload instead.";
                rsp.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
                out.println(msg);
            } else if (dbReset != null && dbReset.equalsIgnoreCase("true")) {
                LOG.debug("Found 'dbReset' parameter set to 'true'.");
                rsp.setContentType("text/plain");
                try {
                	captureOperationsModule.doDbReset();
                	String msg = "db reset successfull";
                	LOG.info(msg);
                	rsp.setStatus(HttpServletResponse.SC_OK);
                	out.println(msg);
                } catch (SQLException e) {
                	String msg = "An error involving the database occurred.";
                	LOG.error(msg, e);
                	rsp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                	out.println(msg);
                } catch (IOException e) {
                	String msg = "An unknown error occurred.";
                	LOG.error(msg, e);
                	rsp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                	out.println(msg);
                } catch (UnsupportedOperationException e) {
                    String msg = "'dbReset' operation not allowed!";
                    LOG.info(msg);
                    rsp.setStatus(HttpServletResponse.SC_FORBIDDEN);
                    out.println(msg);
                }
            }
            out.flush();
            out.close();
            return;
        } else {
            is = req.getInputStream();
            try {
            	captureOperationsModule.doCapture(is, req.getUserPrincipal());
        		rsp.setStatus(HttpServletResponse.SC_OK);
        		out.println("Capture request succeeded.");
            } catch (SAXException e) {
        		String msg = "An error processing the XML document occurred.";
        		LOG.error(msg, e);
        		rsp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        		out.println(msg);
        	} catch (final Exception e) {
        		String msg = "An unknown error occurred.";
        		LOG.error(msg, e);
        		rsp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        		out.println(msg);
        	}
            
            out.flush();
            out.close();

        }
    }

}
