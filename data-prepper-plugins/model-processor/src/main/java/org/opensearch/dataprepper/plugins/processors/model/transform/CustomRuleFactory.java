/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CustomRuleFactory {
    public List<Rule> createRules(List<CustomRuleConfig> configs) {
        if(configs == null)
            return Collections.emptyList();

        return configs.stream()
                .map(this::createRule)
                .collect(Collectors.toList());
    }

    private Rule createRule(CustomRuleConfig config) {
        HashSet<String> matchKeys = new HashSet<>(config.getMatchKeys());
        if(config.getType().equals("convert_to_null")) {
            String nullMarker = (String) config.getConfiguration().get("null_marker");
            return new ConvertToNullCustomRule(matchKeys, nullMarker);
        }
        throw new IllegalArgumentException("No known rule. " + config.getType());
    }
}
