/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.constraint.mydsl.myDsl.MyDslPackage;
import org.xtext.constraint.mydsl.myDsl.TimeUnit;
import org.xtext.constraint.mydsl.myDsl.Timer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.TimerImpl#getTimerType <em>Timer Type</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.TimerImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.TimerImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerImpl extends MinimalEObjectImpl.Container implements Timer
{
  /**
   * The default value of the '{@link #getTimerType() <em>Timer Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerType()
   * @generated
   * @ordered
   */
  protected static final String TIMER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimerType() <em>Timer Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerType()
   * @generated
   * @ordered
   */
  protected String timerType = TIMER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeUnit()
   * @generated
   * @ordered
   */
  protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.MICRO_SECONDS;

  /**
   * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimerImpl()
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
    return MyDslPackage.Literals.TIMER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTimerType()
  {
    return timerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimerType(String newTimerType)
  {
    String oldTimerType = timerType;
    timerType = newTimerType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TIMER__TIMER_TYPE, oldTimerType, timerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TIMER__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit getTimeUnit()
  {
    return timeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeUnit(TimeUnit newTimeUnit)
  {
    TimeUnit oldTimeUnit = timeUnit;
    timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TIMER__TIME_UNIT, oldTimeUnit, timeUnit));
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
      case MyDslPackage.TIMER__TIMER_TYPE:
        return getTimerType();
      case MyDslPackage.TIMER__TIME:
        return getTime();
      case MyDslPackage.TIMER__TIME_UNIT:
        return getTimeUnit();
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
      case MyDslPackage.TIMER__TIMER_TYPE:
        setTimerType((String)newValue);
        return;
      case MyDslPackage.TIMER__TIME:
        setTime((Integer)newValue);
        return;
      case MyDslPackage.TIMER__TIME_UNIT:
        setTimeUnit((TimeUnit)newValue);
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
      case MyDslPackage.TIMER__TIMER_TYPE:
        setTimerType(TIMER_TYPE_EDEFAULT);
        return;
      case MyDslPackage.TIMER__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case MyDslPackage.TIMER__TIME_UNIT:
        setTimeUnit(TIME_UNIT_EDEFAULT);
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
      case MyDslPackage.TIMER__TIMER_TYPE:
        return TIMER_TYPE_EDEFAULT == null ? timerType != null : !TIMER_TYPE_EDEFAULT.equals(timerType);
      case MyDslPackage.TIMER__TIME:
        return time != TIME_EDEFAULT;
      case MyDslPackage.TIMER__TIME_UNIT:
        return timeUnit != TIME_UNIT_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (timerType: ");
    result.append(timerType);
    result.append(", time: ");
    result.append(time);
    result.append(", timeUnit: ");
    result.append(timeUnit);
    result.append(')');
    return result.toString();
  }

} //TimerImpl