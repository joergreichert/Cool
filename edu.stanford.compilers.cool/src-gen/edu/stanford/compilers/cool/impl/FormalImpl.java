/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.Formal;
import edu.stanford.compilers.cool.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.FormalImpl#getType_decl <em>Type decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalImpl extends IdentifiableElementImpl implements Formal
{
  /**
   * The cached value of the '{@link #getType_decl() <em>Type decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_decl()
   * @generated
   * @ordered
   */
  protected Type type_decl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CoolPackage.Literals.FORMAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType_decl()
  {
    if (type_decl != null && type_decl.eIsProxy())
    {
      InternalEObject oldType_decl = (InternalEObject)type_decl;
      type_decl = (Type)eResolveProxy(oldType_decl);
      if (type_decl != oldType_decl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoolPackage.FORMAL__TYPE_DECL, oldType_decl, type_decl));
      }
    }
    return type_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType_decl()
  {
    return type_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_decl(Type newType_decl)
  {
    Type oldType_decl = type_decl;
    type_decl = newType_decl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.FORMAL__TYPE_DECL, oldType_decl, type_decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CoolPackage.FORMAL__TYPE_DECL:
        if (resolve) return getType_decl();
        return basicGetType_decl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoolPackage.FORMAL__TYPE_DECL:
        setType_decl((Type)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CoolPackage.FORMAL__TYPE_DECL:
        setType_decl((Type)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CoolPackage.FORMAL__TYPE_DECL:
        return type_decl != null;
    }
    return super.eIsSet(featureID);
  }

} //FormalImpl
