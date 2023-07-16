/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;

import java.util.Set;

public class ConvertToNullCustomRule extends CustomRule {
    private final Set<String> keys;
    private final String nullMarker;

    protected ConvertToNullCustomRule(Set<String> keys, String nullMarker) {
        super(keys);
        this.keys = keys;
        this.nullMarker = nullMarker;
    }

    @Override
    public void apply(Event event, String key) {
        String value = event.get(key, String.class);
        if(value == null)
            return;

        if(value.equals(nullMarker)) {
            event.put(key, null);
        }

    }
}
