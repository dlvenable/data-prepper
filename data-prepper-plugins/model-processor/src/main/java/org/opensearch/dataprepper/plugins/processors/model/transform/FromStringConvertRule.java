/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;

public class FromStringConvertRule implements Rule {

    private final String key;

    public FromStringConvertRule(String key /* TODO: Support multiple target types */) {

        this.key = key;
    }

    @Override
    public boolean matches(String key) {
        return this.key.equals(key);
    }

    @Override
    public void apply(Event event, String key) {
        String stringValue = event.get(this.key, String.class);

        if(stringValue == null)
            return;

        Integer intValue = Integer.valueOf(stringValue);

        event.put(this.key, intValue);

    }
}
