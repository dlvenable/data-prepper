/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink;

import org.opensearch.dataprepper.model.event.Event;

import java.io.IOException;

public interface Codec {
    String parse(Event event) throws IOException;
}
