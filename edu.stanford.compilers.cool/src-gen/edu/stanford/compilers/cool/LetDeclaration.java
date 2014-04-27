/**
 */
package edu.stanford.compilers.cool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.LetDeclaration#getType_decl <em>Type decl</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.LetDeclaration#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getLetDeclaration()
 * @model
 * @generated
 */
public interface LetDeclaration extends IdentifiableElement
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
   * @see edu.stanford.compilers.cool.CoolPackage#getLetDeclaration_Type_decl()
   * @model
   * @generated
   */
  Type getType_decl();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.LetDeclaration#getType_decl <em>Type decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type decl</em>' reference.
   * @see #getType_decl()
   * @generated
   */
  void setType_decl(Type value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expression)
   * @see edu.stanford.compilers.cool.CoolPackage#getLetDeclaration_Init()
   * @model containment="true"
   * @generated
   */
  Expression getInit();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.LetDeclaration#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expression value);

} // LetDeclaration
