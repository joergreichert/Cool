/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.DispatchExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.DispatchExpression#getType_name <em>Type name</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.DispatchExpression#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.DispatchExpression#getActual <em>Actual</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.DispatchExpression#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression()
 * @model
 * @generated
 */
public interface DispatchExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PrimaryExpression)
   * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression_Left()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getLeft();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.DispatchExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PrimaryExpression value);

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
   * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression_Type_name()
   * @model
   * @generated
   */
  Type getType_name();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.DispatchExpression#getType_name <em>Type name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type name</em>' reference.
   * @see #getType_name()
   * @generated
   */
  void setType_name(Type value);

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
   * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression_Ref()
   * @model containment="true"
   * @generated
   */
  IdentifierRefExpression getRef();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.DispatchExpression#getRef <em>Ref</em>}' containment reference.
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
   * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression_Actual()
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
   * @see edu.stanford.compilers.cool.CoolPackage#getDispatchExpression_Chain()
   * @model containment="true"
   * @generated
   */
  StaticDispatchExpression getChain();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.DispatchExpression#getChain <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chain</em>' containment reference.
   * @see #getChain()
   * @generated
   */
  void setChain(StaticDispatchExpression value);

} // DispatchExpression
