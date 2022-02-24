/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.sample.dataprepper.hello;

import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import com.amazon.dataprepper.model.event.Event;
import com.amazon.dataprepper.model.processor.Processor;
import com.amazon.dataprepper.model.record.Record;

import java.util.Collection;

/**
 * This sample plugin adds a field named 'hello' with a value of 'world'
 * to each Event.
 */
@DataPrepperPlugin(name = "hello", pluginType = Processor.class)
public class HelloPlugin implements Processor<Record<Event>, Record<Event>> {

    @Override
    public Collection<Record<Event>> execute(final Collection<Record<Event>> collection) {
        collection
                .forEach(eventRecord -> eventRecord.getData().put("hello", "world"));

        return collection;
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
