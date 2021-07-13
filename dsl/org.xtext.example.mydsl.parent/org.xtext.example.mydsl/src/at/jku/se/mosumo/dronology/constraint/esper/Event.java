/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Event#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Event#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.mosumo.dronology.constraint.esper.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEvent_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // Event
