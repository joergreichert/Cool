/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.stanford.compilers.cool.CoolFactory
 * @model kind="package"
 * @generated
 */
public interface CoolPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cool";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.stanford.edu/compilers/Cool";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cool";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoolPackage eINSTANCE = edu.stanford.compilers.cool.impl.CoolPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.ProgramImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CLASSES = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.TypeImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getType()
   * @generated
   */
  int TYPE = 28;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.Class_Impl <em>Class </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.Class_Impl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getClass_()
   * @generated
   */
  int CLASS_ = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS___NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS___PARENT = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS___FEATURES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Class </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.IdentifiableElementImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIdentifiableElement()
   * @generated
   */
  int IDENTIFIABLE_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIABLE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Identifiable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.Feature_Impl <em>Feature </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.Feature_Impl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getFeature_()
   * @generated
   */
  int FEATURE_ = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE___NAME = IDENTIFIABLE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Feature </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.AttrImpl <em>Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.AttrImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAttr()
   * @generated
   */
  int ATTR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__NAME = FEATURE___NAME;

  /**
   * The feature id for the '<em><b>Type decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__TYPE_DECL = FEATURE__FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__INIT = FEATURE__FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_FEATURE_COUNT = FEATURE__FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.MethodImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = FEATURE___NAME;

  /**
   * The feature id for the '<em><b>Formals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__FORMALS = FEATURE__FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = FEATURE__FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EXPR = FEATURE__FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = FEATURE__FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.FormalImpl <em>Formal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.FormalImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getFormal()
   * @generated
   */
  int FORMAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL__NAME = IDENTIFIABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL__TYPE_DECL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.ExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.PrimaryExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.SelfTypeLiteralImpl <em>Self Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.SelfTypeLiteralImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getSelfTypeLiteral()
   * @generated
   */
  int SELF_TYPE_LITERAL = 8;

  /**
   * The number of structural features of the '<em>Self Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_TYPE_LITERAL_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.IdentifierRefExpressionImpl <em>Identifier Ref Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.IdentifierRefExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIdentifierRefExpression()
   * @generated
   */
  int IDENTIFIER_REF_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REF_EXPRESSION__ID = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier Ref Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REF_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.LiteralImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 10;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.NumberLiteralImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.StringLiteralImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.BooleanLiteralImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.ParenExpressionImpl <em>Paren Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.ParenExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getParenExpression()
   * @generated
   */
  int PAREN_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paren Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.AssignmentExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__NAME = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.NegationExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNegationExpression()
   * @generated
   */
  int NEGATION_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.IntegerCompositeExpressionImpl <em>Integer Composite Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.IntegerCompositeExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIntegerCompositeExpression()
   * @generated
   */
  int INTEGER_COMPOSITE_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_COMPOSITE_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Composite Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_COMPOSITE_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.NewExpressionImpl <em>New Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.NewExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNewExpression()
   * @generated
   */
  int NEW_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Type name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION__TYPE_NAME = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl <em>Dispatch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.DispatchExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getDispatchExpression()
   * @generated
   */
  int DISPATCH_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION__REF = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION__ACTUAL = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION__CHAIN = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION__LEFT = PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION__TYPE_NAME = PRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Dispatch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPATCH_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.ConditionalExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getConditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__PRED = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__THEN_EXP = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ELSE_EXP = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.LoopExpressionImpl <em>Loop Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.LoopExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLoopExpression()
   * @generated
   */
  int LOOP_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_EXPRESSION__PRED = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_EXPRESSION__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.BlockExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getBlockExpression()
   * @generated
   */
  int BLOCK_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_EXPRESSION__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.IsvoidExpressionImpl <em>Isvoid Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.IsvoidExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIsvoidExpression()
   * @generated
   */
  int ISVOID_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISVOID_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Isvoid Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISVOID_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.LetExpressionImpl <em>Let Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.LetExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLetExpression()
   * @generated
   */
  int LET_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPRESSION__DECLARATION = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPRESSION__BODY = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Let Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.LetDeclarationImpl <em>Let Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.LetDeclarationImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLetDeclaration()
   * @generated
   */
  int LET_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECLARATION__NAME = IDENTIFIABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECLARATION__TYPE_DECL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECLARATION__INIT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Let Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_DECLARATION_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.CaseExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__EXPR = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CASE = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.CaseImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCase()
   * @generated
   */
  int CASE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__NAME = IDENTIFIABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__TYPE_DECL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__EXPR = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.CompareExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCompareExpression()
   * @generated
   */
  int COMPARE_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compare Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.AdditionExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAdditionExpression()
   * @generated
   */
  int ADDITION_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.MinusImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 32;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.MultiplicationExpressionImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMultiplicationExpression()
   * @generated
   */
  int MULTIPLICATION_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.stanford.compilers.cool.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.stanford.compilers.cool.impl.DivImpl
   * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getDiv()
   * @generated
   */
  int DIV = 34;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see edu.stanford.compilers.cool.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.Program#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see edu.stanford.compilers.cool.Program#getClasses()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Classes();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Class_ <em>Class </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class </em>'.
   * @see edu.stanford.compilers.cool.Class_
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.Class_#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see edu.stanford.compilers.cool.Class_#getParent()
   * @see #getClass_()
   * @generated
   */
  EReference getClass__Parent();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.Class_#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see edu.stanford.compilers.cool.Class_#getFeatures()
   * @see #getClass_()
   * @generated
   */
  EReference getClass__Features();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Feature_ <em>Feature </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature </em>'.
   * @see edu.stanford.compilers.cool.Feature_
   * @generated
   */
  EClass getFeature_();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Attr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr</em>'.
   * @see edu.stanford.compilers.cool.Attr
   * @generated
   */
  EClass getAttr();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.Attr#getType_decl <em>Type decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type decl</em>'.
   * @see edu.stanford.compilers.cool.Attr#getType_decl()
   * @see #getAttr()
   * @generated
   */
  EReference getAttr_Type_decl();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Attr#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see edu.stanford.compilers.cool.Attr#getInit()
   * @see #getAttr()
   * @generated
   */
  EReference getAttr_Init();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see edu.stanford.compilers.cool.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.Method#getFormals <em>Formals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formals</em>'.
   * @see edu.stanford.compilers.cool.Method#getFormals()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Formals();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.Method#getReturn_type <em>Return type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return type</em>'.
   * @see edu.stanford.compilers.cool.Method#getReturn_type()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Return_type();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Method#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.Method#getExpr()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Formal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal</em>'.
   * @see edu.stanford.compilers.cool.Formal
   * @generated
   */
  EClass getFormal();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.Formal#getType_decl <em>Type decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type decl</em>'.
   * @see edu.stanford.compilers.cool.Formal#getType_decl()
   * @see #getFormal()
   * @generated
   */
  EReference getFormal_Type_decl();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see edu.stanford.compilers.cool.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see edu.stanford.compilers.cool.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.SelfTypeLiteral <em>Self Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Type Literal</em>'.
   * @see edu.stanford.compilers.cool.SelfTypeLiteral
   * @generated
   */
  EClass getSelfTypeLiteral();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.IdentifierRefExpression <em>Identifier Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Ref Expression</em>'.
   * @see edu.stanford.compilers.cool.IdentifierRefExpression
   * @generated
   */
  EClass getIdentifierRefExpression();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.IdentifierRefExpression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see edu.stanford.compilers.cool.IdentifierRefExpression#getId()
   * @see #getIdentifierRefExpression()
   * @generated
   */
  EReference getIdentifierRefExpression_Id();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see edu.stanford.compilers.cool.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see edu.stanford.compilers.cool.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.stanford.compilers.cool.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see edu.stanford.compilers.cool.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.stanford.compilers.cool.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see edu.stanford.compilers.cool.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.stanford.compilers.cool.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.ParenExpression <em>Paren Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paren Expression</em>'.
   * @see edu.stanford.compilers.cool.ParenExpression
   * @generated
   */
  EClass getParenExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.ParenExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.ParenExpression#getExpr()
   * @see #getParenExpression()
   * @generated
   */
  EReference getParenExpression_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see edu.stanford.compilers.cool.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.AssignmentExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.stanford.compilers.cool.AssignmentExpression#getName()
   * @see #getAssignmentExpression()
   * @generated
   */
  EAttribute getAssignmentExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.AssignmentExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.AssignmentExpression#getExpr()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation Expression</em>'.
   * @see edu.stanford.compilers.cool.NegationExpression
   * @generated
   */
  EClass getNegationExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.NegationExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.NegationExpression#getExpr()
   * @see #getNegationExpression()
   * @generated
   */
  EReference getNegationExpression_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.IntegerCompositeExpression <em>Integer Composite Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Composite Expression</em>'.
   * @see edu.stanford.compilers.cool.IntegerCompositeExpression
   * @generated
   */
  EClass getIntegerCompositeExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.IntegerCompositeExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.IntegerCompositeExpression#getExpr()
   * @see #getIntegerCompositeExpression()
   * @generated
   */
  EReference getIntegerCompositeExpression_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.NewExpression <em>New Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Expression</em>'.
   * @see edu.stanford.compilers.cool.NewExpression
   * @generated
   */
  EClass getNewExpression();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.NewExpression#getType_name <em>Type name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type name</em>'.
   * @see edu.stanford.compilers.cool.NewExpression#getType_name()
   * @see #getNewExpression()
   * @generated
   */
  EReference getNewExpression_Type_name();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.DispatchExpression <em>Dispatch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dispatch Expression</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression
   * @generated
   */
  EClass getDispatchExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.DispatchExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression#getRef()
   * @see #getDispatchExpression()
   * @generated
   */
  EReference getDispatchExpression_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.DispatchExpression#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actual</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression#getActual()
   * @see #getDispatchExpression()
   * @generated
   */
  EReference getDispatchExpression_Actual();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.DispatchExpression#getChain <em>Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chain</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression#getChain()
   * @see #getDispatchExpression()
   * @generated
   */
  EReference getDispatchExpression_Chain();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.DispatchExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression#getLeft()
   * @see #getDispatchExpression()
   * @generated
   */
  EReference getDispatchExpression_Left();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.DispatchExpression#getType_name <em>Type name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type name</em>'.
   * @see edu.stanford.compilers.cool.DispatchExpression#getType_name()
   * @see #getDispatchExpression()
   * @generated
   */
  EReference getDispatchExpression_Type_name();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression</em>'.
   * @see edu.stanford.compilers.cool.ConditionalExpression
   * @generated
   */
  EClass getConditionalExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.ConditionalExpression#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see edu.stanford.compilers.cool.ConditionalExpression#getPred()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Pred();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.ConditionalExpression#getThen_exp <em>Then exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then exp</em>'.
   * @see edu.stanford.compilers.cool.ConditionalExpression#getThen_exp()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Then_exp();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.ConditionalExpression#getElse_exp <em>Else exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else exp</em>'.
   * @see edu.stanford.compilers.cool.ConditionalExpression#getElse_exp()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Else_exp();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.LoopExpression <em>Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Expression</em>'.
   * @see edu.stanford.compilers.cool.LoopExpression
   * @generated
   */
  EClass getLoopExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.LoopExpression#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see edu.stanford.compilers.cool.LoopExpression#getPred()
   * @see #getLoopExpression()
   * @generated
   */
  EReference getLoopExpression_Pred();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.LoopExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see edu.stanford.compilers.cool.LoopExpression#getBody()
   * @see #getLoopExpression()
   * @generated
   */
  EReference getLoopExpression_Body();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.BlockExpression <em>Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Expression</em>'.
   * @see edu.stanford.compilers.cool.BlockExpression
   * @generated
   */
  EClass getBlockExpression();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.BlockExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see edu.stanford.compilers.cool.BlockExpression#getBody()
   * @see #getBlockExpression()
   * @generated
   */
  EReference getBlockExpression_Body();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.IsvoidExpression <em>Isvoid Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Isvoid Expression</em>'.
   * @see edu.stanford.compilers.cool.IsvoidExpression
   * @generated
   */
  EClass getIsvoidExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.IsvoidExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.IsvoidExpression#getExpr()
   * @see #getIsvoidExpression()
   * @generated
   */
  EReference getIsvoidExpression_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.LetExpression <em>Let Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Expression</em>'.
   * @see edu.stanford.compilers.cool.LetExpression
   * @generated
   */
  EClass getLetExpression();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.LetExpression#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see edu.stanford.compilers.cool.LetExpression#getDeclaration()
   * @see #getLetExpression()
   * @generated
   */
  EReference getLetExpression_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.LetExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see edu.stanford.compilers.cool.LetExpression#getBody()
   * @see #getLetExpression()
   * @generated
   */
  EReference getLetExpression_Body();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.LetDeclaration <em>Let Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Declaration</em>'.
   * @see edu.stanford.compilers.cool.LetDeclaration
   * @generated
   */
  EClass getLetDeclaration();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.LetDeclaration#getType_decl <em>Type decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type decl</em>'.
   * @see edu.stanford.compilers.cool.LetDeclaration#getType_decl()
   * @see #getLetDeclaration()
   * @generated
   */
  EReference getLetDeclaration_Type_decl();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.LetDeclaration#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see edu.stanford.compilers.cool.LetDeclaration#getInit()
   * @see #getLetDeclaration()
   * @generated
   */
  EReference getLetDeclaration_Init();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see edu.stanford.compilers.cool.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.CaseExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.CaseExpression#getExpr()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link edu.stanford.compilers.cool.CaseExpression#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case</em>'.
   * @see edu.stanford.compilers.cool.CaseExpression#getCase()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Case();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see edu.stanford.compilers.cool.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the reference '{@link edu.stanford.compilers.cool.Case#getType_decl <em>Type decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type decl</em>'.
   * @see edu.stanford.compilers.cool.Case#getType_decl()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Type_decl();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Case#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.stanford.compilers.cool.Case#getExpr()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Expr();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see edu.stanford.compilers.cool.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.IdentifiableElement <em>Identifiable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifiable Element</em>'.
   * @see edu.stanford.compilers.cool.IdentifiableElement
   * @generated
   */
  EClass getIdentifiableElement();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.IdentifiableElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.stanford.compilers.cool.IdentifiableElement#getName()
   * @see #getIdentifiableElement()
   * @generated
   */
  EAttribute getIdentifiableElement_Name();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expression</em>'.
   * @see edu.stanford.compilers.cool.CompareExpression
   * @generated
   */
  EClass getCompareExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.CompareExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.stanford.compilers.cool.CompareExpression#getLeft()
   * @see #getCompareExpression()
   * @generated
   */
  EReference getCompareExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.stanford.compilers.cool.CompareExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.stanford.compilers.cool.CompareExpression#getOp()
   * @see #getCompareExpression()
   * @generated
   */
  EAttribute getCompareExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.CompareExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.stanford.compilers.cool.CompareExpression#getRight()
   * @see #getCompareExpression()
   * @generated
   */
  EReference getCompareExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Expression</em>'.
   * @see edu.stanford.compilers.cool.AdditionExpression
   * @generated
   */
  EClass getAdditionExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.AdditionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.stanford.compilers.cool.AdditionExpression#getLeft()
   * @see #getAdditionExpression()
   * @generated
   */
  EReference getAdditionExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.AdditionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.stanford.compilers.cool.AdditionExpression#getRight()
   * @see #getAdditionExpression()
   * @generated
   */
  EReference getAdditionExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see edu.stanford.compilers.cool.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Minus#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see edu.stanford.compilers.cool.Minus#getOp()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.stanford.compilers.cool.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Expression</em>'.
   * @see edu.stanford.compilers.cool.MultiplicationExpression
   * @generated
   */
  EClass getMultiplicationExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.MultiplicationExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.stanford.compilers.cool.MultiplicationExpression#getLeft()
   * @see #getMultiplicationExpression()
   * @generated
   */
  EReference getMultiplicationExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.MultiplicationExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.stanford.compilers.cool.MultiplicationExpression#getRight()
   * @see #getMultiplicationExpression()
   * @generated
   */
  EReference getMultiplicationExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.stanford.compilers.cool.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see edu.stanford.compilers.cool.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Div#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see edu.stanford.compilers.cool.Div#getOp()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.stanford.compilers.cool.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.stanford.compilers.cool.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoolFactory getCoolFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.ProgramImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CLASSES = eINSTANCE.getProgram_Classes();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.Class_Impl <em>Class </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.Class_Impl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS_ = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS___PARENT = eINSTANCE.getClass__Parent();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS___FEATURES = eINSTANCE.getClass__Features();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.Feature_Impl <em>Feature </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.Feature_Impl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getFeature_()
     * @generated
     */
    EClass FEATURE_ = eINSTANCE.getFeature_();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.AttrImpl <em>Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.AttrImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAttr()
     * @generated
     */
    EClass ATTR = eINSTANCE.getAttr();

    /**
     * The meta object literal for the '<em><b>Type decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR__TYPE_DECL = eINSTANCE.getAttr_Type_decl();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR__INIT = eINSTANCE.getAttr_Init();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.MethodImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Formals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__FORMALS = eINSTANCE.getMethod_Formals();

    /**
     * The meta object literal for the '<em><b>Return type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_Return_type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__EXPR = eINSTANCE.getMethod_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.FormalImpl <em>Formal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.FormalImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getFormal()
     * @generated
     */
    EClass FORMAL = eINSTANCE.getFormal();

    /**
     * The meta object literal for the '<em><b>Type decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL__TYPE_DECL = eINSTANCE.getFormal_Type_decl();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.ExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.PrimaryExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.SelfTypeLiteralImpl <em>Self Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.SelfTypeLiteralImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getSelfTypeLiteral()
     * @generated
     */
    EClass SELF_TYPE_LITERAL = eINSTANCE.getSelfTypeLiteral();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.IdentifierRefExpressionImpl <em>Identifier Ref Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.IdentifierRefExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIdentifierRefExpression()
     * @generated
     */
    EClass IDENTIFIER_REF_EXPRESSION = eINSTANCE.getIdentifierRefExpression();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_REF_EXPRESSION__ID = eINSTANCE.getIdentifierRefExpression_Id();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.LiteralImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.NumberLiteralImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.StringLiteralImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.BooleanLiteralImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.ParenExpressionImpl <em>Paren Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.ParenExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getParenExpression()
     * @generated
     */
    EClass PAREN_EXPRESSION = eINSTANCE.getParenExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAREN_EXPRESSION__EXPR = eINSTANCE.getParenExpression_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.AssignmentExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_EXPRESSION__NAME = eINSTANCE.getAssignmentExpression_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__EXPR = eINSTANCE.getAssignmentExpression_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.NegationExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNegationExpression()
     * @generated
     */
    EClass NEGATION_EXPRESSION = eINSTANCE.getNegationExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION_EXPRESSION__EXPR = eINSTANCE.getNegationExpression_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.IntegerCompositeExpressionImpl <em>Integer Composite Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.IntegerCompositeExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIntegerCompositeExpression()
     * @generated
     */
    EClass INTEGER_COMPOSITE_EXPRESSION = eINSTANCE.getIntegerCompositeExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_COMPOSITE_EXPRESSION__EXPR = eINSTANCE.getIntegerCompositeExpression_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.NewExpressionImpl <em>New Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.NewExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getNewExpression()
     * @generated
     */
    EClass NEW_EXPRESSION = eINSTANCE.getNewExpression();

    /**
     * The meta object literal for the '<em><b>Type name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_EXPRESSION__TYPE_NAME = eINSTANCE.getNewExpression_Type_name();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl <em>Dispatch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.DispatchExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getDispatchExpression()
     * @generated
     */
    EClass DISPATCH_EXPRESSION = eINSTANCE.getDispatchExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPATCH_EXPRESSION__REF = eINSTANCE.getDispatchExpression_Ref();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPATCH_EXPRESSION__ACTUAL = eINSTANCE.getDispatchExpression_Actual();

    /**
     * The meta object literal for the '<em><b>Chain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPATCH_EXPRESSION__CHAIN = eINSTANCE.getDispatchExpression_Chain();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPATCH_EXPRESSION__LEFT = eINSTANCE.getDispatchExpression_Left();

    /**
     * The meta object literal for the '<em><b>Type name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPATCH_EXPRESSION__TYPE_NAME = eINSTANCE.getDispatchExpression_Type_name();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.ConditionalExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getConditionalExpression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__PRED = eINSTANCE.getConditionalExpression_Pred();

    /**
     * The meta object literal for the '<em><b>Then exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__THEN_EXP = eINSTANCE.getConditionalExpression_Then_exp();

    /**
     * The meta object literal for the '<em><b>Else exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__ELSE_EXP = eINSTANCE.getConditionalExpression_Else_exp();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.LoopExpressionImpl <em>Loop Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.LoopExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLoopExpression()
     * @generated
     */
    EClass LOOP_EXPRESSION = eINSTANCE.getLoopExpression();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_EXPRESSION__PRED = eINSTANCE.getLoopExpression_Pred();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_EXPRESSION__BODY = eINSTANCE.getLoopExpression_Body();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.BlockExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getBlockExpression()
     * @generated
     */
    EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_EXPRESSION__BODY = eINSTANCE.getBlockExpression_Body();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.IsvoidExpressionImpl <em>Isvoid Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.IsvoidExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIsvoidExpression()
     * @generated
     */
    EClass ISVOID_EXPRESSION = eINSTANCE.getIsvoidExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ISVOID_EXPRESSION__EXPR = eINSTANCE.getIsvoidExpression_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.LetExpressionImpl <em>Let Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.LetExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLetExpression()
     * @generated
     */
    EClass LET_EXPRESSION = eINSTANCE.getLetExpression();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_EXPRESSION__DECLARATION = eINSTANCE.getLetExpression_Declaration();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_EXPRESSION__BODY = eINSTANCE.getLetExpression_Body();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.LetDeclarationImpl <em>Let Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.LetDeclarationImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getLetDeclaration()
     * @generated
     */
    EClass LET_DECLARATION = eINSTANCE.getLetDeclaration();

    /**
     * The meta object literal for the '<em><b>Type decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECLARATION__TYPE_DECL = eINSTANCE.getLetDeclaration_Type_decl();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_DECLARATION__INIT = eINSTANCE.getLetDeclaration_Init();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.CaseExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__EXPR = eINSTANCE.getCaseExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CASE = eINSTANCE.getCaseExpression_Case();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.CaseImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Type decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__TYPE_DECL = eINSTANCE.getCase_Type_decl();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__EXPR = eINSTANCE.getCase_Expr();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.TypeImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.IdentifiableElementImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getIdentifiableElement()
     * @generated
     */
    EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIABLE_ELEMENT__NAME = eINSTANCE.getIdentifiableElement_Name();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.CompareExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getCompareExpression()
     * @generated
     */
    EClass COMPARE_EXPRESSION = eINSTANCE.getCompareExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPRESSION__LEFT = eINSTANCE.getCompareExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_EXPRESSION__OP = eINSTANCE.getCompareExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPRESSION__RIGHT = eINSTANCE.getCompareExpression_Right();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.AdditionExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getAdditionExpression()
     * @generated
     */
    EClass ADDITION_EXPRESSION = eINSTANCE.getAdditionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_EXPRESSION__LEFT = eINSTANCE.getAdditionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_EXPRESSION__RIGHT = eINSTANCE.getAdditionExpression_Right();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.MinusImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__OP = eINSTANCE.getMinus_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.MultiplicationExpressionImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getMultiplicationExpression()
     * @generated
     */
    EClass MULTIPLICATION_EXPRESSION = eINSTANCE.getMultiplicationExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_EXPRESSION__LEFT = eINSTANCE.getMultiplicationExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_EXPRESSION__RIGHT = eINSTANCE.getMultiplicationExpression_Right();

    /**
     * The meta object literal for the '{@link edu.stanford.compilers.cool.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.stanford.compilers.cool.impl.DivImpl
     * @see edu.stanford.compilers.cool.impl.CoolPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__OP = eINSTANCE.getDiv_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

  }

} //CoolPackage
