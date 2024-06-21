/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.opensearch.dataprepper.expression.ExpressionEvaluationException;
import org.opensearch.dataprepper.expression.OperatorProvider;
import org.opensearch.dataprepper.expression.ParseTreeCoercionService;
import org.opensearch.dataprepper.model.event.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
class ELParseTreeEvaluator implements ELEvaluator<ParseTree, Event> {
    private static final Logger LOG = LoggerFactory.getLogger(ELParseTreeEvaluator.class);

    private final OperatorProvider operatorProvider;
    private final ParseTreeWalker walker;
    private final ELParseTreeCoercionService coercionService;

    @Inject
    public ELParseTreeEvaluator(final OperatorProvider operatorProvider, final ParseTreeWalker walker,
                                final ELParseTreeCoercionService coercionService) {
        this.operatorProvider = operatorProvider;
        this.walker = walker;
        this.coercionService = coercionService;
    }

    @Override
    public void evaluate(ParseTree parseTree, Event event) {
        try {
            final ELParseTreeEvaluatorListener listener = new ELParseTreeEvaluatorListener(operatorProvider, coercionService, event);
            walker.walk(listener, parseTree);
        } catch (final Exception e) {
            LOG.error("Unable to evaluate event", e);
            throw new ExpressionEvaluationException(e.getMessage(), e);
        }
    }
}
