/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.DispatchExpression;
import edu.stanford.compilers.cool.Expression;
import edu.stanford.compilers.cool.IdentifierRefExpression;
import edu.stanford.compilers.cool.PrimaryExpression;
import edu.stanford.compilers.cool.StaticDispatchExpression;
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
 * An implementation of the model object '<em><b>Dispatch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl#getType_name <em>Type name</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.DispatchExpressionImpl#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchExpressionImpl extends ExpressionImpl implements DispatchExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PrimaryExpression left;

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
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected IdentifierRefExpression ref;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected EList<Expression> actual;

  /**
   * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChain()
   * @generated
   * @ordered
   */
  protected StaticDispatchExpression chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DispatchExpressionImpl()
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
    return CoolPackage.Literals.DISPATCH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PrimaryExpression newLeft, NotificationChain msgs)
  {
    PrimaryExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(PrimaryExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__LEFT, newLeft, newLeft));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME, oldType_name, type_name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME, oldType_name, type_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierRefExpression getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(IdentifierRefExpression newRef, NotificationChain msgs)
  {
    IdentifierRefExpression oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(IdentifierRefExpression newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getActual()
  {
    if (actual == null)
    {
      actual = new EObjectContainmentEList<Expression>(Expression.class, this, CoolPackage.DISPATCH_EXPRESSION__ACTUAL);
    }
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticDispatchExpression getChain()
  {
    return chain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChain(StaticDispatchExpression newChain, NotificationChain msgs)
  {
    StaticDispatchExpression oldChain = chain;
    chain = newChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__CHAIN, oldChain, newChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChain(StaticDispatchExpression newChain)
  {
    if (newChain != chain)
    {
      NotificationChain msgs = null;
      if (chain != null)
        msgs = ((InternalEObject)chain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__CHAIN, null, msgs);
      if (newChain != null)
        msgs = ((InternalEObject)newChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.DISPATCH_EXPRESSION__CHAIN, null, msgs);
      msgs = basicSetChain(newChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.DISPATCH_EXPRESSION__CHAIN, newChain, newChain));
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
      case CoolPackage.DISPATCH_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case CoolPackage.DISPATCH_EXPRESSION__REF:
        return basicSetRef(null, msgs);
      case CoolPackage.DISPATCH_EXPRESSION__ACTUAL:
        return ((InternalEList<?>)getActual()).basicRemove(otherEnd, msgs);
      case CoolPackage.DISPATCH_EXPRESSION__CHAIN:
        return basicSetChain(null, msgs);
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
      case CoolPackage.DISPATCH_EXPRESSION__LEFT:
        return getLeft();
      case CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME:
        if (resolve) return getType_name();
        return basicGetType_name();
      case CoolPackage.DISPATCH_EXPRESSION__REF:
        return getRef();
      case CoolPackage.DISPATCH_EXPRESSION__ACTUAL:
        return getActual();
      case CoolPackage.DISPATCH_EXPRESSION__CHAIN:
        return getChain();
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
      case CoolPackage.DISPATCH_EXPRESSION__LEFT:
        setLeft((PrimaryExpression)newValue);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME:
        setType_name((Type)newValue);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__REF:
        setRef((IdentifierRefExpression)newValue);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__ACTUAL:
        getActual().clear();
        getActual().addAll((Collection<? extends Expression>)newValue);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__CHAIN:
        setChain((StaticDispatchExpression)newValue);
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
      case CoolPackage.DISPATCH_EXPRESSION__LEFT:
        setLeft((PrimaryExpression)null);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME:
        setType_name((Type)null);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__REF:
        setRef((IdentifierRefExpression)null);
        return;
      case CoolPackage.DISPATCH_EXPRESSION__ACTUAL:
        getActual().clear();
        return;
      case CoolPackage.DISPATCH_EXPRESSION__CHAIN:
        setChain((StaticDispatchExpression)null);
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
      case CoolPackage.DISPATCH_EXPRESSION__LEFT:
        return left != null;
      case CoolPackage.DISPATCH_EXPRESSION__TYPE_NAME:
        return type_name != null;
      case CoolPackage.DISPATCH_EXPRESSION__REF:
        return ref != null;
      case CoolPackage.DISPATCH_EXPRESSION__ACTUAL:
        return actual != null && !actual.isEmpty();
      case CoolPackage.DISPATCH_EXPRESSION__CHAIN:
        return chain != null;
    }
    return super.eIsSet(featureID);
  }

} //DispatchExpressionImpl
