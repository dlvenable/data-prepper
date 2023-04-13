/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink.opensearch;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.json.JsonException;
import jakarta.json.stream.JsonGenerationException;
import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.ssl.SSLContexts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opensearch.client.RestClient;
import org.opensearch.client.RestClientBuilder;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpDeserializerBase;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.json.jackson.JacksonJsonpParser;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.transport.rest_client.RestClientTransport;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Demonstrates using the opensearch-java transport to make a generic request.
 * <p>
 * First run: docker run -p 9200:9200 -p 9600:9600 -e "discovery.type=single-node" -d opensearchproject/opensearch:2.6.0
 * Then run the unit test. I'm just using IntelliJ's test runner for simplicity.
 */
public class GeneralRequestDemoTest {
    private OpenSearchClient openSearchClient;


    /**
     * Makes a request to the root endpoint of an OpenSearch cluster using the Transport.
     *
     * @throws IOException
     */
    @Test
    void requestToRoot() throws IOException {
        // The JacksonJsonpMapper has this. But, we don't have access to it. So a lot of code was copied.
        // There may be better two solutions here:
        //   1. Update opensearch-java so that the JsonpDeserializer can be null and it will use the JsonpMapper. This might have broad implications.
        //   2. Make this class available to users of JacksonJsonpMapper. This has the smallest impact.
        final JsonpDeserializer<Map> deserializer = new JacksonValueParser<>(Map.class);

        JsonEndpoint<Void, Map, ErrorResponse> endpoint = new SimpleEndpoint<>(
                m -> "GET",
                m -> "/",
                m -> Collections.emptyMap(),
                m -> Collections.emptyMap(),
                false,
                deserializer);

        final Map<String, Object> response = openSearchClient._transport().performRequest(null, endpoint, openSearchClient._transportOptions());

        assertThat(response, notNullValue());
        assertThat(response.get("name"), notNullValue());
        assertThat(response.get("name"), instanceOf(String.class));
        assertThat(response.get("cluster_name"), equalTo("docker-cluster"));
        assertThat(response.get("tagline"), equalTo("The OpenSearch Project: https://opensearch.org/"));
        assertThat(response.get("version"), notNullValue());
        assertThat(response.get("version"), instanceOf(Map.class));
        final Map<String, Object> version = (Map<String, Object>) response.get("version");
        assertThat(version.get("distribution"), equalTo("opensearch"));
        assertThat(version.get("number"), instanceOf(String.class));
    }


    /**
     * This setup is creating an OpenSearchClient. Data Prepper already has code to do this. So it is just
     * to help with the proof-of-concept.
     *
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     */
    @BeforeEach
    void setUp() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        final HttpHost[] httpHosts = new HttpHost[] { HttpHost.create("https://localhost:9200") };
        final RestClientBuilder restClientBuilder = RestClient.builder(httpHosts);
        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(
                AuthScope.ANY, new UsernamePasswordCredentials("admin", "admin"));

        final TrustStrategy trustStrategy = new TrustAllStrategy();
        final SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, trustStrategy).build();

        restClientBuilder.setHttpClientConfigCallback(
                httpClientBuilder -> {
                    httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                    httpClientBuilder.setSSLContext(sslContext);
                    return httpClientBuilder;
                }
        );

        final RestClient restClient = restClientBuilder.build();
        final JacksonJsonpMapper jacksonJsonpMapper = new JacksonJsonpMapper();
        final RestClientTransport restClientTransport = new RestClientTransport(restClient, jacksonJsonpMapper);

        openSearchClient = new OpenSearchClient(restClientTransport);
    }

    /**
     * Copied from opensearch-java because it is package protected. I did add the ObjectMapper
     * and copied over the convertException() method which was in JacksonUtils and package protected.
     * @param <T>
     */
    private static class JacksonValueParser<T> extends JsonpDeserializerBase<T> {

        private final ObjectMapper objectMapper = new ObjectMapper();
        private final Class<T> clazz;

        protected JacksonValueParser(Class<T> clazz) {
            super(EnumSet.allOf(JsonParser.Event.class));
            this.clazz = clazz;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

            if (!(parser instanceof JacksonJsonpParser)) {
                throw new IllegalArgumentException("Jackson's ObjectMapper can only be used with the JacksonJsonpProvider");
            }

            com.fasterxml.jackson.core.JsonParser jkParser = ((JacksonJsonpParser)parser).jacksonParser();

            try {
                return objectMapper.readValue(jkParser, clazz);
            } catch(IOException ioe) {
                throw convertException(ioe);
            }
        }

        public static JsonException convertException(IOException ioe) {
            if (ioe instanceof com.fasterxml.jackson.core.JsonGenerationException) {
                return new JsonGenerationException(ioe.getMessage(), ioe);

            } else if (ioe instanceof com.fasterxml.jackson.core.JsonParseException) {
                JsonParseException jpe = (JsonParseException) ioe;
                return new JsonParsingException(ioe.getMessage(), jpe, new JacksonJsonpLocation(jpe.getLocation()));

            } else {
                return new JsonException("Jackson exception", ioe);
            }
        }
    }

    /**
     * Copied from opensearch-java because the constructor is package-protected.
     */
    private static class JacksonJsonpLocation implements JsonLocation {

        private final com.fasterxml.jackson.core.JsonLocation location;

        public JacksonJsonpLocation(com.fasterxml.jackson.core.JsonLocation location) {
            this.location = location;
        }

        JacksonJsonpLocation(com.fasterxml.jackson.core.JsonParser parser) {
            this(parser.getTokenLocation());
        }

        @Override
        public long getLineNumber() {
            return location.getLineNr();
        }

        @Override
        public long getColumnNumber() {
            return location.getColumnNr();
        }

        @Override
        public long getStreamOffset() {
            long charOffset = location.getCharOffset();
            return charOffset == -1 ? location.getByteOffset() : charOffset;
        }
    }
}
