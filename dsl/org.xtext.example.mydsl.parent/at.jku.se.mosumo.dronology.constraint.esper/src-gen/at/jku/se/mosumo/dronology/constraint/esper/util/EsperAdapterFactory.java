/**
 */
package at.jku.se.mosumo.dronology.constraint.esper.util;

import at.jku.se.mosumo.dronology.constraint.esper.Agent;
import at.jku.se.mosumo.dronology.constraint.esper.Configuration;
import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.EPRuntime;
import at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider;
import at.jku.se.mosumo.dronology.constraint.esper.EsperComponent;
import at.jku.se.mosumo.dronology.constraint.esper.EsperEngine;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;
import at.jku.se.mosumo.dronology.constraint.esper.Event;
import at.jku.se.mosumo.dronology.constraint.esper.Listener;
import at.jku.se.mosumo.dronology.constraint.esper.Logger;
import at.jku.se.mosumo.dronology.constraint.esper.Variable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperPackage
 * @generated
 */
public class EsperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EsperPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsperSwitch<Adapter> modelSwitch = new EsperSwitch<Adapter>() {
		@Override
		public Adapter caseEsperComponent(EsperComponent object) {
			return createEsperComponentAdapter();
		}

		@Override
		public Adapter caseEsperEngine(EsperEngine object) {
			return createEsperEngineAdapter();
		}

		@Override
		public Adapter caseEPServiceProvider(EPServiceProvider object) {
			return createEPServiceProviderAdapter();
		}

		@Override
		public Adapter caseEPRuntime(EPRuntime object) {
			return createEPRuntimeAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseListener(Listener object) {
			return createListenerAdapter();
		}

		@Override
		public Adapter caseLogger(Logger object) {
			return createLoggerAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter casePackage(at.jku.se.mosumo.dronology.constraint.esper.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperComponent
	 * @generated
	 */
	public Adapter createEsperComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.EsperEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EsperEngine
	 * @generated
	 */
	public Adapter createEsperEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider <em>EP Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider
	 * @generated
	 */
	public Adapter createEPServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.EPRuntime <em>EP Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.EPRuntime
	 * @generated
	 */
	public Adapter createEPRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Listener
	 * @generated
	 */
	public Adapter createListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Logger
	 * @generated
	 */
	public Adapter createLoggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.mosumo.dronology.constraint.esper.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.mosumo.dronology.constraint.esper.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EsperAdapterFactory
