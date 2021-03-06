/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.PatternStatement#getPatternType <em>Pattern Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getPatternStatement()
 * @model
 * @generated
 */
public interface PatternStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Type</em>' containment reference.
   * @see #setPatternType(PatternType)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getPatternStatement_PatternType()
   * @model containment="true"
   * @generated
   */
  PatternType getPatternType();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.PatternStatement#getPatternType <em>Pattern Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Type</em>' containment reference.
   * @see #getPatternType()
   * @generated
   */
  void setPatternType(PatternType value);

} // PatternStatement
