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

package org.fosstrak.epcis.queryclient;

import java.io.InputStream;
import java.net.URL;

import org.fosstrak.epcis.model.ArrayOfString;
import org.fosstrak.epcis.model.Poll;
import org.fosstrak.epcis.model.QueryParam;
import org.fosstrak.epcis.model.QueryParams;
import org.fosstrak.epcis.model.QueryResults;
import org.fosstrak.epcis.utils.QueryResultsParser;

/**
 * A simple test utility class for demonstrating how to send simple event
 * queries to the Fosstrak EPCIS query service.
 * 
 * @author Marco Steybe
 */
public class SimpleEventQueryTest {

    // Note: keep the methods in this class static in order to prevent them from
    // being executed when building the project with Maven.

    public static void main(String[] args) throws Exception {
        // configure the query service
        String queryUrl = QueryClientTestHelper.LOCAL_EPCIS_QUERY_URL;
        QueryControlClient client = new QueryControlClient();
        client.configureService(new URL(queryUrl), null);

        // create a query in its XML form and send it to the repository
        InputStream xmlStream = QueryClientTestHelper.getInputStream(QueryClientTestHelper.SAMPLE_EVENT_QUERY_XML);
        System.out.println("sending query request (" + xmlStream.available() + " bytes) ...");
        QueryResults results = client.poll(xmlStream);
        // print the results to System.out
        QueryResultsParser.queryResultsToXml(results, System.out);

        // create a query Poll object and send it to the query service
        Poll poll = createPoll();
        System.out.println("sending query request ...");
        results = client.poll(poll);
        QueryResultsParser.queryResultsToXml(results, System.out);
    }

    /**
     * Creates and returns a simple EPCIS query Poll object.
     */
    private static Poll createPoll() {
        // construct the query parameters
        QueryParam queryParam1 = new QueryParam();
        queryParam1.setName("eventType");
        ArrayOfString queryParamValue1 = new ArrayOfString();
        queryParamValue1.getString().add("ObjectEvent");
        queryParam1.setValue(queryParamValue1);

        QueryParam queryParam2 = new QueryParam();
        queryParam2.setName("MATCH_epc");
        ArrayOfString queryParamValue2 = new ArrayOfString();
        queryParamValue2.getString().add("urn:epc:id:sgtin:0057000.123780.3167");
        queryParamValue2.getString().add("urn:epc:id:sgtin:0057000.123780.7788");
        queryParam2.setValue(queryParamValue2);

        // add the query parameters to the list of parameters
        QueryParams queryParams = new QueryParams();
        queryParams.getParam().add(queryParam1);
        queryParams.getParam().add(queryParam2);

        // create the Poll object
        Poll poll = new Poll();
        poll.setQueryName("SimpleEventQuery");
        poll.setParams(queryParams);
        return poll;
    }
}
