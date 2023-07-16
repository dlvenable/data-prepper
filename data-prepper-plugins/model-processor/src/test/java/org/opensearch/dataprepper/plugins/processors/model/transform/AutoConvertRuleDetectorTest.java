/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AutoConvertRuleDetectorTest {

    private AutoConvertRuleDetector createObjectUnderTest() {
        return new AutoConvertRuleDetector();
    }

    @Test
    void createRules() {
        JsonSchemaObject input = mock(JsonSchemaObject.class);
        when(input.getProperties()).thenReturn(
                Map.of(
                        "renamedInput", mock(JsonSchemaObject.class),
                        "samename", mock(JsonSchemaObject.class),
                        "noconvert", mock(JsonSchemaObject.class)
                )
        );


        JsonSchemaObject renamedInputSchema = input.getProperties().get("renamedInput");
        when(renamedInputSchema.getType()).thenReturn("string");
        when(renamedInputSchema.getFormat()).thenReturn("integer");
        JsonSchemaObject samenameInputSchema = input.getProperties().get("samename");
        when(samenameInputSchema.getType()).thenReturn("string");
        when(samenameInputSchema.getFormat()).thenReturn("integer");
        JsonSchemaObject noconvertInputSchema = input.getProperties().get("noconvert");
        when(noconvertInputSchema.getType()).thenReturn("string");

        JsonSchemaObject output = mock(JsonSchemaObject.class);
        when(output.getProperties()).thenReturn(
                Map.of(
                        "renamed", mock(JsonSchemaObject.class),
                        "samename", mock(JsonSchemaObject.class),
                        "noconvert", mock(JsonSchemaObject.class)
                )
        );

        JsonSchemaObject renamedOutputSchema = output.getProperties().get("renamed");
        when(renamedOutputSchema.getType()).thenReturn("integer");
        JsonSchemaObject samenameOutputSchema = output.getProperties().get("samename");
        when(samenameOutputSchema.getType()).thenReturn("integer");
        JsonSchemaObject noconvertOutputSchema = output.getProperties().get("noconvert");
        when(noconvertOutputSchema.getType()).thenReturn("string");

        List<Rule> existingRules = new ArrayList<>();
        RenameRule renameRule = mock(RenameRule.class);
        when(renameRule.matches("renamedInput")).thenReturn(true);
        when(renameRule.getInputKey()).thenReturn("renamedInput");
        when(renameRule.getOutputKey()).thenReturn("renamed");
        existingRules.add(renameRule);

        List<Rule> createdRules = createObjectUnderTest().detectPossibleRules(input, output, existingRules);

        assertThat(createdRules, notNullValue());
        assertThat(createdRules.size(), equalTo(2));

        assertThat(createdRules.get(0), instanceOf(FromStringConvertRule.class));
        assertThat(createdRules.get(0).matches("renamed"), equalTo(true));
        assertThat(createdRules.get(1), instanceOf(FromStringConvertRule.class));
        assertThat(createdRules.get(1).matches("samename"), equalTo(true));
    }

}