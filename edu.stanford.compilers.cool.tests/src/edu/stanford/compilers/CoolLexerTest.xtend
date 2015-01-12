package edu.stanford.compilers

import com.google.inject.Inject
import com.google.inject.Injector
import edu.stanford.compilers.services.CoolGrammarAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@InjectWith(CoolInjectorProvider)
@RunWith(XtextRunner)
class CoolLexerTest extends AbstractLexerAndParserTest {

	@Inject
	private Injector injector

	@Inject
	private extension CoolGrammarAccess grammarAccess
	
	@Before
	override setUp() {
		super.setUp
		setInjector(injector)
	}

	@Test
	def void testDispatchExpressionInAdditionExpressionWithinConditionalExpression() {
		'''if s.b() + 4 then 8 else 0 fi'''.toString.checkTokenisation(
			"'if'", RULE_WS, RULE_ID, "'.'", RULE_ID, "'('", "')'", RULE_WS, "'+'", RULE_WS, RULE_INT, 
			RULE_WS, "'then'", RULE_WS, RULE_INT, RULE_WS, "'else'", RULE_WS, RULE_INT, RULE_WS, "'fi'"
		)
	}
	
	def RULE_ID() { 'RULE_' + IDRule.name }
	def RULE_WS() { 'RULE_' + WSRule.name }
	def RULE_INT() { 'RULE_' + INTRule.name }
}