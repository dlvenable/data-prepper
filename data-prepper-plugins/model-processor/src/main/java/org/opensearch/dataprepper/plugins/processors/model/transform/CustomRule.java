/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.Set;

public abstract class CustomRule implements Rule {

    private final Set<String> keys;

    protected CustomRule(Set<String> keys) {
        this.keys = keys;
    }

    @Override
    public boolean matches(String key) {
        return keys.contains(key);
    }
}
