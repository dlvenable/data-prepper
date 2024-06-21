/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

grammar DataPrepperEventLanguage;

import DataPrepperExpression;

program : statement+;

statement
    : expressionStatement
    | ifStatement
    ;

expressionStatement
    : assignment STATEMENT_END
    ;

assignment
    : leftHandSide assignmentOperator expression
    ;

leftHandSide
    : jsonPointer
    ;

assignmentOperator
    : ASSIGN
    ;

ifStatement : 'if' LPAREN conditionalExpression RPAREN LBRACE statement+ RBRACE ('else' LBRACE statement+ RBRACE)?;

ASSIGN : '=';
STATEMENT_END : ';';
