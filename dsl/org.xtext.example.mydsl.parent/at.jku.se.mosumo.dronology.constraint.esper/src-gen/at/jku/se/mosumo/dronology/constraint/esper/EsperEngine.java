/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpruntime <em>Epruntime</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpserviceprovider <em>Epserviceprovider</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getLogger <em>Logger</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine()
 * @model
 * @generated
 */
public interface EsperEngine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.mosumo.dronology.constraint.esper.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Epruntime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epruntime</em>' containment reference.
	 * @see #setEpruntime(EPRuntime)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Epruntime()
	 * @model containment="true"
	 * @generated
	 */
	EPRuntime getEpruntime();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpruntime <em>Epruntime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epruntime</em>' containment reference.
	 * @see #getEpruntime()
	 * @generated
	 */
	void setEpruntime(EPRuntime value);

	/**
	 * Returns the value of the '<em><b>Epserviceprovider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epserviceprovider</em>' containment reference.
	 * @see #setEpserviceprovider(EPServiceProvider)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Epserviceprovider()
	 * @model containment="true"
	 * @generated
	 */
	EPServiceProvider getEpserviceprovider();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpserviceprovider <em>Epserviceprovider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epserviceprovider</em>' containment reference.
	 * @see #getEpserviceprovider()
	 * @generated
	 */
	void setEpserviceprovider(EPServiceProvider value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' containment reference.
	 * @see #setLogger(Logger)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Logger()
	 * @model containment="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getLogger <em>Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' containment reference.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(at.jku.se.mosumo.dronology.constraint.esper.Package)
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage#getEsperEngine_Package()
	 * @model containment="true" required="true"
	 * @generated
	 */
	at.jku.se.mosumo.dronology.constraint.esper.Package getPackage();

	/**
	 * Sets the value of the '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(at.jku.se.mosumo.dronology.constraint.esper.Package value);

} // EsperEngine
