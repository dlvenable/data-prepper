/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.antlr.v4.runtime.tree.ParseTree;
import org.opensearch.dataprepper.expression.ExpressionEvaluationException;
import org.opensearch.dataprepper.model.event.Event;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Public class that {@link org.opensearch.dataprepper.model.processor.Processor},
 * {@link org.opensearch.dataprepper.model.sink.Sink} and data-prepper-core objects can use to evaluate statements.
 */
@Named
class GenericEventLanguageEvaluator implements EventLanguageEvaluator {
    private final ELParser<ParseTree> parser;
    private final ELEvaluator<ParseTree, Event> evaluator;

    @Inject
    public GenericEventLanguageEvaluator(final ELParser<ParseTree> parser, final ELEvaluator<ParseTree, Event> evaluator) {
        this.parser = parser;
        this.evaluator = evaluator;
    }

    /**
     * {@inheritDoc}
     *
     * @throws ExpressionEvaluationException if unable to evaluate or coerce the statement result to type T
     */
    @Override
    public void evaluate(final String statement, final Event context) {
        try {
            final ParseTree parseTree = parser.parse(statement);
            evaluator.evaluate(parseTree, context);
        }
        catch (final Exception exception) {
            throw new ExpressionEvaluationException("Unable to evaluate statement \"" + statement + "\"", exception);
        }
    }
}
