/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;

public class RenameRule implements Rule {
    private final String inputKey;
    private final String outputKey;

    public RenameRule(String inputKey, String outputKey) {
        this.inputKey = inputKey;
        this.outputKey = outputKey;
    }

    @Override
    public boolean matches(String key) {
        return this.inputKey.equals(key);
    }

    @Override
    public void apply(Event event, String key) {

        Object value = event.get(inputKey, Object.class);
        event.delete(inputKey);
        event.put(outputKey, value);

    }

    public String getInputKey() {
        return inputKey;
    }

    public String getOutputKey() {
        return outputKey;
    }
}
