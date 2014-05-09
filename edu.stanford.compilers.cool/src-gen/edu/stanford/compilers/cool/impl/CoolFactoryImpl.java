/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoolFactoryImpl extends EFactoryImpl implements CoolFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CoolFactory init()
  {
    try
    {
      CoolFactory theCoolFactory = (CoolFactory)EPackage.Registry.INSTANCE.getEFactory(CoolPackage.eNS_URI);
      if (theCoolFactory != null)
      {
        return theCoolFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CoolFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoolFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CoolPackage.PROGRAM: return createProgram();
      case CoolPackage.CLASS_: return createClass_();
      case CoolPackage.FEATURE_: return createFeature_();
      case CoolPackage.ATTR: return createAttr();
      case CoolPackage.METHOD: return createMethod();
      case CoolPackage.FORMAL: return createFormal();
      case CoolPackage.EXPRESSION: return createExpression();
      case CoolPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case CoolPackage.SELF_TYPE_LITERAL: return createSelfTypeLiteral();
      case CoolPackage.IDENTIFIER_REF_EXPRESSION: return createIdentifierRefExpression();
      case CoolPackage.LITERAL: return createLiteral();
      case CoolPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CoolPackage.STRING_LITERAL: return createStringLiteral();
      case CoolPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case CoolPackage.PAREN_EXPRESSION: return createParenExpression();
      case CoolPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case CoolPackage.NEGATION_EXPRESSION: return createNegationExpression();
      case CoolPackage.INTEGER_COMPOSITE_EXPRESSION: return createIntegerCompositeExpression();
      case CoolPackage.NEW_EXPRESSION: return createNewExpression();
      case CoolPackage.DISPATCH_EXPRESSION: return createDispatchExpression();
      case CoolPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
      case CoolPackage.LOOP_EXPRESSION: return createLoopExpression();
      case CoolPackage.BLOCK_EXPRESSION: return createBlockExpression();
      case CoolPackage.ISVOID_EXPRESSION: return createIsvoidExpression();
      case CoolPackage.LET_EXPRESSION: return createLetExpression();
      case CoolPackage.LET_DECLARATION: return createLetDeclaration();
      case CoolPackage.CASE_EXPRESSION: return createCaseExpression();
      case CoolPackage.CASE: return createCase();
      case CoolPackage.TYPE: return createType();
      case CoolPackage.IDENTIFIABLE_ELEMENT: return createIdentifiableElement();
      case CoolPackage.COMPARE_EXPRESSION: return createCompareExpression();
      case CoolPackage.ADDITION_EXPRESSION: return createAdditionExpression();
      case CoolPackage.MINUS: return createMinus();
      case CoolPackage.MULTIPLICATION_EXPRESSION: return createMultiplicationExpression();
      case CoolPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_ createClass_()
  {
    Class_Impl class_ = new Class_Impl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_ createFeature_()
  {
    Feature_Impl feature_ = new Feature_Impl();
    return feature_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attr createAttr()
  {
    AttrImpl attr = new AttrImpl();
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formal createFormal()
  {
    FormalImpl formal = new FormalImpl();
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfTypeLiteral createSelfTypeLiteral()
  {
    SelfTypeLiteralImpl selfTypeLiteral = new SelfTypeLiteralImpl();
    return selfTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierRefExpression createIdentifierRefExpression()
  {
    IdentifierRefExpressionImpl identifierRefExpression = new IdentifierRefExpressionImpl();
    return identifierRefExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenExpression createParenExpression()
  {
    ParenExpressionImpl parenExpression = new ParenExpressionImpl();
    return parenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegationExpression createNegationExpression()
  {
    NegationExpressionImpl negationExpression = new NegationExpressionImpl();
    return negationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerCompositeExpression createIntegerCompositeExpression()
  {
    IntegerCompositeExpressionImpl integerCompositeExpression = new IntegerCompositeExpressionImpl();
    return integerCompositeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewExpression createNewExpression()
  {
    NewExpressionImpl newExpression = new NewExpressionImpl();
    return newExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchExpression createDispatchExpression()
  {
    DispatchExpressionImpl dispatchExpression = new DispatchExpressionImpl();
    return dispatchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression createConditionalExpression()
  {
    ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopExpression createLoopExpression()
  {
    LoopExpressionImpl loopExpression = new LoopExpressionImpl();
    return loopExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockExpression createBlockExpression()
  {
    BlockExpressionImpl blockExpression = new BlockExpressionImpl();
    return blockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsvoidExpression createIsvoidExpression()
  {
    IsvoidExpressionImpl isvoidExpression = new IsvoidExpressionImpl();
    return isvoidExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetExpression createLetExpression()
  {
    LetExpressionImpl letExpression = new LetExpressionImpl();
    return letExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetDeclaration createLetDeclaration()
  {
    LetDeclarationImpl letDeclaration = new LetDeclarationImpl();
    return letDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifiableElement createIdentifiableElement()
  {
    IdentifiableElementImpl identifiableElement = new IdentifiableElementImpl();
    return identifiableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareExpression createCompareExpression()
  {
    CompareExpressionImpl compareExpression = new CompareExpressionImpl();
    return compareExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionExpression createAdditionExpression()
  {
    AdditionExpressionImpl additionExpression = new AdditionExpressionImpl();
    return additionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationExpression createMultiplicationExpression()
  {
    MultiplicationExpressionImpl multiplicationExpression = new MultiplicationExpressionImpl();
    return multiplicationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoolPackage getCoolPackage()
  {
    return (CoolPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CoolPackage getPackage()
  {
    return CoolPackage.eINSTANCE;
  }

} //CoolFactoryImpl
