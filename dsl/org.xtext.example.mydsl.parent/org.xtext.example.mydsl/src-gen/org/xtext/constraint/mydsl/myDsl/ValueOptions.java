/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getNumberLiteral <em>Number Literal</em>}</li>
 *   <li>{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getTextLiteral <em>Text Literal</em>}</li>
 * </ul>
 *
 * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getValueOptions()
 * @model
 * @generated
 */
public interface ValueOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>String Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Literal</em>' containment reference.
   * @see #setStringLiteral(StringLiteral)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getValueOptions_StringLiteral()
   * @model containment="true"
   * @generated
   */
  StringLiteral getStringLiteral();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getStringLiteral <em>String Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Literal</em>' containment reference.
   * @see #getStringLiteral()
   * @generated
   */
  void setStringLiteral(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Number Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Literal</em>' containment reference.
   * @see #setNumberLiteral(NumberLiteral)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getValueOptions_NumberLiteral()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getNumberLiteral();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getNumberLiteral <em>Number Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Literal</em>' containment reference.
   * @see #getNumberLiteral()
   * @generated
   */
  void setNumberLiteral(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Text Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Literal</em>' containment reference.
   * @see #setTextLiteral(TextLiteral)
   * @see org.xtext.constraint.mydsl.myDsl.MyDslPackage#getValueOptions_TextLiteral()
   * @model containment="true"
   * @generated
   */
  TextLiteral getTextLiteral();

  /**
   * Sets the value of the '{@link org.xtext.constraint.mydsl.myDsl.ValueOptions#getTextLiteral <em>Text Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Literal</em>' containment reference.
   * @see #getTextLiteral()
   * @generated
   */
  void setTextLiteral(TextLiteral value);

} // ValueOptions
