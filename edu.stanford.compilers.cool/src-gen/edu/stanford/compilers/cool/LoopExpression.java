/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.LoopExpression#getPred <em>Pred</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.LoopExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getLoopExpression()
 * @model
 * @generated
 */
public interface LoopExpression extends PrimaryExpression
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
   * @see edu.stanford.compilers.cool.CoolPackage#getLoopExpression_Pred()
   * @model containment="true"
   * @generated
   */
  Expression getPred();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.LoopExpression#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getLoopExpression_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.LoopExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // LoopExpression
