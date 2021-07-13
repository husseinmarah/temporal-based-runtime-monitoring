/**
 */
package at.jku.se.mosumo.dronology.constraint.esper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperFactory
 * @model kind="package"
 * @generated
 */
public interface EsperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.jku.se.mosumo.dronology.constraint/esper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsperPackage eINSTANCE = at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperComponentImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEsperComponent()
	 * @generated
	 */
	int ESPER_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEsperEngine()
	 * @generated
	 */
	int ESPER_ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Epruntime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__EPRUNTIME = 2;

	/**
	 * The feature id for the '<em><b>Epserviceprovider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__EPSERVICEPROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__LOGGER = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE__PACKAGE = 6;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPER_ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EPServiceProviderImpl <em>EP Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EPServiceProviderImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEPServiceProvider()
	 * @generated
	 */
	int EP_SERVICE_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SERVICE_PROVIDER__NAME = ESPER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EP Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SERVICE_PROVIDER_FEATURE_COUNT = ESPER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EP Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SERVICE_PROVIDER_OPERATION_COUNT = ESPER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EPRuntimeImpl <em>EP Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EPRuntimeImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEPRuntime()
	 * @generated
	 */
	int EP_RUNTIME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_RUNTIME__NAME = ESPER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EP Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_RUNTIME_FEATURE_COUNT = ESPER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EP Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_RUNTIME_OPERATION_COUNT = ESPER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Ep Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EP_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Statement Subscriber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STATEMENT_SUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LOGGER = 4;

	/**
	 * The feature id for the '<em><b>Syntax Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SYNTAX_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__AGENT = 7;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EventImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.VariableImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ListenerImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getListener()
	 * @generated
	 */
	int LISTENER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__LOGGER = 1;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.LoggerImpl <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.LoggerImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ConfigurationImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = ESPER_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ESPER_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ESPER_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.PackageImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__QUALIFIED_NAME = 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.AgentImpl
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.mosumo.dronology.constraint.esper.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.mosumo.dronology.constraint.esper.DataType
	 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperComponent
	 * @generated
	 */
	EClass getEsperComponent();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine
	 * @generated
	 */
	EClass getEsperEngine();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getName()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EAttribute getEsperEngine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConstraint()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpruntime <em>Epruntime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Epruntime</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpruntime()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Epruntime();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpserviceprovider <em>Epserviceprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Epserviceprovider</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getEpserviceprovider()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Epserviceprovider();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logger</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getLogger()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Logger();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getConfiguration()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine#getPackage()
	 * @see #getEsperEngine()
	 * @generated
	 */
	EReference getEsperEngine_Package();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider <em>EP Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Service Provider</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider
	 * @generated
	 */
	EClass getEPServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider#getName()
	 * @see #getEPServiceProvider()
	 * @generated
	 */
	EAttribute getEPServiceProvider_Name();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.EPRuntime <em>EP Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EP Runtime</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPRuntime
	 * @generated
	 */
	EClass getEPRuntime();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.EPRuntime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPRuntime#getName()
	 * @see #getEPRuntime()
	 * @generated
	 */
	EAttribute getEPRuntime_Name();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEpStatement <em>Ep Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ep Statement</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEpStatement()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_EpStatement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getStatementSubscriber <em>Statement Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Subscriber</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getStatementSubscriber()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_StatementSubscriber();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listener</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getListener()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Listener();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getEvent()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Event();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logger</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getLogger()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Logger();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getSyntaxExpression <em>Syntax Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax Expression</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getSyntaxExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_SyntaxExpression();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint#getAgent()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Agent();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.se.mosumo.dronology.constraint.esper.Event#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Event#getVariable()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Variable();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Listener
	 * @generated
	 */
	EClass getListener();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Listener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Listener#getName()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Name();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.mosumo.dronology.constraint.esper.Listener#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logger</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Listener#getLogger()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_Logger();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Logger
	 * @generated
	 */
	EClass getLogger();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Logger#getName()
	 * @see #getLogger()
	 * @generated
	 */
	EAttribute getLogger_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Logger#getText()
	 * @see #getLogger()
	 * @generated
	 */
	EAttribute getLogger_Text();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Package#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Package#getQualifiedName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_QualifiedName();

	/**
	 * Returns the meta object for class '{@link at.jku.se.mosumo.dronology.constraint.esper.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.mosumo.dronology.constraint.esper.Agent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Agent#getId()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Id();

	/**
	 * Returns the meta object for the reference list '{@link at.jku.se.mosumo.dronology.constraint.esper.Agent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Agent#getEvent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Event();

	/**
	 * Returns the meta object for enum '{@link at.jku.se.mosumo.dronology.constraint.esper.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsperFactory getEsperFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperComponentImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEsperComponent()
		 * @generated
		 */
		EClass ESPER_COMPONENT = eINSTANCE.getEsperComponent();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEsperEngine()
		 * @generated
		 */
		EClass ESPER_ENGINE = eINSTANCE.getEsperEngine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPER_ENGINE__NAME = eINSTANCE.getEsperEngine_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__CONSTRAINT = eINSTANCE.getEsperEngine_Constraint();

		/**
		 * The meta object literal for the '<em><b>Epruntime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__EPRUNTIME = eINSTANCE.getEsperEngine_Epruntime();

		/**
		 * The meta object literal for the '<em><b>Epserviceprovider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__EPSERVICEPROVIDER = eINSTANCE.getEsperEngine_Epserviceprovider();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__LOGGER = eINSTANCE.getEsperEngine_Logger();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__CONFIGURATION = eINSTANCE.getEsperEngine_Configuration();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPER_ENGINE__PACKAGE = eINSTANCE.getEsperEngine_Package();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EPServiceProviderImpl <em>EP Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EPServiceProviderImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEPServiceProvider()
		 * @generated
		 */
		EClass EP_SERVICE_PROVIDER = eINSTANCE.getEPServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SERVICE_PROVIDER__NAME = eINSTANCE.getEPServiceProvider_Name();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EPRuntimeImpl <em>EP Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EPRuntimeImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEPRuntime()
		 * @generated
		 */
		EClass EP_RUNTIME = eINSTANCE.getEPRuntime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_RUNTIME__NAME = eINSTANCE.getEPRuntime_Name();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Ep Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EP_STATEMENT = eINSTANCE.getConstraint_EpStatement();

		/**
		 * The meta object literal for the '<em><b>Statement Subscriber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STATEMENT_SUBSCRIBER = eINSTANCE.getConstraint_StatementSubscriber();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__LISTENER = eINSTANCE.getConstraint_Listener();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__EVENT = eINSTANCE.getConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__LOGGER = eINSTANCE.getConstraint_Logger();

		/**
		 * The meta object literal for the '<em><b>Syntax Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__SYNTAX_EXPRESSION = eINSTANCE.getConstraint_SyntaxExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__AGENT = eINSTANCE.getConstraint_Agent();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EventImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__VARIABLE = eINSTANCE.getEvent_Variable();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.VariableImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ListenerImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getListener()
		 * @generated
		 */
		EClass LISTENER = eINSTANCE.getListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__NAME = eINSTANCE.getListener_Name();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__LOGGER = eINSTANCE.getListener_Logger();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.LoggerImpl <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.LoggerImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGER__NAME = eINSTANCE.getLogger_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGER__TEXT = eINSTANCE.getLogger_Text();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.ConfigurationImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.PackageImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__QUALIFIED_NAME = eINSTANCE.getPackage_QualifiedName();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.AgentImpl
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ID = eINSTANCE.getAgent_Id();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EVENT = eINSTANCE.getAgent_Event();

		/**
		 * The meta object literal for the '{@link at.jku.se.mosumo.dronology.constraint.esper.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.mosumo.dronology.constraint.esper.DataType
		 * @see at.jku.se.mosumo.dronology.constraint.esper.impl.EsperPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //EsperPackage
