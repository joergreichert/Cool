package edu.stanford.compilers.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.stanford.compilers.cool.AdditionExpression;
import edu.stanford.compilers.cool.AssignmentExpression;
import edu.stanford.compilers.cool.Attr;
import edu.stanford.compilers.cool.BlockExpression;
import edu.stanford.compilers.cool.BooleanLiteral;
import edu.stanford.compilers.cool.Case;
import edu.stanford.compilers.cool.CaseExpression;
import edu.stanford.compilers.cool.Class_;
import edu.stanford.compilers.cool.CompareExpression;
import edu.stanford.compilers.cool.ConditionalExpression;
import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.DispatchExpression;
import edu.stanford.compilers.cool.Div;
import edu.stanford.compilers.cool.Formal;
import edu.stanford.compilers.cool.IdentifierRefExpression;
import edu.stanford.compilers.cool.IntegerCompositeExpression;
import edu.stanford.compilers.cool.IsvoidExpression;
import edu.stanford.compilers.cool.LetDeclaration;
import edu.stanford.compilers.cool.LetExpression;
import edu.stanford.compilers.cool.LoopExpression;
import edu.stanford.compilers.cool.Method;
import edu.stanford.compilers.cool.Minus;
import edu.stanford.compilers.cool.MultiplicationExpression;
import edu.stanford.compilers.cool.NegationExpression;
import edu.stanford.compilers.cool.NewExpression;
import edu.stanford.compilers.cool.NumberLiteral;
import edu.stanford.compilers.cool.ParenExpression;
import edu.stanford.compilers.cool.Program;
import edu.stanford.compilers.cool.SelfTypeLiteral;
import edu.stanford.compilers.cool.StaticDispatchExpression;
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
			case CoolPackage.ADDITION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_AdditionExpression(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_AssignmentExpression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else break;
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
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getBlockExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_BlockExpression(context, (BlockExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CASE:
				if(context == grammarAccess.getCaseRule() ||
				   context == grammarAccess.getIdentifiableElementRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CASE_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCaseExpressionRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
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
				   context == grammarAccess.getExpressionRule()) {
					sequence_CompareExpression(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.DISPATCH_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0()) {
					sequence_DispatchExpression(context, (DispatchExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.DIV:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (Div) semanticObject); 
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
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRefExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_IdentifierRefExpression(context, (IdentifierRefExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.INTEGER_COMPOSITE_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntegerCompositeExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_IntegerCompositeExpression(context, (IntegerCompositeExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.ISVOID_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIsvoidExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_IsvoidExpression(context, (IsvoidExpression) semanticObject); 
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
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLetExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_LetExpression(context, (LetExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.LOOP_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLoopExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
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
				   context == grammarAccess.getExpressionRule()) {
					sequence_AdditionExpression(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.MULTIPLICATION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.NEGATION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getNegationExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_NegationExpression(context, (NegationExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.NEW_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getNewExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_NewExpression(context, (NewExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.PAREN_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getParenExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_ParenExpression(context, (ParenExpression) semanticObject); 
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
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSelfTypeLiteralRule()) {
					sequence_SelfTypeLiteral(context, (SelfTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.STATIC_DISPATCH_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getStaticDispatchExpressionRule()) {
					sequence_StaticDispatchExpression(context, (StaticDispatchExpression) semanticObject); 
					return; 
				}
				else break;
			case CoolPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDispatchExpressionRule() ||
				   context == grammarAccess.getDispatchExpressionAccess().getDispatchExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0() ||
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
	 *     (left=AdditionExpression_AdditionExpression_1_0_0_0_0 right=Expression)
	 */
	protected void sequence_AdditionExpression(EObject context, AdditionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.ADDITION_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.ADDITION_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.ADDITION_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.ADDITION_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=AdditionExpression_Minus_1_0_0_1_0 right=Expression)
	 */
	protected void sequence_AdditionExpression(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.MINUS__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.MINUS__OP));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionExpressionAccess().getMinusOpAction_1_0_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAdditionExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SYMBOL expr=Expression)
	 */
	protected void sequence_AssignmentExpression(EObject context, AssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.ASSIGNMENT_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.ASSIGNMENT_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.ASSIGNMENT_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.ASSIGNMENT_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentExpressionAccess().getNameSYMBOLParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentExpressionAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.IDENTIFIABLE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.IDENTIFIABLE_ELEMENT__NAME));
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.COMPARE_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareExpressionAccess().getOpCompareOperatorParserRuleCall_1_0_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getCompareExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pred=Expression then_exp=Expression else_exp=Expression?)
	 */
	protected void sequence_ConditionalExpression(EObject context, ConditionalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (left=DispatchExpression_DispatchExpression_1_0_0_0 type_name=[Type|ID]? ref=IdentifierRefExpression) | 
	 *             (left=DispatchExpression_DispatchExpression_1_0_0_0 ref=IdentifierRefExpression)
	 *         ) 
	 *         (actual+=Expression actual+=Expression*)? 
	 *         chain=StaticDispatchExpression?
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.IDENTIFIER_REF_EXPRESSION__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierRefExpressionAccess().getIdIdentifiableElementIDTerminalRuleCall_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_IntegerCompositeExpression(EObject context, IntegerCompositeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.INTEGER_COMPOSITE_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.INTEGER_COMPOSITE_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerCompositeExpressionAccess().getExprExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_IsvoidExpression(EObject context, IsvoidExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.ISVOID_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.ISVOID_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsvoidExpressionAccess().getExprExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
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
	 *     (declaration+=LetDeclaration declaration+=LetDeclaration* body=Expression)
	 */
	protected void sequence_LetExpression(EObject context, LetExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pred=Expression body=Expression)
	 */
	protected void sequence_LoopExpression(EObject context, LoopExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.LOOP_EXPRESSION__PRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.LOOP_EXPRESSION__PRED));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.LOOP_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.LOOP_EXPRESSION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoopExpressionAccess().getPredExpressionParserRuleCall_1_0(), semanticObject.getPred());
		feeder.accept(grammarAccess.getLoopExpressionAccess().getBodyExpressionParserRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.DIV__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.DIV__OP));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getDivOpAction_1_0_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationExpression_MultiplicationExpression_1_0_0_0_0 right=Expression)
	 */
	protected void sequence_MultiplicationExpression(EObject context, MultiplicationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.MULTIPLICATION_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.MULTIPLICATION_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.MULTIPLICATION_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.MULTIPLICATION_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_NegationExpression(EObject context, NegationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.NEGATION_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.NEGATION_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationExpressionAccess().getExprExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type_name=[Type|ID]
	 */
	protected void sequence_NewExpression(EObject context, NewExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.NEW_EXPRESSION__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.NEW_EXPRESSION__TYPE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewExpressionAccess().getType_nameTypeIDTerminalRuleCall_1_0_1(), semanticObject.getType_name());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_ParenExpression(EObject context, ParenExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.PAREN_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.PAREN_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParenExpressionAccess().getExprExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
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
	 *     (ref=IdentifierRefExpression (actual+=Expression actual+=Expression*)? chain=StaticDispatchExpression?)
	 */
	protected void sequence_StaticDispatchExpression(EObject context, StaticDispatchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CoolPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoolPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
