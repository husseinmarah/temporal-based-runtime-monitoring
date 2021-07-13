/**
 */
package at.jku.se.mosumo.dronology.constraint.esper.impl;

import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;
import at.jku.se.mosumo.dronology.constraint.esper.Listener;

import at.jku.se.mosumo.dronology.constraint.esper.Logger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ListenerImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListenerImpl extends MinimalEObjectImpl.Container implements Listener {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsperPackage.Literals.LISTENER;
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
					EsperPackage.LISTENER__LOGGER, oldLogger, newLogger);
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
						EOPPOSITE_FEATURE_BASE - EsperPackage.LISTENER__LOGGER, null, msgs);
			if (newLogger != null)
				msgs = ((InternalEObject) newLogger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.LISTENER__LOGGER, null, msgs);
			msgs = basicSetLogger(newLogger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.LISTENER__LOGGER, newLogger, newLogger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsperPackage.LISTENER__LOGGER:
			return basicSetLogger(null, msgs);
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
		case EsperPackage.LISTENER__LOGGER:
			return getLogger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EsperPackage.LISTENER__LOGGER:
			setLogger((Logger) newValue);
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
		case EsperPackage.LISTENER__LOGGER:
			setLogger((Logger) null);
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
		case EsperPackage.LISTENER__LOGGER:
			return logger != null;
		}
		return super.eIsSet(featureID);
	}

} //ListenerImpl
