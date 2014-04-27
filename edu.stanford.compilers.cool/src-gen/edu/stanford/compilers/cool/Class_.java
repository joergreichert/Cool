/**
 */
package edu.stanford.compilers.cool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.Class_#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.Class_#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.stanford.compilers.cool.CoolPackage#getClass_()
 * @model
 * @generated
 */
public interface Class_ extends Type, IdentifiableElement
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Type)
   * @see edu.stanford.compilers.cool.CoolPackage#getClass__Parent()
   * @model
   * @generated
   */
  Type getParent();

  /**
   * Sets the value of the '{@link edu.stanford.compilers.cool.Class_#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Type value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link edu.stanford.compilers.cool.Feature_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see edu.stanford.compilers.cool.CoolPackage#getClass__Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature_> getFeatures();

} // Class_
