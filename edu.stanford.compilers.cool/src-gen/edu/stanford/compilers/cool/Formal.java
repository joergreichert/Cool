/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.Formal#getType_decl <em>Type decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getFormal()
 * @model
 * @generated
 */
public interface Formal extends IdentifiableElement
{
  /**
   * Returns the value of the '<em><b>Type decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type decl</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type decl</em>' reference.
   * @see #setType_decl(Type)
   * @see edu.stanford.compilers.cool.CoolPackage#getFormal_Type_decl()
   * @model
   * @generated
   */
  Type getType_decl();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Formal#getType_decl <em>Type decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type decl</em>' reference.
   * @see #getType_decl()
   * @generated
   */
  void setType_decl(Type value);

} // Formal
