/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.se.mosumo.dronology.constraint.esper.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.DataType
	 * @see #setType(DataType)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Variable
