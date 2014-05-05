/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.LetExpression#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.LetExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getLetExpression()
 * @model
 * @generated
 */
public interface LetExpression extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.LetDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getLetExpression_Declaration()
   * @model containment="true"
   * @generated
   */
  EList<LetDeclaration> getDeclaration();

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
   * @see edu.stanford.compilers.cool.CoolPackage#getLetExpression_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.LetExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // LetExpression
