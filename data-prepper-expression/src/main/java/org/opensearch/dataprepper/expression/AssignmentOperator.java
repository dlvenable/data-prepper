/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.expression;

import org.antlr.v4.runtime.RuleContext;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageParser;
import org.opensearch.dataprepper.expression.antlr.DataPrepperExpressionParser;
import org.opensearch.dataprepper.model.event.Event;

import static com.google.common.base.Preconditions.checkArgument;

class AssignmentOperator implements Operator<Void>, NeedsEventOperator {
    private static final int SYMBOL = DataPrepperEventLanguageParser.ASSIGN;
    private static final String DISPLAY_NAME = DataPrepperEventLanguageParser.VOCABULARY
            .getDisplayName(DataPrepperEventLanguageParser.ASSIGN);

    @Override
    public int getNumberOfOperands(final RuleContext ctx) {
        return 2;
    }

    @Override
    public boolean shouldEvaluate(final RuleContext ctx) {
        return ctx.getRuleIndex() == DataPrepperEventLanguageParser.RULE_assignment;
    }

    @Override
    public int getSymbol() {
        return SYMBOL;
    }

    @Override
    public Void evaluate(final Object ... args) {
        checkArgument(args.length == 3, DISPLAY_NAME + " requires operands length to be 2.");
        checkArgument(args[0] instanceof Event, DISPLAY_NAME + " requires operand to be Event.");
        Event event = (Event) args[0];
        String leftHand = (String) args[1];
        Object assignment = args[2];
        event.put(leftHand, assignment);
        return null;
    }
}
