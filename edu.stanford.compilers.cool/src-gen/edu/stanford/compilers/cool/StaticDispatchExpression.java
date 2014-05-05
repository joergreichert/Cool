/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Dispatch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.StaticDispatchExpression#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.StaticDispatchExpression#getActual <em>Actual</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.StaticDispatchExpression#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getStaticDispatchExpression()
 * @model
 * @generated
 */
public interface StaticDispatchExpression extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(IdentifierRefExpression)
   * @see edu.stanford.compilers.cool.CoolPackage#getStaticDispatchExpression_Ref()
   * @model containment="true"
   * @generated
   */
  IdentifierRefExpression getRef();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.StaticDispatchExpression#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(IdentifierRefExpression value);

  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getStaticDispatchExpression_Actual()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getActual();

  /**
   * Returns the value of the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chain</em>' containment reference.
   * @see #setChain(StaticDispatchExpression)
   * @see edu.stanford.compilers.cool.CoolPackage#getStaticDispatchExpression_Chain()
   * @model containment="true"
   * @generated
   */
  StaticDispatchExpression getChain();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.StaticDispatchExpression#getChain <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chain</em>' containment reference.
   * @see #getChain()
   * @generated
   */
  void setChain(StaticDispatchExpression value);

} // StaticDispatchExpression
