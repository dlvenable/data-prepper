/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.opensearch.dataprepper.expression.ParserErrorListener;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageLexer;
import org.opensearch.dataprepper.expression.antlr.DataPrepperEventLanguageParser;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;

@Named
public class ELParseTreeConfiguration {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DataPrepperEventLanguageParser dataPrepperEventLanguageParser() {
        final ParserErrorListener errorListener = new ParserErrorListener();

        final CodePointCharStream stream = CharStreams.fromString("");
        final DataPrepperEventLanguageLexer lexer = new DataPrepperEventLanguageLexer(stream);
        lexer.addErrorListener(errorListener);

        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final DataPrepperEventLanguageParser parser = new DataPrepperEventLanguageParser(tokenStream);
        parser.addErrorListener(errorListener);

        return parser;
    }
}
