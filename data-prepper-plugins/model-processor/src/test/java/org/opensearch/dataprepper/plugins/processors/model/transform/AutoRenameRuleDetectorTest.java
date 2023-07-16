/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AutoRenameRuleDetectorTest {

    private AutoRenameRuleDetector createObjectUnderTest() {
        return new AutoRenameRuleDetector();
    }

    @Test
    void generateExpected() {

        JsonSchemaObject input = mock(JsonSchemaObject.class);

        when(input.getProperties()).thenReturn(
                Map.of(
                        "norename", mock(JsonSchemaObject.class),
                        "rename-dash", mock(JsonSchemaObject.class),
                        "renameupper", mock(JsonSchemaObject.class)
                )
        );

        JsonSchemaObject output = mock(JsonSchemaObject.class);
        when(output.getProperties()).thenReturn(
                Map.of(
                        "norename", mock(JsonSchemaObject.class),
                        "renameDash", mock(JsonSchemaObject.class),
                        "renameUpper", mock(JsonSchemaObject.class)
                )
        );

        List<Rule> rules = createObjectUnderTest().detectPossibleRules(input, output, null);

        assertThat(rules, notNullValue());
        assertThat(rules.size(), equalTo(2));

        assertThat(rules.get(0), instanceOf(RenameRule.class));
        RenameRule renameRule0 = (RenameRule) rules.get(0);
        assertThat(renameRule0.getInputKey(), equalTo("rename-dash"));
        assertThat(renameRule0.getOutputKey(), equalTo("renameDash"));

        assertThat(rules.get(1), instanceOf(RenameRule.class));
        RenameRule renameRule1 = (RenameRule) rules.get(1);
        assertThat(renameRule1.getInputKey(), equalTo("renameupper"));
        assertThat(renameRule1.getOutputKey(), equalTo("renameUpper"));

    }

}