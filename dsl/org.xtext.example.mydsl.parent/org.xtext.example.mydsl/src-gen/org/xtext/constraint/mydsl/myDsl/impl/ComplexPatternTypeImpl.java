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

import org.xtext.constraint.mydsl.myDsl.ComplexPatternOptions;
import org.xtext.constraint.mydsl.myDsl.ComplexPatternType;
import org.xtext.constraint.mydsl.myDsl.GreedyQuantifiers;
import org.xtext.constraint.mydsl.myDsl.InputStatement;
import org.xtext.constraint.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.ComplexPatternTypeImpl#getFirstEvent <em>First Event</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.ComplexPatternTypeImpl#getGreedyQuantifiers <em>Greedy Quantifiers</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.impl.ComplexPatternTypeImpl#getComplexPatternOptions <em>Complex Pattern Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexPatternTypeImpl extends MinimalEObjectImpl.Container implements ComplexPatternType
{
  /**
   * The cached value of the '{@link #getFirstEvent() <em>First Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstEvent()
   * @generated
   * @ordered
   */
  protected InputStatement firstEvent;

  /**
   * The default value of the '{@link #getGreedyQuantifiers() <em>Greedy Quantifiers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreedyQuantifiers()
   * @generated
   * @ordered
   */
  protected static final GreedyQuantifiers GREEDY_QUANTIFIERS_EDEFAULT = GreedyQuantifiers.ONCE;

  /**
   * The cached value of the '{@link #getGreedyQuantifiers() <em>Greedy Quantifiers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreedyQuantifiers()
   * @generated
   * @ordered
   */
  protected GreedyQuantifiers greedyQuantifiers = GREEDY_QUANTIFIERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getComplexPatternOptions() <em>Complex Pattern Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplexPatternOptions()
   * @generated
   * @ordered
   */
  protected EList<ComplexPatternOptions> complexPatternOptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexPatternTypeImpl()
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
    return MyDslPackage.Literals.COMPLEX_PATTERN_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputStatement getFirstEvent()
  {
    if (firstEvent != null && firstEvent.eIsProxy())
    {
      InternalEObject oldFirstEvent = (InternalEObject)firstEvent;
      firstEvent = (InputStatement)eResolveProxy(oldFirstEvent);
      if (firstEvent != oldFirstEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT, oldFirstEvent, firstEvent));
      }
    }
    return firstEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputStatement basicGetFirstEvent()
  {
    return firstEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstEvent(InputStatement newFirstEvent)
  {
    InputStatement oldFirstEvent = firstEvent;
    firstEvent = newFirstEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT, oldFirstEvent, firstEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreedyQuantifiers getGreedyQuantifiers()
  {
    return greedyQuantifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGreedyQuantifiers(GreedyQuantifiers newGreedyQuantifiers)
  {
    GreedyQuantifiers oldGreedyQuantifiers = greedyQuantifiers;
    greedyQuantifiers = newGreedyQuantifiers == null ? GREEDY_QUANTIFIERS_EDEFAULT : newGreedyQuantifiers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPLEX_PATTERN_TYPE__GREEDY_QUANTIFIERS, oldGreedyQuantifiers, greedyQuantifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComplexPatternOptions> getComplexPatternOptions()
  {
    if (complexPatternOptions == null)
    {
      complexPatternOptions = new EObjectContainmentEList<ComplexPatternOptions>(ComplexPatternOptions.class, this, MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS);
    }
    return complexPatternOptions;
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
      case MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS:
        return ((InternalEList<?>)getComplexPatternOptions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT:
        if (resolve) return getFirstEvent();
        return basicGetFirstEvent();
      case MyDslPackage.COMPLEX_PATTERN_TYPE__GREEDY_QUANTIFIERS:
        return getGreedyQuantifiers();
      case MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS:
        return getComplexPatternOptions();
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
      case MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT:
        setFirstEvent((InputStatement)newValue);
        return;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__GREEDY_QUANTIFIERS:
        setGreedyQuantifiers((GreedyQuantifiers)newValue);
        return;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS:
        getComplexPatternOptions().clear();
        getComplexPatternOptions().addAll((Collection<? extends ComplexPatternOptions>)newValue);
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
      case MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT:
        setFirstEvent((InputStatement)null);
        return;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__GREEDY_QUANTIFIERS:
        setGreedyQuantifiers(GREEDY_QUANTIFIERS_EDEFAULT);
        return;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS:
        getComplexPatternOptions().clear();
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
      case MyDslPackage.COMPLEX_PATTERN_TYPE__FIRST_EVENT:
        return firstEvent != null;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__GREEDY_QUANTIFIERS:
        return greedyQuantifiers != GREEDY_QUANTIFIERS_EDEFAULT;
      case MyDslPackage.COMPLEX_PATTERN_TYPE__COMPLEX_PATTERN_OPTIONS:
        return complexPatternOptions != null && !complexPatternOptions.isEmpty();
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
    result.append(" (greedyQuantifiers: ");
    result.append(greedyQuantifiers);
    result.append(')');
    return result.toString();
  }

} //ComplexPatternTypeImpl
