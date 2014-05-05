/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.BlockExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getBlockExpression()
 * @model
 * @generated
 */
public interface BlockExpression extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getBlockExpression_Body()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getBody();

} // BlockExpression
