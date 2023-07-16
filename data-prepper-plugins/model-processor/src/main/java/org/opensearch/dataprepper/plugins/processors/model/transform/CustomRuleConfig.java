/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class CustomRuleConfig {
    private String type;

    @JsonProperty("match_keys")
    private List<String> matchKeys;

    @JsonAnySetter
    private Map<String, Object> configuration;

    public String getType() {
        return type;
    }

    public List<String> getMatchKeys() {
        return matchKeys;
    }

    public Map<String, Object> getConfiguration() {
        return configuration;
    }
}
