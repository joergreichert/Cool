/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.Expression;
import edu.stanford.compilers.cool.IdentifierRefExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getThen_exp <em>Then exp</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ExpressionImpl#getElse_exp <em>Else exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected Expression pred;

  /**
   * The cached value of the '{@link #getThen_exp() <em>Then exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen_exp()
   * @generated
   * @ordered
   */
  protected Expression then_exp;

  /**
   * The cached value of the '{@link #getElse_exp() <em>Else exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_exp()
   * @generated
   * @ordered
   */
  protected Expression else_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return CoolPackage.Literals.EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__REF, oldRef, newRef);
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
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__REF, newRef, newRef));
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
      actual = new EObjectContainmentEList<Expression>(Expression.class, this, CoolPackage.EXPRESSION__ACTUAL);
    }
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPred(Expression newPred, NotificationChain msgs)
  {
    Expression oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__PRED, oldPred, newPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(Expression newPred)
  {
    if (newPred != pred)
    {
      NotificationChain msgs = null;
      if (pred != null)
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__PRED, newPred, newPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThen_exp()
  {
    return then_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen_exp(Expression newThen_exp, NotificationChain msgs)
  {
    Expression oldThen_exp = then_exp;
    then_exp = newThen_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__THEN_EXP, oldThen_exp, newThen_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen_exp(Expression newThen_exp)
  {
    if (newThen_exp != then_exp)
    {
      NotificationChain msgs = null;
      if (then_exp != null)
        msgs = ((InternalEObject)then_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__THEN_EXP, null, msgs);
      if (newThen_exp != null)
        msgs = ((InternalEObject)newThen_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__THEN_EXP, null, msgs);
      msgs = basicSetThen_exp(newThen_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__THEN_EXP, newThen_exp, newThen_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElse_exp()
  {
    return else_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse_exp(Expression newElse_exp, NotificationChain msgs)
  {
    Expression oldElse_exp = else_exp;
    else_exp = newElse_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__ELSE_EXP, oldElse_exp, newElse_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse_exp(Expression newElse_exp)
  {
    if (newElse_exp != else_exp)
    {
      NotificationChain msgs = null;
      if (else_exp != null)
        msgs = ((InternalEObject)else_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__ELSE_EXP, null, msgs);
      if (newElse_exp != null)
        msgs = ((InternalEObject)newElse_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.EXPRESSION__ELSE_EXP, null, msgs);
      msgs = basicSetElse_exp(newElse_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.EXPRESSION__ELSE_EXP, newElse_exp, newElse_exp));
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
      case CoolPackage.EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case CoolPackage.EXPRESSION__REF:
        return basicSetRef(null, msgs);
      case CoolPackage.EXPRESSION__ACTUAL:
        return ((InternalEList<?>)getActual()).basicRemove(otherEnd, msgs);
      case CoolPackage.EXPRESSION__PRED:
        return basicSetPred(null, msgs);
      case CoolPackage.EXPRESSION__THEN_EXP:
        return basicSetThen_exp(null, msgs);
      case CoolPackage.EXPRESSION__ELSE_EXP:
        return basicSetElse_exp(null, msgs);
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
      case CoolPackage.EXPRESSION__EXPR:
        return getExpr();
      case CoolPackage.EXPRESSION__NAME:
        return getName();
      case CoolPackage.EXPRESSION__REF:
        return getRef();
      case CoolPackage.EXPRESSION__ACTUAL:
        return getActual();
      case CoolPackage.EXPRESSION__PRED:
        return getPred();
      case CoolPackage.EXPRESSION__THEN_EXP:
        return getThen_exp();
      case CoolPackage.EXPRESSION__ELSE_EXP:
        return getElse_exp();
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
      case CoolPackage.EXPRESSION__EXPR:
        setExpr((Expression)newValue);
        return;
      case CoolPackage.EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case CoolPackage.EXPRESSION__REF:
        setRef((IdentifierRefExpression)newValue);
        return;
      case CoolPackage.EXPRESSION__ACTUAL:
        getActual().clear();
        getActual().addAll((Collection<? extends Expression>)newValue);
        return;
      case CoolPackage.EXPRESSION__PRED:
        setPred((Expression)newValue);
        return;
      case CoolPackage.EXPRESSION__THEN_EXP:
        setThen_exp((Expression)newValue);
        return;
      case CoolPackage.EXPRESSION__ELSE_EXP:
        setElse_exp((Expression)newValue);
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
      case CoolPackage.EXPRESSION__EXPR:
        setExpr((Expression)null);
        return;
      case CoolPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoolPackage.EXPRESSION__REF:
        setRef((IdentifierRefExpression)null);
        return;
      case CoolPackage.EXPRESSION__ACTUAL:
        getActual().clear();
        return;
      case CoolPackage.EXPRESSION__PRED:
        setPred((Expression)null);
        return;
      case CoolPackage.EXPRESSION__THEN_EXP:
        setThen_exp((Expression)null);
        return;
      case CoolPackage.EXPRESSION__ELSE_EXP:
        setElse_exp((Expression)null);
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
      case CoolPackage.EXPRESSION__EXPR:
        return expr != null;
      case CoolPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoolPackage.EXPRESSION__REF:
        return ref != null;
      case CoolPackage.EXPRESSION__ACTUAL:
        return actual != null && !actual.isEmpty();
      case CoolPackage.EXPRESSION__PRED:
        return pred != null;
      case CoolPackage.EXPRESSION__THEN_EXP:
        return then_exp != null;
      case CoolPackage.EXPRESSION__ELSE_EXP:
        return else_exp != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
