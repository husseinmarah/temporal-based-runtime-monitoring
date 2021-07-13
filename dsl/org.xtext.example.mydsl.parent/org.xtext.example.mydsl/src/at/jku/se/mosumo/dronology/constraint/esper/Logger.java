/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getLogger()
 * @model
 * @generated
 */
public interface Logger extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getLogger_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getLogger_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Logger
