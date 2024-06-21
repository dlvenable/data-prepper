/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

public interface ELEvaluator<ParsedData, Context> {
    void evaluate(final ParsedData parsedData, final Context context) throws ClassCastException;
}
