/**
 */
package edu.stanford.compilers.cool.impl;

import edu.stanford.compilers.cool.ConditionalExpression;
import edu.stanford.compilers.cool.CoolPackage;
import edu.stanford.compilers.cool.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.stanford.compilers.cool.impl.ConditionalExpressionImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ConditionalExpressionImpl#getThen_exp <em>Then exp</em>}</li>
 *   <li>{@link edu.stanford.compilers.cool.impl.ConditionalExpressionImpl#getElse_exp <em>Else exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends PrimaryExpressionImpl implements ConditionalExpression
{
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
  protected ConditionalExpressionImpl()
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
    return CoolPackage.Literals.CONDITIONAL_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__PRED, oldPred, newPred);
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
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__PRED, newPred, newPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP, oldThen_exp, newThen_exp);
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
        msgs = ((InternalEObject)then_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP, null, msgs);
      if (newThen_exp != null)
        msgs = ((InternalEObject)newThen_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP, null, msgs);
      msgs = basicSetThen_exp(newThen_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP, newThen_exp, newThen_exp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP, oldElse_exp, newElse_exp);
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
        msgs = ((InternalEObject)else_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP, null, msgs);
      if (newElse_exp != null)
        msgs = ((InternalEObject)newElse_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP, null, msgs);
      msgs = basicSetElse_exp(newElse_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP, newElse_exp, newElse_exp));
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
      case CoolPackage.CONDITIONAL_EXPRESSION__PRED:
        return basicSetPred(null, msgs);
      case CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP:
        return basicSetThen_exp(null, msgs);
      case CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP:
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
      case CoolPackage.CONDITIONAL_EXPRESSION__PRED:
        return getPred();
      case CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP:
        return getThen_exp();
      case CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP:
        return getElse_exp();
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
      case CoolPackage.CONDITIONAL_EXPRESSION__PRED:
        setPred((Expression)newValue);
        return;
      case CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP:
        setThen_exp((Expression)newValue);
        return;
      case CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP:
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
      case CoolPackage.CONDITIONAL_EXPRESSION__PRED:
        setPred((Expression)null);
        return;
      case CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP:
        setThen_exp((Expression)null);
        return;
      case CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP:
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
      case CoolPackage.CONDITIONAL_EXPRESSION__PRED:
        return pred != null;
      case CoolPackage.CONDITIONAL_EXPRESSION__THEN_EXP:
        return then_exp != null;
      case CoolPackage.CONDITIONAL_EXPRESSION__ELSE_EXP:
        return else_exp != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalExpressionImpl
