/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.NewExpression;
import edu.stanford.compilers.cool.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.NewExpressionImpl#getType_name <em>Type name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewExpressionImpl extends ExpressionImpl implements NewExpression
{
  /**
   * The cached value of the '{@link #getType_name() <em>Type name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_name()
   * @generated
   * @ordered
   */
  protected Type type_name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewExpressionImpl()
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
    return CoolPackage.Literals.NEW_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType_name()
  {
    if (type_name != null && type_name.eIsProxy())
    {
      InternalEObject oldType_name = (InternalEObject)type_name;
      type_name = (Type)eResolveProxy(oldType_name);
      if (type_name != oldType_name)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoolPackage.NEW_EXPRESSION__TYPE_NAME, oldType_name, type_name));
      }
    }
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType_name()
  {
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_name(Type newType_name)
  {
    Type oldType_name = type_name;
    type_name = newType_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.NEW_EXPRESSION__TYPE_NAME, oldType_name, type_name));
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
      case CoolPackage.NEW_EXPRESSION__TYPE_NAME:
        if (resolve) return getType_name();
        return basicGetType_name();
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
      case CoolPackage.NEW_EXPRESSION__TYPE_NAME:
        setType_name((Type)newValue);
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
      case CoolPackage.NEW_EXPRESSION__TYPE_NAME:
        setType_name((Type)null);
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
      case CoolPackage.NEW_EXPRESSION__TYPE_NAME:
        return type_name != null;
    }
    return super.eIsSet(featureID);
  }

} //NewExpressionImpl
