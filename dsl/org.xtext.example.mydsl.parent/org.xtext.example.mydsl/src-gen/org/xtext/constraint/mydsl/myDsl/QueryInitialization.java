/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getInputStatements <em>Input Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getQueryInitialization()
 * @model
 * @generated
 */
public interface QueryInitialization extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getQueryInitialization_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Window</em>' containment reference.
   * @see #setTimeWindow(TimeWindow)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getQueryInitialization_TimeWindow()
   * @model containment="true"
   * @generated
   */
  TimeWindow getTimeWindow();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getTimeWindow <em>Time Window</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Window</em>' containment reference.
   * @see #getTimeWindow()
   * @generated
   */
  void setTimeWindow(TimeWindow value);

  /**
   * Returns the value of the '<em><b>Input Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Statements</em>' containment reference.
   * @see #setInputStatements(InputStatement)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getQueryInitialization_InputStatements()
   * @model containment="true"
   * @generated
   */
  InputStatement getInputStatements();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.QueryInitialization#getInputStatements <em>Input Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Statements</em>' containment reference.
   * @see #getInputStatements()
   * @generated
   */
  void setInputStatements(InputStatement value);

} // QueryInitialization
