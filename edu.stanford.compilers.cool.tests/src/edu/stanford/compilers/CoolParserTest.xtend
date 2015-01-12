package edu.stanford.compilers

import com.google.inject.Inject
import com.google.inject.Injector
import edu.stanford.compilers.cool.AdditionExpression
import edu.stanford.compilers.cool.ConditionalExpression
import edu.stanford.compilers.cool.DispatchExpression
import edu.stanford.compilers.cool.Expression
import edu.stanford.compilers.cool.NumberLiteral
import edu.stanford.compilers.services.CoolGrammarAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@InjectWith(CoolInjectorProvider)
@RunWith(XtextRunner)
class CoolParserTest extends AbstractLexerAndParserTest {
	
	@Inject
	private Injector injector

	@Inject
	private CoolGrammarAccess grammarAccess
	
	@Before
	override setUp() {
		super.setUp
		setInjector(injector)
	}
	
	@Test
	def void testDispatchExpressionInAdditionExpressionWithinConditionalExpression() {
		val result = '''if s.b() + 4 then 8 else 0 fi'''.toString.getParseResult(grammarAccess.conditionalExpressionRule.name)
		val root = result.rootASTElement
		Assert.assertTrue(root instanceof Expression)
		if(root instanceof ConditionalExpression) {
			Assert.assertTrue(root.pred instanceof AdditionExpression)
			val plus = root.pred as AdditionExpression
			Assert.assertTrue(plus.left instanceof DispatchExpression)
			Assert.assertTrue(plus.right instanceof NumberLiteral)
		}
	}
}