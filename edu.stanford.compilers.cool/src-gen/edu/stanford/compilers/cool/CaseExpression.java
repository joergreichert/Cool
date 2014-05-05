/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.CaseExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.CaseExpression#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends PrimaryExpression
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
   * @see edu.stanford.compilers.cool.CoolPackage#getCaseExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.CaseExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getCaseExpression_Case()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCase();

} // CaseExpression
