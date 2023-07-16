/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.Map;

public class JsonSchemaObject {
    private String type;
    private String format;
    private Map<String, JsonSchemaObject> properties;

    public String getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    public Map<String, JsonSchemaObject> getProperties() {
        return properties;
    }
}
