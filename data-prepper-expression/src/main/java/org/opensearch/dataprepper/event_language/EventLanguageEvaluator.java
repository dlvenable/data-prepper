/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.opensearch.dataprepper.model.event.Event;

import java.util.List;

public interface EventLanguageEvaluator {
    void evaluate(final String program, final Event context);
}