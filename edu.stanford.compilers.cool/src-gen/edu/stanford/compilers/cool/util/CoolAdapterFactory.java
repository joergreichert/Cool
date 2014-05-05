/**
 */
package edu.stanford.compilers.cool.util;

import edu.stanford.compilers.cool.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.stanford.compilers.cool.CoolPackage
 * @generated
 */
public class CoolAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CoolPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoolAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CoolPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoolSwitch<Adapter> modelSwitch =
    new CoolSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseClass_(Class_ object)
      {
        return createClass_Adapter();
      }
      @Override
      public Adapter caseFeature_(Feature_ object)
      {
        return createFeature_Adapter();
      }
      @Override
      public Adapter caseAttr(Attr object)
      {
        return createAttrAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseFormal(Formal object)
      {
        return createFormalAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseSelfTypeLiteral(SelfTypeLiteral object)
      {
        return createSelfTypeLiteralAdapter();
      }
      @Override
      public Adapter caseIdentifierRefExpression(IdentifierRefExpression object)
      {
        return createIdentifierRefExpressionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseParenExpression(ParenExpression object)
      {
        return createParenExpressionAdapter();
      }
      @Override
      public Adapter caseAssignmentExpression(AssignmentExpression object)
      {
        return createAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseNegationExpression(NegationExpression object)
      {
        return createNegationExpressionAdapter();
      }
      @Override
      public Adapter caseIntegerCompositeExpression(IntegerCompositeExpression object)
      {
        return createIntegerCompositeExpressionAdapter();
      }
      @Override
      public Adapter caseNewExpression(NewExpression object)
      {
        return createNewExpressionAdapter();
      }
      @Override
      public Adapter caseStaticDispatchExpression(StaticDispatchExpression object)
      {
        return createStaticDispatchExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalExpression(ConditionalExpression object)
      {
        return createConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseLoopExpression(LoopExpression object)
      {
        return createLoopExpressionAdapter();
      }
      @Override
      public Adapter caseBlockExpression(BlockExpression object)
      {
        return createBlockExpressionAdapter();
      }
      @Override
      public Adapter caseIsvoidExpression(IsvoidExpression object)
      {
        return createIsvoidExpressionAdapter();
      }
      @Override
      public Adapter caseLetExpression(LetExpression object)
      {
        return createLetExpressionAdapter();
      }
      @Override
      public Adapter caseLetDeclaration(LetDeclaration object)
      {
        return createLetDeclarationAdapter();
      }
      @Override
      public Adapter caseCaseExpression(CaseExpression object)
      {
        return createCaseExpressionAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseIdentifiableElement(IdentifiableElement object)
      {
        return createIdentifiableElementAdapter();
      }
      @Override
      public Adapter caseCompareExpression(CompareExpression object)
      {
        return createCompareExpressionAdapter();
      }
      @Override
      public Adapter caseAdditionExpression(AdditionExpression object)
      {
        return createAdditionExpressionAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMultiplicationExpression(MultiplicationExpression object)
      {
        return createMultiplicationExpressionAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseDispatchExpression(DispatchExpression object)
      {
        return createDispatchExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Class_ <em>Class </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Class_
   * @generated
   */
  public Adapter createClass_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Feature_ <em>Feature </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Feature_
   * @generated
   */
  public Adapter createFeature_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Attr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Attr
   * @generated
   */
  public Adapter createAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Formal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Formal
   * @generated
   */
  public Adapter createFormalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.SelfTypeLiteral <em>Self Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.SelfTypeLiteral
   * @generated
   */
  public Adapter createSelfTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.IdentifierRefExpression <em>Identifier Ref Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.IdentifierRefExpression
   * @generated
   */
  public Adapter createIdentifierRefExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.ParenExpression <em>Paren Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.ParenExpression
   * @generated
   */
  public Adapter createParenExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.AssignmentExpression
   * @generated
   */
  public Adapter createAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.NegationExpression
   * @generated
   */
  public Adapter createNegationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.IntegerCompositeExpression <em>Integer Composite Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.IntegerCompositeExpression
   * @generated
   */
  public Adapter createIntegerCompositeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.NewExpression <em>New Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.NewExpression
   * @generated
   */
  public Adapter createNewExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.StaticDispatchExpression <em>Static Dispatch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.StaticDispatchExpression
   * @generated
   */
  public Adapter createStaticDispatchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.ConditionalExpression
   * @generated
   */
  public Adapter createConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.LoopExpression <em>Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.LoopExpression
   * @generated
   */
  public Adapter createLoopExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.BlockExpression <em>Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.BlockExpression
   * @generated
   */
  public Adapter createBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.IsvoidExpression <em>Isvoid Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.IsvoidExpression
   * @generated
   */
  public Adapter createIsvoidExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.LetExpression <em>Let Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.LetExpression
   * @generated
   */
  public Adapter createLetExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.LetDeclaration <em>Let Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.LetDeclaration
   * @generated
   */
  public Adapter createLetDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.IdentifiableElement <em>Identifiable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.IdentifiableElement
   * @generated
   */
  public Adapter createIdentifiableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.CompareExpression
   * @generated
   */
  public Adapter createCompareExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.AdditionExpression
   * @generated
   */
  public Adapter createAdditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.MultiplicationExpression
   * @generated
   */
  public Adapter createMultiplicationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.stanford.compilers.cool.DispatchExpression <em>Dispatch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.stanford.compilers.cool.DispatchExpression
   * @generated
   */
  public Adapter createDispatchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CoolAdapterFactory
