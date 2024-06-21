/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.event_language;

import org.opensearch.dataprepper.event_language.EventLanguageEvaluator;
import org.opensearch.dataprepper.model.annotations.DataPrepperPlugin;
import org.opensearch.dataprepper.model.annotations.DataPrepperPluginConstructor;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.processor.Processor;
import org.opensearch.dataprepper.model.record.Record;

import java.util.Collection;

@DataPrepperPlugin(name = "set_on_you", pluginType = Processor.class, pluginConfigurationType = SetOnYouConfig.class)
public class SetOnYouProcessor implements Processor<Record<Event>, Record<Event>> {
    private final String program;
    private final EventLanguageEvaluator expressionEvaluator;

    @DataPrepperPluginConstructor
    public SetOnYouProcessor(
            final SetOnYouConfig config,
            final EventLanguageEvaluator expressionEvaluator) {
        program = config.getProgram();
        this.expressionEvaluator = expressionEvaluator;
    }

    @Override
    public Collection<Record<Event>> execute(final Collection<Record<Event>> records) {
        records.stream()
                .map(Record::getData)
                .forEach(event -> expressionEvaluator.evaluate(program, event));

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
