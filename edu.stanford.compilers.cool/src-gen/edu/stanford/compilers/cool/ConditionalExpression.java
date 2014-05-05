/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.ConditionalExpression#getPred <em>Pred</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.ConditionalExpression#getThen_exp <em>Then exp</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.ConditionalExpression#getElse_exp <em>Else exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends PrimaryExpression
{
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
   * @see edu.stanford.compilers.cool.CoolPackage#getConditionalExpression_Pred()
   * @model containment="true"
   * @generated
   */
  Expression getPred();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.ConditionalExpression#getPred <em>Pred</em>}' containment reference.
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
   * @see edu.stanford.compilers.cool.CoolPackage#getConditionalExpression_Then_exp()
   * @model containment="true"
   * @generated
   */
  Expression getThen_exp();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.ConditionalExpression#getThen_exp <em>Then exp</em>}' containment reference.
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
   * @see edu.stanford.compilers.cool.CoolPackage#getConditionalExpression_Else_exp()
   * @model containment="true"
   * @generated
   */
  Expression getElse_exp();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.ConditionalExpression#getElse_exp <em>Else exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else exp</em>' containment reference.
   * @see #getElse_exp()
   * @generated
   */
  void setElse_exp(Expression value);

} // ConditionalExpression
