/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.auto;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.plugins.processors.model.MiniProcessor;

public class AutoMiniProcessor implements MiniProcessor {

    private final AutoConverter autoConverter;

    public AutoMiniProcessor(String autoType) {
        autoConverter = new AutoConverterFactory().getAutoConverter(autoType);

    }

    @Override
    public void process(Event event) {
        autoConverter.convertEvent(event);
    }
}
