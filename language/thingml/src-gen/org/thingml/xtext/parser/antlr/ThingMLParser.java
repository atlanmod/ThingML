/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.thingml.xtext.parser.antlr.internal.InternalThingMLParser;
import org.thingml.xtext.services.ThingMLGrammarAccess;

public class ThingMLParser extends AbstractAntlrParser {

	@Inject
	private ThingMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalThingMLParser createParser(XtextTokenStream stream) {
		return new InternalThingMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ThingMLModel";
	}

	public ThingMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ThingMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}