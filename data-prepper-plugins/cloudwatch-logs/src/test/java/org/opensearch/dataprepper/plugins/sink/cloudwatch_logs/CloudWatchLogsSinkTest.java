/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink.cloudwatch_logs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.opensearch.dataprepper.aws.api.AwsCredentialsSupplier;
import org.opensearch.dataprepper.metrics.PluginMetrics;
import org.opensearch.dataprepper.model.plugin.PluginFactory;
import org.opensearch.dataprepper.model.configuration.PluginSetting;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.JacksonEvent;
import org.opensearch.dataprepper.model.record.Record;
import org.opensearch.dataprepper.plugins.sink.cloudwatch_logs.client.CloudWatchLogsClientFactory;
import org.opensearch.dataprepper.plugins.sink.cloudwatch_logs.client.CloudWatchLogsMetrics;
import org.opensearch.dataprepper.plugins.sink.cloudwatch_logs.config.AwsConfig;
import org.opensearch.dataprepper.plugins.sink.cloudwatch_logs.config.CloudWatchLogsSinkConfig;
import org.opensearch.dataprepper.plugins.sink.cloudwatch_logs.config.ThresholdConfig;
import software.amazon.awssdk.services.cloudwatchlogs.CloudWatchLogsClient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CloudWatchLogsSinkTest {
    private PluginSetting mockPluginSetting;
    private PluginMetrics mockPluginMetrics;
    private PluginFactory mockPluginFactory;
    private CloudWatchLogsSinkConfig mockCloudWatchLogsSinkConfig;
    private AwsCredentialsSupplier mockCredentialSupplier;
    private AwsConfig mockAwsConfig;
    private ThresholdConfig thresholdConfig;
    private Map<String, String> mockHeaderOverrides;
    private CloudWatchLogsMetrics mockCloudWatchLogsMetrics;
    private CloudWatchLogsClient mockClient;
    private static final String TEST_LOG_GROUP = "testLogGroup";
    private static final String TEST_LOG_STREAM= "testLogStream";
    private static final String TEST_PLUGIN_NAME = "testPluginName";
    private static final String TEST_PIPELINE_NAME = "testPipelineName";
    private static final String TEST_BUFFER_TYPE = "in_memory";
    @BeforeEach
    void setUp() {
        mockPluginSetting = mock(PluginSetting.class);
        mockPluginMetrics = mock(PluginMetrics.class);
        mockPluginFactory = mock(PluginFactory.class);
        mockCloudWatchLogsSinkConfig = mock(CloudWatchLogsSinkConfig.class);
        mockCredentialSupplier = mock(AwsCredentialsSupplier.class);
        mockAwsConfig = mock(AwsConfig.class);
        thresholdConfig = new ThresholdConfig();
        mockHeaderOverrides = new HashMap<>();
        mockHeaderOverrides.put("X-Test-Header", "test-value");
        mockCloudWatchLogsMetrics = mock(CloudWatchLogsMetrics.class);
        mockClient = mock(CloudWatchLogsClient.class);

        when(mockCloudWatchLogsSinkConfig.getAwsConfig()).thenReturn(mockAwsConfig);
        when(mockCloudWatchLogsSinkConfig.getThresholdConfig()).thenReturn(thresholdConfig);
        when(mockCloudWatchLogsSinkConfig.getHeaderOverrides()).thenReturn(new HashMap<>());
        when(mockCloudWatchLogsSinkConfig.getLogGroup()).thenReturn(TEST_LOG_GROUP);
        when(mockCloudWatchLogsSinkConfig.getLogStream()).thenReturn(TEST_LOG_STREAM);
        when(mockCloudWatchLogsSinkConfig.getMaxRetries()).thenReturn(3);
        when(mockCloudWatchLogsSinkConfig.getWorkers()).thenReturn(10);

        when(mockPluginSetting.getName()).thenReturn(TEST_PLUGIN_NAME);
        when(mockPluginSetting.getPipelineName()).thenReturn(TEST_PIPELINE_NAME);
    }

    CloudWatchLogsSink getTestCloudWatchSink() {
        return new CloudWatchLogsSink(mockPluginSetting, mockPluginMetrics, mockPluginFactory, mockCloudWatchLogsSinkConfig,
                mockCredentialSupplier);
    }

    Collection<Record<Event>> getMockedRecords() {
        Collection<Record<Event>> testCollection = new ArrayList<>();
        Record<Event> mockedEvent = new Record<>(JacksonEvent.fromMessage(""));
        Record<Event> spyEvent = spy(mockedEvent);

        testCollection.add(spyEvent);

        return testCollection;
    }

    @Test
    void WHEN_sink_is_initialized_THEN_sink_is_ready_returns_true() {
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            testCloudWatchSink.doInitialize();
            assertTrue(testCloudWatchSink.isReady());
        }
    }

    @Test
    void WHEN_awsConfig_and_awsCredentialsSupplier_null_THEN_should_throw() {
        mockCredentialSupplier = null;
        when(mockCloudWatchLogsSinkConfig.getAwsConfig()).thenReturn(null);
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            assertThrows(RuntimeException.class, ()-> getTestCloudWatchSink());
        }
    }

    @Test
    void WHEN_given_sample_empty_records_THEN_records_are_processed() {
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            testCloudWatchSink.doInitialize();
            Collection<Record<Event>> spyEvents = getMockedRecords();

            testCloudWatchSink.doOutput(spyEvents);

            for (Record<Event> spyEvent : spyEvents) {
                verify(spyEvent, atLeast(1)).getData();
            }
        }
    }

    @Test
    void WHEN_given_sample_empty_records_THEN_records_are_not_processed() {
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            testCloudWatchSink.doInitialize();
            Collection<Record<Event>> spyEvents = spy(ArrayList.class);

            assertTrue(spyEvents.isEmpty());

            testCloudWatchSink.doOutput(spyEvents);
            verify(spyEvents, times(2)).isEmpty();
        }
    }

    @Test
    void WHEN_header_overrides_is_empty_THEN_empty_map_is_passed_to_client_factory() {
        Map<String, String> emptyHeaders = new HashMap<>();
        when(mockCloudWatchLogsSinkConfig.getHeaderOverrides()).thenReturn(emptyHeaders);
        
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            
            mockedStatic.verify(() -> CloudWatchLogsClientFactory.createCwlClient(
                    eq(mockAwsConfig), 
                    eq(mockCredentialSupplier), 
                    eq(emptyHeaders)));
        }
    }

    @Test
    void WHEN_header_overrides_is_provided_THEN_headers_are_passed_to_client_factory() {
        when(mockCloudWatchLogsSinkConfig.getHeaderOverrides()).thenReturn(mockHeaderOverrides);
        
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            
            mockedStatic.verify(() -> CloudWatchLogsClientFactory.createCwlClient(
                    eq(mockAwsConfig), 
                    eq(mockCredentialSupplier), 
                    eq(mockHeaderOverrides)));
        }
    }

    @Test
    void WHEN_sink_initialization_with_header_overrides_THEN_sink_is_ready() {
        when(mockCloudWatchLogsSinkConfig.getHeaderOverrides()).thenReturn(mockHeaderOverrides);
        
        try(MockedStatic<CloudWatchLogsClientFactory> mockedStatic = mockStatic(CloudWatchLogsClientFactory.class)) {
            mockedStatic.when(() -> CloudWatchLogsClientFactory.createCwlClient(any(AwsConfig.class),
                            any(AwsCredentialsSupplier.class), any()))
                    .thenReturn(mockClient);

            CloudWatchLogsSink testCloudWatchSink = getTestCloudWatchSink();
            testCloudWatchSink.doInitialize();
            
            assertTrue(testCloudWatchSink.isReady());
        }
    }
}