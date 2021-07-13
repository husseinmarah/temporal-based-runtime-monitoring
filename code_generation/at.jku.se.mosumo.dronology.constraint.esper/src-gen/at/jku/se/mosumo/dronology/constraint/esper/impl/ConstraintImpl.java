/**
 */
package at.jku.se.mosumo.dronology.constraint.esper.impl;

import at.jku.se.mosumo.dronology.constraint.esper.Agent;
import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;
import at.jku.se.mosumo.dronology.constraint.esper.Event;
import at.jku.se.mosumo.dronology.constraint.esper.Listener;

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
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getEpStatement <em>Ep Statement</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getStatementSubscriber <em>Statement Subscriber</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getSyntaxExpression <em>Syntax Expression</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.jku.se.mosumo.dronology.constraint.esper.impl.ConstraintImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getEpStatement() <em>Ep Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String EP_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpStatement() <em>Ep Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpStatement()
	 * @generated
	 * @ordered
	 */
	protected String epStatement = EP_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatementSubscriber() <em>Statement Subscriber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSubscriber()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_SUBSCRIBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementSubscriber() <em>Statement Subscriber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSubscriber()
	 * @generated
	 * @ordered
	 */
	protected String statementSubscriber = STATEMENT_SUBSCRIBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListener() <em>Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener()
	 * @generated
	 * @ordered
	 */
	protected Listener listener;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

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
	 * The default value of the '{@link #getSyntaxExpression() <em>Syntax Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntaxExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTAX_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyntaxExpression() <em>Syntax Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntaxExpression()
	 * @generated
	 * @ordered
	 */
	protected String syntaxExpression = SYNTAX_EXPRESSION_EDEFAULT;

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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsperPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEpStatement() {
		return epStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpStatement(String newEpStatement) {
		String oldEpStatement = epStatement;
		epStatement = newEpStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__EP_STATEMENT, oldEpStatement,
					epStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementSubscriber() {
		return statementSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementSubscriber(String newStatementSubscriber) {
		String oldStatementSubscriber = statementSubscriber;
		statementSubscriber = newStatementSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__STATEMENT_SUBSCRIBER,
					oldStatementSubscriber, statementSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listener getListener() {
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListener(Listener newListener, NotificationChain msgs) {
		Listener oldListener = listener;
		listener = newListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.CONSTRAINT__LISTENER, oldListener, newListener);
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
	public void setListener(Listener newListener) {
		if (newListener != listener) {
			NotificationChain msgs = null;
			if (listener != null)
				msgs = ((InternalEObject) listener).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__LISTENER, null, msgs);
			if (newListener != null)
				msgs = ((InternalEObject) newListener).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__LISTENER, null, msgs);
			msgs = basicSetListener(newListener, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__LISTENER, newListener,
					newListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EsperPackage.CONSTRAINT__EVENT, oldEvent, newEvent);
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
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject) event).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject) newEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__EVENT, newEvent, newEvent));
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
					EsperPackage.CONSTRAINT__LOGGER, oldLogger, newLogger);
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
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__LOGGER, null, msgs);
			if (newLogger != null)
				msgs = ((InternalEObject) newLogger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EsperPackage.CONSTRAINT__LOGGER, null, msgs);
			msgs = basicSetLogger(newLogger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__LOGGER, newLogger,
					newLogger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntaxExpression() {
		return syntaxExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntaxExpression(String newSyntaxExpression) {
		String oldSyntaxExpression = syntaxExpression;
		syntaxExpression = newSyntaxExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__SYNTAX_EXPRESSION,
					oldSyntaxExpression, syntaxExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<Agent>(Agent.class, this, EsperPackage.CONSTRAINT__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EsperPackage.CONSTRAINT__LISTENER:
			return basicSetListener(null, msgs);
		case EsperPackage.CONSTRAINT__EVENT:
			return basicSetEvent(null, msgs);
		case EsperPackage.CONSTRAINT__LOGGER:
			return basicSetLogger(null, msgs);
		case EsperPackage.CONSTRAINT__AGENT:
			return ((InternalEList<?>) getAgent()).basicRemove(otherEnd, msgs);
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
		case EsperPackage.CONSTRAINT__EP_STATEMENT:
			return getEpStatement();
		case EsperPackage.CONSTRAINT__STATEMENT_SUBSCRIBER:
			return getStatementSubscriber();
		case EsperPackage.CONSTRAINT__LISTENER:
			return getListener();
		case EsperPackage.CONSTRAINT__EVENT:
			return getEvent();
		case EsperPackage.CONSTRAINT__LOGGER:
			return getLogger();
		case EsperPackage.CONSTRAINT__SYNTAX_EXPRESSION:
			return getSyntaxExpression();
		case EsperPackage.CONSTRAINT__NAME:
			return getName();
		case EsperPackage.CONSTRAINT__AGENT:
			return getAgent();
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
		case EsperPackage.CONSTRAINT__EP_STATEMENT:
			setEpStatement((String) newValue);
			return;
		case EsperPackage.CONSTRAINT__STATEMENT_SUBSCRIBER:
			setStatementSubscriber((String) newValue);
			return;
		case EsperPackage.CONSTRAINT__LISTENER:
			setListener((Listener) newValue);
			return;
		case EsperPackage.CONSTRAINT__EVENT:
			setEvent((Event) newValue);
			return;
		case EsperPackage.CONSTRAINT__LOGGER:
			setLogger((Logger) newValue);
			return;
		case EsperPackage.CONSTRAINT__SYNTAX_EXPRESSION:
			setSyntaxExpression((String) newValue);
			return;
		case EsperPackage.CONSTRAINT__NAME:
			setName((String) newValue);
			return;
		case EsperPackage.CONSTRAINT__AGENT:
			getAgent().clear();
			getAgent().addAll((Collection<? extends Agent>) newValue);
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
		case EsperPackage.CONSTRAINT__EP_STATEMENT:
			setEpStatement(EP_STATEMENT_EDEFAULT);
			return;
		case EsperPackage.CONSTRAINT__STATEMENT_SUBSCRIBER:
			setStatementSubscriber(STATEMENT_SUBSCRIBER_EDEFAULT);
			return;
		case EsperPackage.CONSTRAINT__LISTENER:
			setListener((Listener) null);
			return;
		case EsperPackage.CONSTRAINT__EVENT:
			setEvent((Event) null);
			return;
		case EsperPackage.CONSTRAINT__LOGGER:
			setLogger((Logger) null);
			return;
		case EsperPackage.CONSTRAINT__SYNTAX_EXPRESSION:
			setSyntaxExpression(SYNTAX_EXPRESSION_EDEFAULT);
			return;
		case EsperPackage.CONSTRAINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EsperPackage.CONSTRAINT__AGENT:
			getAgent().clear();
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
		case EsperPackage.CONSTRAINT__EP_STATEMENT:
			return EP_STATEMENT_EDEFAULT == null ? epStatement != null : !EP_STATEMENT_EDEFAULT.equals(epStatement);
		case EsperPackage.CONSTRAINT__STATEMENT_SUBSCRIBER:
			return STATEMENT_SUBSCRIBER_EDEFAULT == null ? statementSubscriber != null
					: !STATEMENT_SUBSCRIBER_EDEFAULT.equals(statementSubscriber);
		case EsperPackage.CONSTRAINT__LISTENER:
			return listener != null;
		case EsperPackage.CONSTRAINT__EVENT:
			return event != null;
		case EsperPackage.CONSTRAINT__LOGGER:
			return logger != null;
		case EsperPackage.CONSTRAINT__SYNTAX_EXPRESSION:
			return SYNTAX_EXPRESSION_EDEFAULT == null ? syntaxExpression != null
					: !SYNTAX_EXPRESSION_EDEFAULT.equals(syntaxExpression);
		case EsperPackage.CONSTRAINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EsperPackage.CONSTRAINT__AGENT:
			return agent != null && !agent.isEmpty();
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
		result.append(" (epStatement: ");
		result.append(epStatement);
		result.append(", statementSubscriber: ");
		result.append(statementSubscriber);
		result.append(", syntaxExpression: ");
		result.append(syntaxExpression);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
