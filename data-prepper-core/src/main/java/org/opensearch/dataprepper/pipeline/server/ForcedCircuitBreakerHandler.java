/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.pipeline.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.opensearch.dataprepper.breaker.ForcedCircuitBreakerProvider;

import javax.ws.rs.HttpMethod;
import java.io.IOException;
import java.net.HttpURLConnection;

class ForcedCircuitBreakerHandler implements HttpHandler {

    private final ForcedCircuitBreakerProvider forcedCircuitBreakerProvider;

    public ForcedCircuitBreakerHandler(ForcedCircuitBreakerProvider forcedCircuitBreakerProvider) {

        this.forcedCircuitBreakerProvider = forcedCircuitBreakerProvider;
    }

    @Override
    public void handle(final HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();

        if(requestMethod.equals(HttpMethod.POST)) {
            forcedCircuitBreakerProvider.setOpen(true);
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
        } else if(requestMethod.equals(HttpMethod.DELETE)) {
            forcedCircuitBreakerProvider.setOpen(false);
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
        } else {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_METHOD, 0);
            exchange.getResponseBody().close();
        }

    }
}
