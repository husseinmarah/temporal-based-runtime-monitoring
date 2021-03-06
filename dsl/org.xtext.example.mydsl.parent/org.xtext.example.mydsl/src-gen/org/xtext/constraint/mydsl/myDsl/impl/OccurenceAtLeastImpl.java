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
import org.xtext.constraint.mydsl.myDsl.MinDuration;
import org.xtext.constraint.mydsl.myDsl.MyDslPackage;
import org.xtext.constraint.mydsl.myDsl.OccurenceAtLeast;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurence At Least</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.OccurenceAtLeastImpl#getSeceondEvent <em>Seceond Event</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.OccurenceAtLeastImpl#getMinDuration <em>Min Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurenceAtLeastImpl extends MinimalEObjectImpl.Container implements OccurenceAtLeast
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
   * The cached value of the '{@link #getMinDuration() <em>Min Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinDuration()
   * @generated
   * @ordered
   */
  protected MinDuration minDuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccurenceAtLeastImpl()
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
    return MyDslPackage.Literals.OCCURENCE_AT_LEAST;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT, oldSeceondEvent, seceondEvent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT, oldSeceondEvent, seceondEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MinDuration getMinDuration()
  {
    return minDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinDuration(MinDuration newMinDuration, NotificationChain msgs)
  {
    MinDuration oldMinDuration = minDuration;
    minDuration = newMinDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION, oldMinDuration, newMinDuration);
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
  public void setMinDuration(MinDuration newMinDuration)
  {
    if (newMinDuration != minDuration)
    {
      NotificationChain msgs = null;
      if (minDuration != null)
        msgs = ((InternalEObject)minDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION, null, msgs);
      if (newMinDuration != null)
        msgs = ((InternalEObject)newMinDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION, null, msgs);
      msgs = basicSetMinDuration(newMinDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION, newMinDuration, newMinDuration));
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
      case MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION:
        return basicSetMinDuration(null, msgs);
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
      case MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT:
        if (resolve) return getSeceondEvent();
        return basicGetSeceondEvent();
      case MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION:
        return getMinDuration();
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
      case MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT:
        setSeceondEvent((InputStatement)newValue);
        return;
      case MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION:
        setMinDuration((MinDuration)newValue);
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
      case MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT:
        setSeceondEvent((InputStatement)null);
        return;
      case MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION:
        setMinDuration((MinDuration)null);
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
      case MyDslPackage.OCCURENCE_AT_LEAST__SECEOND_EVENT:
        return seceondEvent != null;
      case MyDslPackage.OCCURENCE_AT_LEAST__MIN_DURATION:
        return minDuration != null;
    }
    return super.eIsSet(featureID);
  }

} //OccurenceAtLeastImpl
