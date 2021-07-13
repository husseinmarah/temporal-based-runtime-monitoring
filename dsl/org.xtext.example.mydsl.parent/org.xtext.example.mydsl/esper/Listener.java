/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Listener#getLogger <em>Logger</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getListener()
 * @model
 * @generated
 */
public interface Listener extends EObject {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' containment reference.
	 * @see #setLogger(Logger)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getListener_Logger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Listener#getLogger <em>Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' containment reference.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

} // Listener
