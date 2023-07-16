/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AutoConvertRuleDetector implements RuleDetector {
    @Override
    public List<Rule> detectPossibleRules(JsonSchemaObject input, JsonSchemaObject output, List<Rule> existingRules) {

        // Problem: If a value has been renamed, we don't know that rule is there.
        // Hack solution: Check against existingRules. That is why I added this parameter at all.
        // Longer-term solution: Build a graph dynamically as rules are applied.

        List<Rule> rules = new ArrayList<>();
        for (Map.Entry<String, JsonSchemaObject> nameToObject : input.getProperties().entrySet()) {
            String inputKey = nameToObject.getKey();

            String outputKey = inputKey;
            for (Rule existingRule : existingRules) {
                if(existingRule.matches(outputKey)) {
                    // TODO: This is definitely a hack.
                    RenameRule renameRule = (RenameRule) existingRule;

                    outputKey = renameRule.getOutputKey();

                } else {
                    outputKey = outputKey;
                }

            }


            JsonSchemaObject outputSchemaObject = output.getProperties().get(outputKey);
            if(outputSchemaObject != null) {
                String outputType = outputSchemaObject.getType();
                String inputType = nameToObject.getValue().getType();

                if(!outputType.equals(inputType)) {
                    Rule rule = createConversionRule(outputKey, nameToObject.getValue(), outputSchemaObject);
                    rules.add(rule);
                } else {
                    createFormatConversionRule(outputKey, nameToObject.getValue(), outputSchemaObject)
                            .ifPresent(rules::add);
                }
            }

        }


        return rules;
    }

    private Rule createConversionRule(String key, JsonSchemaObject input, JsonSchemaObject output) {
        if(input.getType().equals("string")) {
            String inputFormat = input.getFormat();

            if(inputFormat.equals(output.getType())) {
                return new FromStringConvertRule(key);
            }
        }
        throw new IllegalArgumentException("Unable to convert. key=" + key);
    }

    private Optional<Rule> createFormatConversionRule(String key, JsonSchemaObject input, JsonSchemaObject output) {
        if(input.getType().equals("string")) {
            String inputFormat = input.getFormat();

            // TODO: This also is too rigid. The input type could be "integer". We'd still want to convert.
            if("date-time".equals(output.getFormat()) && "epoch-seconds".equals(inputFormat)) {
                return Optional.of(new DateConvertRule(key, DateConvertRule.DateType.EPOCH_SECONDS, DateConvertRule.DateType.DATE_TIME));
            } else if("ipaddr".equals(output.getFormat())) {
                return Optional.of(new IpAddressConvertRule(key));
            }
        }
        return Optional.empty();
    }
}
