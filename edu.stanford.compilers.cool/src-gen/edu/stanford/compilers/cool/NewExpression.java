/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.NewExpression#getType_name <em>Type name</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getNewExpression()
 * @model
 * @generated
 */
public interface NewExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Type name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type name</em>' reference.
   * @see #setType_name(Type)
   * @see edu.stanford.compilers.cool.CoolPackage#getNewExpression_Type_name()
   * @model
   * @generated
   */
  Type getType_name();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.NewExpression#getType_name <em>Type name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type name</em>' reference.
   * @see #getType_name()
   * @generated
   */
  void setType_name(Type value);

} // NewExpression
