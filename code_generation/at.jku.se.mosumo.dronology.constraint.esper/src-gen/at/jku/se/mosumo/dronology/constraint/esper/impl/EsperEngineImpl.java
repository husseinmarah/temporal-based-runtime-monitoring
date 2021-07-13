/**
 */
package at.jku.se.mosumo.dronology.constraint.esper.impl;

import at.jku.se.mosumo.dronology.constraint.esper.Configuration;
import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.EPRuntime;
import at.jku.se.mosumo.dronology.constraint.esper.EPServiceProvider;
import at.jku.se.mosumo.dronology.constraint.esper.EsperEngine;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;

import at.jku.se.mosumo.dronology.constraint.esper.Logger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getEpruntime <em>Epruntime</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getEpserviceprovider <em>Epserviceprovider</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.EsperEngineImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsperEngineImpl extends MinimalEObjectImpl.Container implements EsperEngine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getEpruntime() <em>Epruntime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpruntime()
	 * @generated
	 * @ordered
	 */
	protected EPRuntime epruntime;

	/**
	 * The cached value of the '{@link #getEpserviceprovider() <em>Epserviceprovider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpserviceprovider()
	 * @generated
	 * @ordered
	 */
	protected EPServiceProvider epserviceprovider;

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected at.jku.se.mosumo.dronology.constraint.esper.Package package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsperEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsperPackage.Literals.ESPER_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					EsperPackage.ESPER_ENGINE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPRuntime getEpruntime() {
		return epruntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpruntime(EPRuntime newEpruntime, NotificationChain msgs) {
		EPRuntime oldEpruntime = epruntime;
		epruntime = newEpruntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.ESPER_ENGINE__EPRUNTIME, oldEpruntime, newEpruntime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpruntime(EPRuntime newEpruntime) {
		if (newEpruntime != epruntime) {
			NotificationChain msgs = null;
			if (epruntime != null)
				msgs = ((InternalEObject) epruntime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__EPRUNTIME, null, msgs);
			if (newEpruntime != null)
				msgs = ((InternalEObject) newEpruntime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__EPRUNTIME, null, msgs);
			msgs = basicSetEpruntime(newEpruntime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__EPRUNTIME, newEpruntime,
					newEpruntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPServiceProvider getEpserviceprovider() {
		return epserviceprovider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpserviceprovider(EPServiceProvider newEpserviceprovider, NotificationChain msgs) {
		EPServiceProvider oldEpserviceprovider = epserviceprovider;
		epserviceprovider = newEpserviceprovider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER, oldEpserviceprovider, newEpserviceprovider);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpserviceprovider(EPServiceProvider newEpserviceprovider) {
		if (newEpserviceprovider != epserviceprovider) {
			NotificationChain msgs = null;
			if (epserviceprovider != null)
				msgs = ((InternalEObject) epserviceprovider).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER, null, msgs);
			if (newEpserviceprovider != null)
				msgs = ((InternalEObject) newEpserviceprovider).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER, null, msgs);
			msgs = basicSetEpserviceprovider(newEpserviceprovider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER,
					newEpserviceprovider, newEpserviceprovider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogger(Logger newLogger, NotificationChain msgs) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.ESPER_ENGINE__LOGGER, oldLogger, newLogger);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogger(Logger newLogger) {
		if (newLogger != logger) {
			NotificationChain msgs = null;
			if (logger != null)
				msgs = ((InternalEObject) logger).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__LOGGER, null, msgs);
			if (newLogger != null)
				msgs = ((InternalEObject) newLogger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__LOGGER, null, msgs);
			msgs = basicSetLogger(newLogger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__LOGGER, newLogger,
					newLogger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.ESPER_ENGINE__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__CONFIGURATION,
					newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public at.jku.se.mosumo.dronology.constraint.esper.Package getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(at.jku.se.mosumo.dronology.constraint.esper.Package newPackage,
			NotificationChain msgs) {
		at.jku.se.mosumo.dronology.constraint.esper.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.ESPER_ENGINE__PACKAGE, oldPackage, newPackage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(at.jku.se.mosumo.dronology.constraint.esper.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject) package_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.ESPER_ENGINE__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.ESPER_ENGINE__PACKAGE, newPackage,
					newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsperPackage.ESPER_ENGINE__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case EsperPackage.ESPER_ENGINE__EPRUNTIME:
			return basicSetEpruntime(null, msgs);
		case EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER:
			return basicSetEpserviceprovider(null, msgs);
		case EsperPackage.ESPER_ENGINE__LOGGER:
			return basicSetLogger(null, msgs);
		case EsperPackage.ESPER_ENGINE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case EsperPackage.ESPER_ENGINE__PACKAGE:
			return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EsperPackage.ESPER_ENGINE__NAME:
			return getName();
		case EsperPackage.ESPER_ENGINE__CONSTRAINT:
			return getConstraint();
		case EsperPackage.ESPER_ENGINE__EPRUNTIME:
			return getEpruntime();
		case EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER:
			return getEpserviceprovider();
		case EsperPackage.ESPER_ENGINE__LOGGER:
			return getLogger();
		case EsperPackage.ESPER_ENGINE__CONFIGURATION:
			return getConfiguration();
		case EsperPackage.ESPER_ENGINE__PACKAGE:
			return getPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EsperPackage.ESPER_ENGINE__NAME:
			setName((String) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__EPRUNTIME:
			setEpruntime((EPRuntime) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER:
			setEpserviceprovider((EPServiceProvider) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__LOGGER:
			setLogger((Logger) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case EsperPackage.ESPER_ENGINE__PACKAGE:
			setPackage((at.jku.se.mosumo.dronology.constraint.esper.Package) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EsperPackage.ESPER_ENGINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsperPackage.ESPER_ENGINE__CONSTRAINT:
			getConstraint().clear();
			return;
		case EsperPackage.ESPER_ENGINE__EPRUNTIME:
			setEpruntime((EPRuntime) null);
			return;
		case EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER:
			setEpserviceprovider((EPServiceProvider) null);
			return;
		case EsperPackage.ESPER_ENGINE__LOGGER:
			setLogger((Logger) null);
			return;
		case EsperPackage.ESPER_ENGINE__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case EsperPackage.ESPER_ENGINE__PACKAGE:
			setPackage((at.jku.se.mosumo.dronology.constraint.esper.Package) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EsperPackage.ESPER_ENGINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EsperPackage.ESPER_ENGINE__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case EsperPackage.ESPER_ENGINE__EPRUNTIME:
			return epruntime != null;
		case EsperPackage.ESPER_ENGINE__EPSERVICEPROVIDER:
			return epserviceprovider != null;
		case EsperPackage.ESPER_ENGINE__LOGGER:
			return logger != null;
		case EsperPackage.ESPER_ENGINE__CONFIGURATION:
			return configuration != null;
		case EsperPackage.ESPER_ENGINE__PACKAGE:
			return package_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EsperEngineImpl
