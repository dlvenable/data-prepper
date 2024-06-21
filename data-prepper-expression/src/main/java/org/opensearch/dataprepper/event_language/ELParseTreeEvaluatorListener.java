/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.opensearch.dataprepper.expression.ExpressionEvaluationException;
import org.opensearch.dataprepper.expression.Operator;
import org.opensearch.dataprepper.expression.OperatorProvider;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageBaseListener;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageListener;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageParser;
import org.opensearch.dataprepper.model.event.Event;

import java.util.Stack;

/**
 * @since 1.3
 * This listener implements {@link DataPrepperEventLanguageListener} to provide callbacks to handle evaluation of
 * {@link org.antlr.v4.runtime.tree.ParseTree} representation of an expression while {@link org.antlr.v4.runtime.tree.ParseTreeWalker}
 * traverses through the {@link org.antlr.v4.runtime.tree.ParseTree}.
 *
 * Use case:
 * ParseTreeWalker walker = new ParseTreeWalker();
 * ParseTreeEvaluatorListener listener = new ParseTreeEvaluatorListener(...);
 * walker.walk(listener, ...);
 * final Object result = listener.getResult();
 */
class ELParseTreeEvaluatorListener extends DataPrepperEventLanguageBaseListener {

    private final OperatorProvider operatorProvider;
    private final ELParseTreeCoercionService coercionService;
    private final Stack<Integer> operatorSymbolStack;
    private final Stack<Object> operandStack;
    private final Event event;

    public ELParseTreeEvaluatorListener(final OperatorProvider operatorProvider,
                                        final ELParseTreeCoercionService coercionService,
                                        final Event event) {
        this.coercionService = coercionService;
        this.operatorProvider = operatorProvider;
        this.event = event;
        operatorSymbolStack = new Stack<>();
        operandStack = new Stack<>();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        final int nodeType = node.getSymbol().getType();
        if (nodeType == DataPrepperEventLanguageParser.EOF) {
            return;
        }
        if (operatorProvider.containsOperator(nodeType) || nodeType == DataPrepperEventLanguageParser.LPAREN) {
            operatorSymbolStack.push(nodeType);
        } else if (nodeType == DataPrepperEventLanguageParser.RPAREN) {
            // pop LPAREN at operatorSymbolStack top
            operatorSymbolStack.pop();
        } else {
            final Object arg = coercionService.coercePrimaryTerminalNode(node, event);
            operandStack.push(arg);
        }
    }

    @Override
    public void enterAssignment(DataPrepperEventLanguageParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(DataPrepperEventLanguageParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
        performAssignment(ctx);
    }

    @Override
    public void enterAssignmentOperator(DataPrepperEventLanguageParser.AssignmentOperatorContext ctx) {
        super.enterAssignmentOperator(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        throw new RuntimeException("Hit error node in the parse tree: " + node.getText());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if (!operatorSymbolStack.isEmpty()) {
            final int operatorSymbol = operatorSymbolStack.peek();
            if (operatorSymbol != DataPrepperEventLanguageParser.LPAREN) {
                if(operatorSymbol == DataPrepperEventLanguageParser.ASSIGN) {
                    //performAssignment(ctx);
                } else {
                    final Operator<?> op = operatorProvider.getOperator(operatorSymbol);
                    if (op.shouldEvaluate(ctx)) {
                        operatorSymbolStack.pop();
                        try {
                            performSingleOperation(op, ctx);
                        } catch (final Exception e) {
                            throw new ExpressionEvaluationException("Unable to evaluate the part of input statement: "
                                    + getPartialStatementFromContext(ctx), e);
                        }
                    }
                }
            }
        }
    }

    private void performAssignment(ParserRuleContext ctx) {
        performSingleOperation(new Operator<Void>() {
            @Override
            public boolean shouldEvaluate(RuleContext ctx) {
                return true;
            }

            @Override
            public int getSymbol() {
                return 0;
            }

            @Override
            public Void evaluate(Object... args) {
                String leftHand = (String) args[0];
                Object assignment = args[1];
                event.put(leftHand, assignment);
                return null;
            }
        }, ctx);
    }

    private void performSingleOperation(final Operator<?> operator, final ParserRuleContext ctx) {
        final int numOfArgs = operator.getNumberOfOperands(ctx);
        final Object[] args = new Object[numOfArgs];
        for (int i = numOfArgs - 1; i >= 0; i--) {
            args[i] = operandStack.pop();
        }
        final Object result = operator.evaluate(args);
        operandStack.push(result);
    }

    private String getPartialStatementFromContext(final ParserRuleContext ctx) {
        final Token startToken = ctx.getStart();
        final Token stopToken = ctx.getStop();
        final String fullStatement = startToken.getInputStream().toString();
        return fullStatement.substring(startToken.getStartIndex(), stopToken.getStopIndex() + 1);
    }
}
