/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import java.util.List;

public interface RuleDetector {
    List<Rule> detectPossibleRules(JsonSchemaObject input, JsonSchemaObject output, List<Rule> existingRules);
}
