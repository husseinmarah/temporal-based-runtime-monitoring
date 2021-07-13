/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.constraint.mydsl.myDsl.InputStatement;
import org.xtext.constraint.mydsl.myDsl.MaxDuration;
import org.xtext.constraint.mydsl.myDsl.MyDslPackage;
import org.xtext.constraint.mydsl.myDsl.OccurenceAtMost;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurence At Most</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.OccurenceAtMostImpl#getSeceondEvent <em>Seceond Event</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.OccurenceAtMostImpl#getMaxDuration <em>Max Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurenceAtMostImpl extends MinimalEObjectImpl.Container implements OccurenceAtMost
{
  /**
   * The cached value of the '{@link #getSeceondEvent() <em>Seceond Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeceondEvent()
   * @generated
   * @ordered
   */
  protected InputStatement seceondEvent;

  /**
   * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxDuration()
   * @generated
   * @ordered
   */
  protected MaxDuration maxDuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccurenceAtMostImpl()
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
    return MyDslPackage.Literals.OCCURENCE_AT_MOST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputStatement getSeceondEvent()
  {
    if (seceondEvent != null && seceondEvent.eIsProxy())
    {
      InternalEObject oldSeceondEvent = (InternalEObject)seceondEvent;
      seceondEvent = (InputStatement)eResolveProxy(oldSeceondEvent);
      if (seceondEvent != oldSeceondEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT, oldSeceondEvent, seceondEvent));
      }
    }
    return seceondEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputStatement basicGetSeceondEvent()
  {
    return seceondEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSeceondEvent(InputStatement newSeceondEvent)
  {
    InputStatement oldSeceondEvent = seceondEvent;
    seceondEvent = newSeceondEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT, oldSeceondEvent, seceondEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MaxDuration getMaxDuration()
  {
    return maxDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxDuration(MaxDuration newMaxDuration, NotificationChain msgs)
  {
    MaxDuration oldMaxDuration = maxDuration;
    maxDuration = newMaxDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION, oldMaxDuration, newMaxDuration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxDuration(MaxDuration newMaxDuration)
  {
    if (newMaxDuration != maxDuration)
    {
      NotificationChain msgs = null;
      if (maxDuration != null)
        msgs = ((InternalEObject)maxDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION, null, msgs);
      if (newMaxDuration != null)
        msgs = ((InternalEObject)newMaxDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION, null, msgs);
      msgs = basicSetMaxDuration(newMaxDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION, newMaxDuration, newMaxDuration));
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
      case MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION:
        return basicSetMaxDuration(null, msgs);
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
      case MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT:
        if (resolve) return getSeceondEvent();
        return basicGetSeceondEvent();
      case MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION:
        return getMaxDuration();
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
      case MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT:
        setSeceondEvent((InputStatement)newValue);
        return;
      case MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION:
        setMaxDuration((MaxDuration)newValue);
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
      case MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT:
        setSeceondEvent((InputStatement)null);
        return;
      case MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION:
        setMaxDuration((MaxDuration)null);
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
      case MyDslPackage.OCCURENCE_AT_MOST__SECEOND_EVENT:
        return seceondEvent != null;
      case MyDslPackage.OCCURENCE_AT_MOST__MAX_DURATION:
        return maxDuration != null;
    }
    return super.eIsSet(featureID);
  }

} //OccurenceAtMostImpl