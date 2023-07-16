/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AutoRenameRuleDetector implements RuleDetector {
    @Override
    public List<Rule> detectPossibleRules(JsonSchemaObject input, JsonSchemaObject output, List<Rule> existingRules) {
        Map<String, String> normalizedInputNames = normalized(input.getProperties().keySet());
        Map<String, String> normalizedOutputNames = normalized(output.getProperties().keySet());

        List<Rule> rules = new ArrayList<>();

        for (String normalizedOutput : normalizedOutputNames.keySet()) {
            if(normalizedInputNames.containsKey(normalizedOutput)) {
                String actualInput = normalizedInputNames.get(normalizedOutput);
                String actualOutput = normalizedOutputNames.get(normalizedOutput);

                if(!actualInput.equals(actualOutput)) {
                    RenameRule renameRule = new RenameRule(
                            actualInput,
                            actualOutput);
                    rules.add(renameRule);
                }
            } else {
                // TODO: This should be done in a graph that can apply all rules. For later...
                throw new IllegalArgumentException("Unable to find a rule to get property " + normalizedOutput + " from input schema.");
            }
        }


        return rules;
    }

    private static Map<String, String> normalized(Set<String> inputs) {
        Map<String, String> normalizedMap = new HashMap<>();

        for (String propertyName : inputs) {
            String normalized = propertyName.toLowerCase()
                    .replaceAll("-", "")
                    .replaceAll("_", "");

            normalizedMap.put(normalized, propertyName);
        }

        return normalizedMap;
    }


}
