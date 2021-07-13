/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl.impl;

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

import org.xtext.constraint.mydsl.myDsl.InputStatement;
import org.xtext.constraint.mydsl.myDsl.MyDslPackage;
import org.xtext.constraint.mydsl.myDsl.PatternInitialization;
import org.xtext.constraint.mydsl.myDsl.PatternStatement;
import org.xtext.constraint.mydsl.myDsl.TimeWindow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.PatternInitializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.PatternInitializationImpl#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.PatternInitializationImpl#getInputStatements <em>Input Statements</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.PatternInitializationImpl#getPatternStatements <em>Pattern Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternInitializationImpl extends MinimalEObjectImpl.Container implements PatternInitialization
{
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
   * The cached value of the '{@link #getTimeWindow() <em>Time Window</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeWindow()
   * @generated
   * @ordered
   */
  protected TimeWindow timeWindow;

  /**
   * The cached value of the '{@link #getInputStatements() <em>Input Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputStatements()
   * @generated
   * @ordered
   */
  protected EList<InputStatement> inputStatements;

  /**
   * The cached value of the '{@link #getPatternStatements() <em>Pattern Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternStatements()
   * @generated
   * @ordered
   */
  protected PatternStatement patternStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternInitializationImpl()
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
    return MyDslPackage.Literals.PATTERN_INITIALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PATTERN_INITIALIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeWindow getTimeWindow()
  {
    return timeWindow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeWindow(TimeWindow newTimeWindow, NotificationChain msgs)
  {
    TimeWindow oldTimeWindow = timeWindow;
    timeWindow = newTimeWindow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW, oldTimeWindow, newTimeWindow);
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
  public void setTimeWindow(TimeWindow newTimeWindow)
  {
    if (newTimeWindow != timeWindow)
    {
      NotificationChain msgs = null;
      if (timeWindow != null)
        msgs = ((InternalEObject)timeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW, null, msgs);
      if (newTimeWindow != null)
        msgs = ((InternalEObject)newTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW, null, msgs);
      msgs = basicSetTimeWindow(newTimeWindow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW, newTimeWindow, newTimeWindow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InputStatement> getInputStatements()
  {
    if (inputStatements == null)
    {
      inputStatements = new EObjectContainmentEList<InputStatement>(InputStatement.class, this, MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS);
    }
    return inputStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternStatement getPatternStatements()
  {
    return patternStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternStatements(PatternStatement newPatternStatements, NotificationChain msgs)
  {
    PatternStatement oldPatternStatements = patternStatements;
    patternStatements = newPatternStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS, oldPatternStatements, newPatternStatements);
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
  public void setPatternStatements(PatternStatement newPatternStatements)
  {
    if (newPatternStatements != patternStatements)
    {
      NotificationChain msgs = null;
      if (patternStatements != null)
        msgs = ((InternalEObject)patternStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS, null, msgs);
      if (newPatternStatements != null)
        msgs = ((InternalEObject)newPatternStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS, null, msgs);
      msgs = basicSetPatternStatements(newPatternStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS, newPatternStatements, newPatternStatements));
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
      case MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW:
        return basicSetTimeWindow(null, msgs);
      case MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS:
        return ((InternalEList<?>)getInputStatements()).basicRemove(otherEnd, msgs);
      case MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS:
        return basicSetPatternStatements(null, msgs);
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
      case MyDslPackage.PATTERN_INITIALIZATION__NAME:
        return getName();
      case MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW:
        return getTimeWindow();
      case MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS:
        return getInputStatements();
      case MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS:
        return getPatternStatements();
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
      case MyDslPackage.PATTERN_INITIALIZATION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW:
        setTimeWindow((TimeWindow)newValue);
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS:
        getInputStatements().clear();
        getInputStatements().addAll((Collection<? extends InputStatement>)newValue);
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS:
        setPatternStatements((PatternStatement)newValue);
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
      case MyDslPackage.PATTERN_INITIALIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW:
        setTimeWindow((TimeWindow)null);
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS:
        getInputStatements().clear();
        return;
      case MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS:
        setPatternStatements((PatternStatement)null);
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
      case MyDslPackage.PATTERN_INITIALIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.PATTERN_INITIALIZATION__TIME_WINDOW:
        return timeWindow != null;
      case MyDslPackage.PATTERN_INITIALIZATION__INPUT_STATEMENTS:
        return inputStatements != null && !inputStatements.isEmpty();
      case MyDslPackage.PATTERN_INITIALIZATION__PATTERN_STATEMENTS:
        return patternStatements != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PatternInitializationImpl