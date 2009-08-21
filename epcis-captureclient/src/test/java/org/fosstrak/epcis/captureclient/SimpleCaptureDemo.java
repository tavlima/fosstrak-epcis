/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org).
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.fosstrak.epcis.captureclient;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.fosstrak.epcis.model.ActionType;
import org.fosstrak.epcis.model.BusinessLocationType;
import org.fosstrak.epcis.model.EPC;
import org.fosstrak.epcis.model.EPCISBodyType;
import org.fosstrak.epcis.model.EPCISDocumentType;
import org.fosstrak.epcis.model.EPCListType;
import org.fosstrak.epcis.model.EventListType;
import org.fosstrak.epcis.model.ObjectEventType;
import org.fosstrak.epcis.model.ObjectFactory;
import org.fosstrak.epcis.model.ReadPointType;
import org.w3c.dom.Element;

/**
 * A simple test utility class for demonstrating how to capture EPCIS events to
 * an EPCIS repository programmatically.
 * 
 * @author Marco Steybe
 */
public class SimpleCaptureDemo {

	private static final String DEFAULT_EPCIS_CAPTURE_URL = "http://localhost:8080/epcis-repository/capture";

	/**
	 * Reads a sample EPCIS capture request and submits it to an EPCIS
	 * repository instance.
	 * 
	 * @param args
	 *            Valid command-line argument is the URL of the EPCIS
	 *            repository (<code>url=</code>). A default values will be
	 *            provided if this argument is omitted.
	 */
	public static void main(String[] args) throws Exception {
		String captureUrl = DEFAULT_EPCIS_CAPTURE_URL;
		if (args.length > 0) {
			// read command-line arguments
			for (int i = 0; i < args.length; i++) {
				if (args[i].startsWith("url=")) {
					captureUrl = args[i].substring(4);
				} else {
					System.out.println("ignoring command-line argument: " + args[i]);
				}
			}
		}
		System.out.println("using capture URL: " + captureUrl);

		// create the EPCIS capture request document
		EPCISDocumentType requestDoc = createCaptureRequestDocument();

		// for debugging purposes you may want to uncomment this
		printDoc(requestDoc);

		// initialize the capture client and send the request
		CaptureClient client = new CaptureClient(captureUrl);
		int httpResponseCode = client.capture(requestDoc);

		if (httpResponseCode == 200) {
			System.out.println("capture of events successful");
		} else {
			System.err.println("HTTP response " + httpResponseCode);
		}
	}

	/**
	 * Creates a simple EPCIS object event using the API objects from the EPCIS
	 * schema.
	 */
	private static EPCISDocumentType createCaptureRequestDocument() {
		ObjectEventType objEvent = new ObjectEventType();

		// set the eventTime and eventTimeZoneOffset
		XMLGregorianCalendar eventTime = getCurrentDateTime();
		String timeZoneOffset = getTimeZoneOffset(eventTime);
		objEvent.setEventTime(eventTime);
		objEvent.setEventTimeZoneOffset(timeZoneOffset);

		// set the EPCs
		EPC epc = new EPC();
		epc.setValue("urn:epc:id:sgtin:0057000.123780.7788");
		EPCListType epcList = new EPCListType();
		epcList.getEpc().add(epc);
		objEvent.setEpcList(epcList);

		// set the action
		objEvent.setAction(ActionType.ADD);

		// set the bizStep
		objEvent.setBizStep("urn:fosstrak:demo:bizstep:fmcg:production");

		// set the disposition
		objEvent.setDisposition("urn:fosstrak:demo:disp:fmcg:pendingQA");

		// set the readPoint
		ReadPointType readPoint = new ReadPointType();
		readPoint.setId("urn:fosstrak:demo:fmcg:ssl:0037000.00729.210,432");
		objEvent.setReadPoint(readPoint);

		// set the bizLocation
		BusinessLocationType bizLocation = new BusinessLocationType();
		bizLocation.setId("urn:fosstrak:demo:fmcg:ssl:0037000.00729.210");
		objEvent.setBizLocation(bizLocation);

		// optionally add an event field extension
		addEventFieldExtension(objEvent);

		// create the EPCISDocument containing the ObjectEvent
		EPCISDocumentType epcisDoc = new EPCISDocumentType();
		EPCISBodyType epcisBody = new EPCISBodyType();
		EventListType eventList = new EventListType();
		eventList.getObjectEventOrAggregationEventOrQuantityEvent().add(objEvent);
		epcisBody.setEventList(eventList);
		epcisDoc.setEPCISBody(epcisBody);
		epcisDoc.setSchemaVersion(new BigDecimal("1.0"));
		epcisDoc.setCreationDate(eventTime);
		return epcisDoc;
	}

	/**
	 * Returns an XMLGregorianCalendar representing the current date and time
	 */
	protected static XMLGregorianCalendar getCurrentDateTime() {
		XMLGregorianCalendar now = null;
		try {
			DatatypeFactory dataFactory = DatatypeFactory.newInstance();
			now = dataFactory.newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			System.err.println("unable to construct the date/time object");
			e.printStackTrace();
		}
		return now;
	}

	/**
	 * Retrieves the timezone from the given eventTime and formats it
	 * appropriately.
	 */
	protected static String getTimeZoneOffset(XMLGregorianCalendar eventTime) {
		int timezone = eventTime.getTimezone();
		int h = Math.abs(timezone / 60);
		int m = Math.abs(timezone % 60);
		DecimalFormat format = new DecimalFormat("00");
		String sign = (timezone < 0) ? "-" : "+";
		return sign + format.format(h) + ":" + format.format(m);
	}

	private static void addEventFieldExtension(ObjectEventType objEvent) {
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Element elem = builder.newDocument().createElementNS("http://www.example.com/epcis/extensions/", "temperature");
			elem.setPrefix("xyz");
			elem.setTextContent("30");
			objEvent.getAny().add(elem);
		} catch (ParserConfigurationException e) {
			System.err.println("unable to construct the event field extension");
			e.printStackTrace();
		}
	}

	/**
	 * Marshals the given EPCIS document into its XML representation and prints it to System.out.
	 */
	protected static void printDoc(EPCISDocumentType epcisDoc) {
		try {
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<EPCISDocumentType> item = factory.createEPCISDocument(epcisDoc);
			JAXBContext context = JAXBContext.newInstance(EPCISDocumentType.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.marshal(item, System.out);
		} catch (JAXBException e) {
			System.err.println("unable to print the EPCIS document");
			e.printStackTrace();
		}
	}

}
