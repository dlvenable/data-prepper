/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.metrics.PluginMetrics;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.JacksonEvent;
import org.opensearch.dataprepper.model.record.Record;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

class ModelProcessor_TransformTest {

    private ModelConfig modelConfig;
    private PluginMetrics pluginMetrics;

    @BeforeEach
    void setUp() {
        pluginMetrics = mock(PluginMetrics.class);
    }

    private ModelProcessor createObjectUnderTest() {
        return new ModelProcessor(modelConfig, pluginMetrics);
    }

    private void setModelConfigToTarget(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        InputStream yamlInputStream = this.getClass().getResourceAsStream(fileName);

        this.modelConfig = objectMapper.readValue(yamlInputStream, ModelConfig.class);
    }


    @Test
    void testIteration1() throws IOException {
        setModelConfigToTarget("vpc-flow-log-iteration1.yaml");

        ModelProcessor objectUnderTest = createObjectUnderTest();

        List<Map<String, String>> eventData = List.of(
                Map.of(
                        "version", "2",
                        "account-id", "123456789012",
                        "interface-id", "-",
                        "srcport", "20987",
                        "dstport", "443"
                )
        );

        List<Record<Event>> records = eventData.stream()
                .map(data -> JacksonEvent.builder()
                        .withEventType("DOCUMENT")
                        .withData(data)
                        .build())
                .map(jacksonEvent -> (Event) jacksonEvent)
                .map(Record::new)
                .collect(Collectors.toList());

        Collection<Record<Event>> output = objectUnderTest.doExecute(records);

        assertThat(output, sameInstance(records));

        assertThat(output.size(), equalTo(1));

        Record<Event> firstRecord = output.iterator().next();
        assertThat(firstRecord, notNullValue());
        assertThat(firstRecord.getData(), notNullValue());
        assertThat(firstRecord.getData().get("version", Integer.class), equalTo(2));
        assertThat(firstRecord.getData().get("accountId", String.class), equalTo("123456789012"));
        assertThat(firstRecord.getData().get("interfaceId", String.class), equalTo("-"));
        assertThat(firstRecord.getData().get("srcport", Integer.class), equalTo(20987));
        assertThat(firstRecord.getData().get("dstport", Integer.class), equalTo(443));
    }

    @Test
    void testIteration2_with_non_null() throws IOException {
        setModelConfigToTarget("vpc-flow-log-iteration2.yaml");

        ModelProcessor objectUnderTest = createObjectUnderTest();

        List<Map<String, String>> eventData = List.of(
                Map.of(
                        "version", "2",
                        "account-id", "123456789012",
                        "interface-id", "eni-abc12345",
                        "srcport", "20987",
                        "dstport", "443"
                )
        );

        List<Record<Event>> records = eventData.stream()
                .map(data -> JacksonEvent.builder()
                        .withEventType("DOCUMENT")
                        .withData(data)
                        .build())
                .map(jacksonEvent -> (Event) jacksonEvent)
                .map(Record::new)
                .collect(Collectors.toList());

        Collection<Record<Event>> output = objectUnderTest.doExecute(records);

        assertThat(output, sameInstance(records));

        assertThat(output.size(), equalTo(1));

        Record<Event> firstRecord = output.iterator().next();
        assertThat(firstRecord, notNullValue());
        assertThat(firstRecord.getData(), notNullValue());
        assertThat(firstRecord.getData().get("version", Integer.class), equalTo(2));
        assertThat(firstRecord.getData().get("accountId", String.class), equalTo("123456789012"));
        assertThat(firstRecord.getData().get("interfaceId", String.class), equalTo("eni-abc12345"));
        assertThat(firstRecord.getData().get("srcport", Integer.class), equalTo(20987));
        assertThat(firstRecord.getData().get("dstport", Integer.class), equalTo(443));
    }

    @Test
    void testIteration2_with_null_values() throws IOException {
        setModelConfigToTarget("vpc-flow-log-iteration2.yaml");

        ModelProcessor objectUnderTest = createObjectUnderTest();

        List<Map<String, String>> eventData = List.of(
                Map.of(
                        "version", "2",
                        "account-id", "123456789012",
                        "interface-id", "-",
                        "srcport", "-",
                        "dstport", "443"
                )
        );

        List<Record<Event>> records = eventData.stream()
                .map(data -> JacksonEvent.builder()
                        .withEventType("DOCUMENT")
                        .withData(data)
                        .build())
                .map(jacksonEvent -> (Event) jacksonEvent)
                .map(Record::new)
                .collect(Collectors.toList());

        Collection<Record<Event>> output = objectUnderTest.doExecute(records);

        assertThat(output, sameInstance(records));

        assertThat(output.size(), equalTo(1));

        Record<Event> firstRecord = output.iterator().next();
        assertThat(firstRecord, notNullValue());
        assertThat(firstRecord.getData(), notNullValue());
        assertThat(firstRecord.getData().get("version", Integer.class), equalTo(2));
        assertThat(firstRecord.getData().get("accountId", String.class), equalTo("123456789012"));
        assertThat(firstRecord.getData().get("interfaceId", String.class), nullValue());
        assertThat(firstRecord.getData().get("srcport", Integer.class), nullValue());
        assertThat(firstRecord.getData().get("dstport", Integer.class), equalTo(443));
    }


    @Test
    void testIteration3() throws IOException {
        setModelConfigToTarget("vpc-flow-log-iteration3.yaml");

        ModelProcessor objectUnderTest = createObjectUnderTest();

        List<Map<String, String>> eventData = List.of(
                Map.of(
                        "version", "2",
                        "account-id", "123456789012",
                        "interface-id", "eni-abc12345",
                        "srcport", "20987",
                        "dstport", "443",
                        "srcaddr", "192.40.30.100",
                        "dstaddr", "10.0.0.13",
                        "start", "1689370731",
                        "end", "1689370734"
                )
        );

        List<Record<Event>> records = eventData.stream()
                .map(data -> JacksonEvent.builder()
                        .withEventType("DOCUMENT")
                        .withData(data)
                        .build())
                .map(jacksonEvent -> (Event) jacksonEvent)
                .map(Record::new)
                .collect(Collectors.toList());

        Collection<Record<Event>> output = objectUnderTest.doExecute(records);

        assertThat(output, sameInstance(records));

        assertThat(output.size(), equalTo(1));

        Record<Event> firstRecord = output.iterator().next();
        assertThat(firstRecord, notNullValue());
        assertThat(firstRecord.getData(), notNullValue());
        assertThat(firstRecord.getData().get("version", Integer.class), equalTo(2));
        assertThat(firstRecord.getData().get("accountId", String.class), equalTo("123456789012"));
        assertThat(firstRecord.getData().get("interfaceId", String.class), equalTo("eni-abc12345"));
        assertThat(firstRecord.getData().get("srcport", Integer.class), equalTo(20987));
        assertThat(firstRecord.getData().get("dstport", Integer.class), equalTo(443));
        assertThat(firstRecord.getData().get("srcaddr", String.class), equalTo("192.40.30.100"));
        assertThat(firstRecord.getData().get("dstaddr", String.class), equalTo("10.0.0.13"));
        assertThat(firstRecord.getData().get("start", String.class), equalTo("2023-07-14T21:38:51Z"));
        assertThat(firstRecord.getData().get("end", String.class), equalTo("2023-07-14T21:38:54Z"));
    }

}