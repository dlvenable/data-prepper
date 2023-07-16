/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.auto;

import org.opensearch.dataprepper.model.event.Event;

public interface AutoConverter {
    void convertEvent(Event event);
}
