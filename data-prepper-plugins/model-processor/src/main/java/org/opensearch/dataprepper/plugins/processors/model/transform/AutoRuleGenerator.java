/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.ArrayList;
import java.util.List;

public class AutoRuleGenerator {

    private final List<RuleDetector> ruleDetectors;

    public AutoRuleGenerator() {
        ruleDetectors = List.of(
                new AutoRenameRuleDetector(),
                new AutoConvertRuleDetector()
        );
    }
    List<Rule> generate(JsonSchemaObject input, JsonSchemaObject output) {

        List<Rule> allAutoRules = new ArrayList<>();
        for (RuleDetector ruleDetector : ruleDetectors) {
            List<Rule> newRules = ruleDetector.detectPossibleRules(input, output, allAutoRules);
            allAutoRules.addAll(newRules);
        }


        return allAutoRules;
    }
}
