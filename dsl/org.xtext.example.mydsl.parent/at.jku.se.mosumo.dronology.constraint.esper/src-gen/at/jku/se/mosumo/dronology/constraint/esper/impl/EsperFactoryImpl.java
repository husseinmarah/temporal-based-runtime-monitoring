/**
 */
package at.jku.se.mosumo.dronology.constraint.esper.impl;

import at.jku.se.mosumo.dronology.constraint.esper.Agent;
import at.jku.se.mosumo.dronology.constraint.esper.Configuration;
import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.DataType;
import at.jku.se.mosumo.dronology.constraint.esper.EPRuntime;
import at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider;
import at.jku.se.mosumo.dronology.constraint.esper.EsperEngine;
import at.jku.se.mosumo.dronology.constraint.esper.EsperFactory;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;
import at.jku.se.mosumo.dronology.constraint.esper.Event;
import at.jku.se.mosumo.dronology.constraint.esper.Listener;
import at.jku.se.mosumo.dronology.constraint.esper.Logger;
import at.jku.se.mosumo.dronology.constraint.esper.Variable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsperFactoryImpl extends EFactoryImpl implements EsperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EsperFactory init() {
		try {
			EsperFactory theEsperFactory = (EsperFactory) EPackage.Registry.INSTANCE.getEFactory(EsperPackage.eNS_URI);
			if (theEsperFactory != null) {
				return theEsperFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EsperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsperFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EsperPackage.ESPER_ENGINE:
			return createEsperEngine();
		case EsperPackage.EP_SERVICE_PROVIDER:
			return createEPServiceProvider();
		case EsperPackage.EP_RUNTIME:
			return createEPRuntime();
		case EsperPackage.CONSTRAINT:
			return createConstraint();
		case EsperPackage.EVENT:
			return createEvent();
		case EsperPackage.VARIABLE:
			return createVariable();
		case EsperPackage.LISTENER:
			return createListener();
		case EsperPackage.LOGGER:
			return createLogger();
		case EsperPackage.CONFIGURATION:
			return createConfiguration();
		case EsperPackage.PACKAGE:
			return createPackage();
		case EsperPackage.AGENT:
			return createAgent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EsperPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EsperPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsperEngine createEsperEngine() {
		EsperEngineImpl esperEngine = new EsperEngineImpl();
		return esperEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPServiceProvider createEPServiceProvider() {
		EPServiceProviderImpl epServiceProvider = new EPServiceProviderImpl();
		return epServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPRuntime createEPRuntime() {
		EPRuntimeImpl epRuntime = new EPRuntimeImpl();
		return epRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listener createListener() {
		ListenerImpl listener = new ListenerImpl();
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger createLogger() {
		LoggerImpl logger = new LoggerImpl();
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.jku.se.mosumo.dronology.constraint.esper.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsperPackage getEsperPackage() {
		return (EsperPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EsperPackage getPackage() {
		return EsperPackage.eINSTANCE;
	}

} //EsperFactoryImpl
