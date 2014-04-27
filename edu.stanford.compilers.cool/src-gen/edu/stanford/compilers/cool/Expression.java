/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getName <em>Name</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getActual <em>Actual</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getPred <em>Pred</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getThen_exp <em>Then exp</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Expression#getElse_exp <em>Else exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(IdentifierRefExpression)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Ref()
   * @model containment="true"
   * @generated
   */
  IdentifierRefExpression getRef();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(IdentifierRefExpression value);

  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Actual()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getActual();

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Pred()
   * @model containment="true"
   * @generated
   */
  Expression getPred();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Expression value);

  /**
   * Returns the value of the '<em><b>Then exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then exp</em>' containment reference.
   * @see #setThen_exp(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Then_exp()
   * @model containment="true"
   * @generated
   */
  Expression getThen_exp();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getThen_exp <em>Then exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then exp</em>' containment reference.
   * @see #getThen_exp()
   * @generated
   */
  void setThen_exp(Expression value);

  /**
   * Returns the value of the '<em><b>Else exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else exp</em>' containment reference.
   * @see #setElse_exp(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getExpression_Else_exp()
   * @model containment="true"
   * @generated
   */
  Expression getElse_exp();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Expression#getElse_exp <em>Else exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else exp</em>' containment reference.
   * @see #getElse_exp()
   * @generated
   */
  void setElse_exp(Expression value);

} // Expression
