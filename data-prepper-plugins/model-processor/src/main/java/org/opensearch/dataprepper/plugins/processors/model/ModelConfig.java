/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensearch.dataprepper.plugins.processors.model.transform.CustomRuleConfig;
import org.opensearch.dataprepper.plugins.processors.model.transform.JsonSchemaObject;

import java.util.List;

public class ModelConfig {
    @JsonProperty("input")
    private JsonSchemaObject input;
    @JsonProperty("output")
    private JsonSchemaObject output;

    @JsonProperty("rules")
    private List<CustomRuleConfig> rules;

    @JsonProperty("auto_type")
    private String autoType;

    public JsonSchemaObject getInput() {
        return input;
    }

    public JsonSchemaObject getOutput() {
        return output;
    }

    public String getAutoType() {
        return autoType;
    }

    public List<CustomRuleConfig> getRules() {
        return rules;
    }
}
