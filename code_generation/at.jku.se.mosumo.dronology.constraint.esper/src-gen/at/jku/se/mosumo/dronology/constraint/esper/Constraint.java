/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEpStatement <em>Ep Statement</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getStatementSubscriber <em>Statement Subscriber</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getListener <em>Listener</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEvent <em>Event</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getLogger <em>Logger</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getSyntaxExpression <em>Syntax Expression</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Ep Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ep Statement</em>' attribute.
	 * @see #setEpStatement(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_EpStatement()
	 * @model
	 * @generated
	 */
	String getEpStatement();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEpStatement <em>Ep Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ep Statement</em>' attribute.
	 * @see #getEpStatement()
	 * @generated
	 */
	void setEpStatement(String value);

	/**
	 * Returns the value of the '<em><b>Statement Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Subscriber</em>' attribute.
	 * @see #setStatementSubscriber(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_StatementSubscriber()
	 * @model
	 * @generated
	 */
	String getStatementSubscriber();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getStatementSubscriber <em>Statement Subscriber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Subscriber</em>' attribute.
	 * @see #getStatementSubscriber()
	 * @generated
	 */
	void setStatementSubscriber(String value);

	/**
	 * Returns the value of the '<em><b>Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener</em>' containment reference.
	 * @see #setListener(Listener)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_Listener()
	 * @model containment="true"
	 * @generated
	 */
	Listener getListener();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getListener <em>Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener</em>' containment reference.
	 * @see #getListener()
	 * @generated
	 */
	void setListener(Listener value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' containment reference.
	 * @see #setLogger(Logger)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_Logger()
	 * @model containment="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getLogger <em>Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' containment reference.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Syntax Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax Expression</em>' attribute.
	 * @see #setSyntaxExpression(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_SyntaxExpression()
	 * @model
	 * @generated
	 */
	String getSyntaxExpression();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getSyntaxExpression <em>Syntax Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax Expression</em>' attribute.
	 * @see #getSyntaxExpression()
	 * @generated
	 */
	void setSyntaxExpression(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.mosumo.dronology.constraint.esper.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getConstraint_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgent();

} // Constraint
