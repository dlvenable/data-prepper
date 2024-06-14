/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.mutateevent;

import org.opensearch.dataprepper.expression.ExpressionEvaluator;
import org.opensearch.dataprepper.metrics.PluginMetrics;
import org.opensearch.dataprepper.model.annotations.DataPrepperPlugin;
import org.opensearch.dataprepper.model.annotations.DataPrepperPluginConstructor;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.EventKey;
import org.opensearch.dataprepper.model.event.EventKeyFactory;
import org.opensearch.dataprepper.model.processor.AbstractProcessor;
import org.opensearch.dataprepper.model.processor.Processor;
import org.opensearch.dataprepper.model.record.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static org.opensearch.dataprepper.logging.DataPrepperMarkers.EVENT;

@DataPrepperPlugin(name = "rename_keys", pluginType = Processor.class, pluginConfigurationType = RenameKeyProcessorConfig.class)
public class RenameKeyProcessor extends AbstractProcessor<Record<Event>, Record<Event>> {

    private static final Logger LOG = LoggerFactory.getLogger(RenameKeyProcessor.class);
    private final List<RenameKeyProcessorConfig.Entry> entries;

    private final ExpressionEvaluator expressionEvaluator;
    private final List<RenameEntry> renameEntries;

    private static class RenameEntry {
        RenameKeyProcessorConfig.Entry configEntry;
        EventKey fromEventKey;
        EventKey toEventKey;
    }

    @DataPrepperPluginConstructor
    public RenameKeyProcessor(
            final RenameKeyProcessorConfig config,
            final EventKeyFactory eventKeyFactory,
            final ExpressionEvaluator expressionEvaluator,
            final PluginMetrics pluginMetrics) {
        super(pluginMetrics);
        this.entries = config.getEntries();
        this.expressionEvaluator = expressionEvaluator;

        renameEntries = new ArrayList<>();
        for (final RenameKeyProcessorConfig.Entry entry : entries) {
            final String fromKey = entry.getFromKey();
            final String toKey = entry.getToKey();
            //if(fromKey.equals(toKey))
            //    continue;

            final RenameEntry renameEntry = new RenameEntry();
            renameEntry.configEntry = entry;
            renameEntry.fromEventKey = eventKeyFactory.createEventKey(fromKey, EventKeyFactory.EventAction.GET, EventKeyFactory.EventAction.DELETE);
            renameEntry.toEventKey = eventKeyFactory.createEventKey(toKey);

            renameEntries.add(renameEntry);
        }

    }

    @Override
    public Collection<Record<Event>> doExecute(final Collection<Record<Event>> records) {
        for(final Record<Event> record : records) {
            final Event recordEvent = record.getData();

            try {

                for (final RenameEntry entry : renameEntries) {
                    if (Objects.nonNull(entry.configEntry.getRenameWhen()) && !expressionEvaluator.evaluateConditional(entry.configEntry.getRenameWhen(), recordEvent)) {
                        continue;
                    }

                    if (entry.fromEventKey.getKey().equals(entry.toEventKey.getKey()) || !recordEvent.containsKey(entry.fromEventKey)) {
                        continue;
                    }

                    if (!recordEvent.containsKey(entry.toEventKey) || entry.configEntry.getOverwriteIfToKeyExists()) {
                        final Object source = recordEvent.get(entry.fromEventKey, Object.class);
                        recordEvent.put(entry.toEventKey, source);
                        recordEvent.delete(entry.fromEventKey);
                    }
                }
            } catch (final Exception e) {
                LOG.error(EVENT, "There was an exception while processing Event [{}]", recordEvent, e);
            }
        }

        return records;
    }

    @Override
    public void prepareForShutdown() {
    }

    @Override
    public boolean isReadyForShutdown() {
        return true;
    }

    @Override
    public void shutdown() {
    }
}
