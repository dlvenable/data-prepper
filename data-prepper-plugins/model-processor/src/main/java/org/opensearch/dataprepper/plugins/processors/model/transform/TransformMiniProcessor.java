/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.plugins.processors.model.MiniProcessor;
import org.opensearch.dataprepper.plugins.processors.model.ModelConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformMiniProcessor implements MiniProcessor {

    private final List<Rule> allRules;

    public TransformMiniProcessor(ModelConfig modelConfig) {


        CustomRuleFactory customRuleFactory = new CustomRuleFactory();
        AutoRuleGenerator autoRuleGenerator = new AutoRuleGenerator();


        List<Rule> customRules = customRuleFactory.createRules(modelConfig.getRules());
        allRules = new ArrayList<>(customRules);

        List<Rule> autoRules = autoRuleGenerator.generate(modelConfig.getInput(), modelConfig.getOutput());
        allRules.addAll(autoRules);
    }

    @Override
    public void process(Event event) {

        // Quick hack!!!
        // This deletes the s3 key for the demo. There should be a better way.
        event.delete("s3");

        for (String key : event.keys()) {
            List<Rule> applicableRules = allRules.stream().filter(rule -> rule.matches(key))
                    .collect(Collectors.toList());

            applicableRules.stream().forEach(rule -> rule.apply(event, key));
        }


    }
}
