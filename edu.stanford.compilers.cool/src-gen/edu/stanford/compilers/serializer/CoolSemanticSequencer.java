package edu.stanford.compilers.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.stanford.compilers.cool.Attr;
import edu.stanford.compilers.cool.BlockExpression;
import edu.stanford.compilers.cool.BooleanLiteral;
import edu.stanford.compilers.cool.Case;
import edu.stanford.compilers.cool.CaseExpression;
import edu.stanford.compilers.cool.Class_;
import edu.stanford.compilers.cool.CompareExpression;
import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.DispatchExpression;
import edu.stanford.compilers.cool.Div;
import edu.stanford.compilers.cool.Expression;
import edu.stanford.compilers.cool.Formal;
import edu.stanford.compilers.cool.IdentifierRefExpression;
import edu.stanford.compilers.cool.LetDeclaration;
import edu.stanford.compilers.cool.LetExpression;
import edu.stanford.compilers.cool.LoopExpression;
import edu.stanford.compilers.cool.Method;
import edu.stanford.compilers.cool.Minus;
import edu.stanford.compilers.cool.Multi;
import edu.stanford.compilers.cool.NewExpression;
import edu.stanford.compilers.cool.NumberLiteral;
import edu.stanford.compilers.cool.Plus;
import edu.stanford.compilers.cool.Program;
import edu.stanford.compilers.cool.SelfTypeLiteral;
import edu.stanford.compilers.cool.StringLiteral;
import edu.stanford.compilers.services.CoolGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CoolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CoolGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CoolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CoolPackage.ATTR:
				if(context == grammarAccess.getAttrRule() ||
				   context == grammarAccess.getFeature_Rule() ||
				   context == grammarAccess.getIdentifiableElementRule()) {
					sequence_Attr(context, (Attr) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.BLOCK_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getBlockExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_BlockExpression(context, (BlockExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CASE_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_CaseExpression(context, (CaseExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CLASS_:
				if(context == grammarAccess.getClass_Rule() ||
				   context == grammarAccess.getIdentifiableElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class_(context, (Class_) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_CompareExpression(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.DISPATCH_EXPRESSION:
				if(context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_DispatchExpression(context, (DispatchExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.DIV:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_AssignmentExpression_ConditionalExpression_IntegerComposite_IsvoidExpression_NegationExpression_ParenExpression_PrimaryExpression_StaticDispatchExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssignmentExpressionRule()) {
					sequence_AssignmentExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionalExpressionRule()) {
					sequence_ConditionalExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIntegerCompositeRule()) {
					sequence_IntegerComposite(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIsvoidExpressionRule()) {
					sequence_IsvoidExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNegationExpressionRule()) {
					sequence_NegationExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParenExpressionRule()) {
					sequence_ParenExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStaticDispatchExpressionRule()) {
					sequence_StaticDispatchExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.FORMAL:
				if(context == grammarAccess.getFormalRule() ||
				   context == grammarAccess.getIdentifiableElementRule()) {
					sequence_Formal(context, (Formal) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.IDENTIFIER_REF_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRefExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_IdentifierRefExpression(context, (IdentifierRefExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.LET_DECLARATION:
				if(context == grammarAccess.getIdentifiableElementRule() ||
				   context == grammarAccess.getLetDeclarationRule()) {
					sequence_LetDeclaration(context, (LetDeclaration) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.LET_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLetExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_LetExpression(context, (LetExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.LOOP_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLoopExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_LoopExpression(context, (LoopExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.METHOD:
				if(context == grammarAccess.getFeature_Rule() ||
				   context == grammarAccess.getIdentifiableElementRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.MINUS:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_AdditionExpression(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.MULTI:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.NEW_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getNewExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_NewExpression(context, (NewExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.PLUS:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_AdditionExpression(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.SELF_TYPE_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSelfTypeLiteralRule()) {
					sequence_SelfTypeLiteral(context, (SelfTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getPlusOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionExprAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiOpAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (op=AdditionExpression_Minus_1_0_0_1_0 right=Expression)
	 */
	protected void sequence_AdditionExpression(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=AdditionExpression_Plus_1_0_0_0_0 right=Expression)
	 */
	protected void sequence_AdditionExpression(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (pred=Expression then_exp=Expression else_exp=Expression) | 
	 *         expr=Expression | 
	 *         (name=SYMBOL expr=Expression) | 
	 *         expr=Expression | 
	 *         expr=Expression | 
	 *         expr=Expression | 
	 *         (ref=IdentifierRefExpression (actual+=Expression actual+=Expression*)?)
	 *     )
	 */
	protected void sequence_AssignmentExpression_ConditionalExpression_IntegerComposite_IsvoidExpression_NegationExpression_ParenExpression_PrimaryExpression_StaticDispatchExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL expr=Expression)
	 */
	protected void sequence_AssignmentExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL type_decl=[Type|ID] init=Expression?)
	 */
	protected void sequence_Attr(EObject context, Attr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body+=Expression*)
	 */
	protected void sequence_BlockExpression(EObject context, BlockExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression case+=Case+)
	 */
	protected void sequence_CaseExpression(EObject context, CaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL type_decl=[Type|ID] expr=Expression)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.CASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.CASE__NAME));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.CASE__TYPE_DECL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.CASE__TYPE_DECL));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.CASE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.CASE__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getNameSYMBOLParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCaseAccess().getType_declTypeIDTerminalRuleCall_2_0_1(), semanticObject.getType_decl());
		feeder.accept(grammarAccess.getCaseAccess().getExprExpressionParserRuleCall_4_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL parent=[Type|ID]? features+=Feature_*)
	 */
	protected void sequence_Class_(EObject context, Class_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CompareExpression_CompareExpression_1_0_0_0 op=CompareOperator right=Expression)
	 */
	protected void sequence_CompareExpression(EObject context, CompareExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pred=Expression then_exp=Expression else_exp=Expression)
	 */
	protected void sequence_ConditionalExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (expr=DispatchExpression_DispatchExpression_1_0_0_0 type_name=[Type|ID]? ref=IdentifierRefExpression) | 
	 *             (expr=DispatchExpression_DispatchExpression_1_0_0_0 ref=IdentifierRefExpression)
	 *         ) 
	 *         (actual+=Expression actual+=Expression*)?
	 *     )
	 */
	protected void sequence_DispatchExpression(EObject context, DispatchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL type_decl=[Type|ID])
	 */
	protected void sequence_Formal(EObject context, Formal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.IDENTIFIABLE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.IDENTIFIABLE_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.FORMAL__TYPE_DECL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.FORMAL__TYPE_DECL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalAccess().getNameSYMBOLParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormalAccess().getType_declTypeIDTerminalRuleCall_2_0_1(), semanticObject.getType_decl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=[IdentifiableElement|ID]
	 */
	protected void sequence_IdentifierRefExpression(EObject context, IdentifierRefExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_IntegerComposite(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_IsvoidExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL type_decl=[Type|ID] init=Expression?)
	 */
	protected void sequence_LetDeclaration(EObject context, LetDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=LetDeclaration+ body=Expression)
	 */
	protected void sequence_LetExpression(EObject context, LetExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pred=Expression body=Expression)
	 */
	protected void sequence_LoopExpression(EObject context, LoopExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL (formals+=Formal formals+=Formal*)? return_type=[Type|ID] expr=Expression)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=MultiplicationExpression_Div_1_0_0_1_0 right=Expression)
	 */
	protected void sequence_MultiplicationExpression(EObject context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=MultiplicationExpression_Multi_1_0_0_0_0 right=Expression)
	 */
	protected void sequence_MultiplicationExpression(EObject context, Multi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_NegationExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type_name=[Type|ID]
	 */
	protected void sequence_NewExpression(EObject context, NewExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_ParenExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     classes+=Class_*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SelfTypeLiteral}
	 */
	protected void sequence_SelfTypeLiteral(EObject context, SelfTypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=IdentifierRefExpression (actual+=Expression actual+=Expression*)?)
	 */
	protected void sequence_StaticDispatchExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
