/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.Method#getFormals <em>Formals</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Method#getReturn_type <em>Return type</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Method#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Feature_
{
  /**
   * Returns the value of the '<em><b>Formals</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Formal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formals</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getMethod_Formals()
   * @model containment="true"
   * @generated
   */
  EList<Formal> getFormals();

  /**
   * Returns the value of the '<em><b>Return type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return type</em>' reference.
   * @see #setReturn_type(Type)
   * @see edu.stanford.compilers.cool.CoolPackage#getMethod_Return_type()
   * @model
   * @generated
   */
  Type getReturn_type();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Method#getReturn_type <em>Return type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return type</em>' reference.
   * @see #getReturn_type()
   * @generated
   */
  void setReturn_type(Type value);

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
   * @see edu.stanford.compilers.cool.CoolPackage#getMethod_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Method#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // Method
