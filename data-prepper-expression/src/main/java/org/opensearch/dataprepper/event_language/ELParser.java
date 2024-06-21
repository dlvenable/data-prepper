/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.opensearch.dataprepper.expression.ParseTreeCompositeException;

public interface ELParser<T> {
    T parse(final String expression) throws ParseTreeCompositeException;
}
