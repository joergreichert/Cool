package edu.stanford.compilers

import com.google.inject.Inject
import edu.stanford.compilers.cool.CoolPackage
import edu.stanford.compilers.cool.DispatchExpression
import edu.stanford.compilers.cool.Method
import edu.stanford.compilers.cool.Program
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import edu.stanford.compilers.cool.CaseExpression

@InjectWith(CoolInjectorProvider)
@RunWith(XtextRunner)
class CoolScopeTest {

	@Inject
	private extension ParseHelper<Program>

	@Inject
	private IScopeProvider scopeProvider

	@Test
	def void testScopeAtDispatchExpression() {
		val result = testdataDispatchExpression.parse
		val dispatchExpressionRef = (result.classes.head.features.filter(Method).filter[name == "a"].head.expr as DispatchExpression).ref
		val scope = scopeProvider.getScope(dispatchExpressionRef, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID).allElements.map[name].sort
		Assert.assertEquals("[a, abort, b, copy, type_name]", scope.toString)
	}	
	
	def private testdataDispatchExpression() '''
		class A {
			
			a(s : A) : String {
				s.b()
			};
			b() : String {
				
			};
		};
	'''

	@Test
	def void testScopeAtLiteral() {
		val result = testdataLiteral.parse
		val dispatchExpressionRef = (result.classes.head.features.filter(Method).filter[name == "a"].head.expr as DispatchExpression).ref
		val scope = scopeProvider.getScope(dispatchExpressionRef, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID).allElements.map[name].sort
		Assert.assertEquals("[abort, concat, copy, length, substr, type_name]", scope.toString)
	}	
	
	def private testdataLiteral() '''
		class A {
			
			a() : String {
				"".length()
			};
		};
	'''
	
	@Test
	def void testScopeInCase() {
		val result = testdataCase.parse
		val firstCaseExprRef = ((result.classes.head.features.filter(Method).filter[name == "a"].head.expr as CaseExpression).^case.head.expr as DispatchExpression).ref
		val scope = scopeProvider.getScope(firstCaseExprRef, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID).allElements.map[name].sort
		Assert.assertEquals("[a, abort, b, c, copy, type_name]", scope.toString)
	}	

	def private testdataCase() '''
		class A {
			
			a() : String {
		         case avar of
		           c1 : A => c1.b(c1.c());
		         esac 
			};
			b(c : String) : String {
				""
			};
			c() : String {
				""
			};
		};
	'''
	
	@Test
	def void testScopeChained() {
		val result = testdataChained.parse
		val firstCaseExprRef = (result.classes.head.features.filter(Method).filter[name == "a"].head.expr as DispatchExpression).ref
		val scope = scopeProvider.getScope(firstCaseExprRef, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID).allElements.map[name].sort
		Assert.assertEquals("[abort, copy, in_int, in_string, out_int, out_string, type_name]", scope.toString)
	}	

	def private testdataChained() '''
		class A inherits IO {
			
			a() : String {
				out_string("title: ").out_string(title).out_string("\n")
			};
		};
	'''
	
	
}