/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model;

import org.opensearch.dataprepper.model.event.Event;

/**
 * As this processor is supporting a few different concepts, this
 * provides an abstraction for how to process any given {@link Event}.
 */
public interface MiniProcessor {
    void process(Event event);
}
