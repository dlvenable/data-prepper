/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model;

import org.opensearch.dataprepper.metrics.PluginMetrics;
import org.opensearch.dataprepper.model.annotations.DataPrepperPlugin;
import org.opensearch.dataprepper.model.annotations.DataPrepperPluginConstructor;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.processor.AbstractProcessor;
import org.opensearch.dataprepper.model.processor.Processor;
import org.opensearch.dataprepper.model.record.Record;
import org.opensearch.dataprepper.plugins.processors.model.auto.AutoMiniProcessor;
import org.opensearch.dataprepper.plugins.processors.model.transform.TransformMiniProcessor;

import java.util.Collection;

@DataPrepperPlugin(name = "declarative_model", pluginType = Processor.class, pluginConfigurationType = ModelConfig.class)
public class ModelProcessor extends AbstractProcessor<Record<Event>, Record<Event>> {

    private final MiniProcessor miniProcessor;

    @DataPrepperPluginConstructor
    public ModelProcessor(ModelConfig modelConfig, PluginMetrics pluginMetrics) {
        super(pluginMetrics);

        if(modelConfig.getAutoType() != null) {
            miniProcessor = new AutoMiniProcessor(modelConfig.getAutoType());
        } else if(modelConfig.getOutput() != null && modelConfig.getInput() != null) {
            miniProcessor = new TransformMiniProcessor(modelConfig);
        }
        else {
            throw new IllegalArgumentException("Not configured correctly.");
        }
    }

    @Override
    public Collection<Record<Event>> doExecute(Collection<Record<Event>> records) {
        for (Record<Event> record : records) {
            Event event = record.getData();

            miniProcessor.process(event);
        }

        return records;
    }

    @Override
    public void prepareForShutdown() {

    }

    @Override
    public boolean isReadyForShutdown() {
        return false;
    }

    @Override
    public void shutdown() {

    }
}
