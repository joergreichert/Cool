/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Ref Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.IdentifierRefExpression#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getIdentifierRefExpression()
 * @model
 * @generated
 */
public interface IdentifierRefExpression extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(IdentifiableElement)
   * @see edu.stanford.compilers.cool.CoolPackage#getIdentifierRefExpression_Id()
   * @model
   * @generated
   */
  IdentifiableElement getId();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.IdentifierRefExpression#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(IdentifiableElement value);

} // IdentifierRefExpression
