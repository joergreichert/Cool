/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.Expression;
import edu.stanford.compilers.cool.Formal;
import edu.stanford.compilers.cool.Method;
import edu.stanford.compilers.cool.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.MethodImpl#getFormals <em>Formals</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.MethodImpl#getReturn_type <em>Return type</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.MethodImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends Feature_Impl implements Method
{
  /**
   * The cached value of the '{@link #getFormals() <em>Formals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormals()
   * @generated
   * @ordered
   */
  protected EList<Formal> formals;

  /**
   * The cached value of the '{@link #getReturn_type() <em>Return type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn_type()
   * @generated
   * @ordered
   */
  protected Type return_type;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return CoolPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Formal> getFormals()
  {
    if (formals == null)
    {
      formals = new EObjectContainmentEList<Formal>(Formal.class, this, CoolPackage.METHOD__FORMALS);
    }
    return formals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturn_type()
  {
    if (return_type != null && return_type.eIsProxy())
    {
      InternalEObject oldReturn_type = (InternalEObject)return_type;
      return_type = (Type)eResolveProxy(oldReturn_type);
      if (return_type != oldReturn_type)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoolPackage.METHOD__RETURN_TYPE, oldReturn_type, return_type));
      }
    }
    return return_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetReturn_type()
  {
    return return_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn_type(Type newReturn_type)
  {
    Type oldReturn_type = return_type;
    return_type = newReturn_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.METHOD__RETURN_TYPE, oldReturn_type, return_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.METHOD__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.METHOD__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.METHOD__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.METHOD__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CoolPackage.METHOD__FORMALS:
        return ((InternalEList<?>)getFormals()).basicRemove(otherEnd, msgs);
      case CoolPackage.METHOD__EXPR:
        return basicSetExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CoolPackage.METHOD__FORMALS:
        return getFormals();
      case CoolPackage.METHOD__RETURN_TYPE:
        if (resolve) return getReturn_type();
        return basicGetReturn_type();
      case CoolPackage.METHOD__EXPR:
        return getExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoolPackage.METHOD__FORMALS:
        getFormals().clear();
        getFormals().addAll((Collection<? extends Formal>)newValue);
        return;
      case CoolPackage.METHOD__RETURN_TYPE:
        setReturn_type((Type)newValue);
        return;
      case CoolPackage.METHOD__EXPR:
        setExpr((Expression)newValue);
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
      case CoolPackage.METHOD__FORMALS:
        getFormals().clear();
        return;
      case CoolPackage.METHOD__RETURN_TYPE:
        setReturn_type((Type)null);
        return;
      case CoolPackage.METHOD__EXPR:
        setExpr((Expression)null);
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
      case CoolPackage.METHOD__FORMALS:
        return formals != null && !formals.isEmpty();
      case CoolPackage.METHOD__RETURN_TYPE:
        return return_type != null;
      case CoolPackage.METHOD__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl
