/**
 */
package restModel.impl;

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

import restModel.Answer;
import restModel.Data;
import restModel.Operation;
import restModel.Request;
import restModel.RestModelPackage;
import restModel.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restModel.impl.RequestImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link restModel.impl.RequestImpl#getData <em>Data</em>}</li>
 *   <li>{@link restModel.impl.RequestImpl#getSuccAnswer <em>Succ Answer</em>}</li>
 *   <li>{@link restModel.impl.RequestImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getSuccAnswer() <em>Succ Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer succAnswer;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestModelPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestModelPackage.REQUEST__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestModelPackage.REQUEST__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestModelPackage.REQUEST__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestModelPackage.REQUEST__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, RestModelPackage.REQUEST__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getSuccAnswer() {
		if (succAnswer != null && succAnswer.eIsProxy()) {
			InternalEObject oldSuccAnswer = (InternalEObject)succAnswer;
			succAnswer = (Answer)eResolveProxy(oldSuccAnswer);
			if (succAnswer != oldSuccAnswer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestModelPackage.REQUEST__SUCC_ANSWER, oldSuccAnswer, succAnswer));
			}
		}
		return succAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer basicGetSuccAnswer() {
		return succAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccAnswer(Answer newSuccAnswer) {
		Answer oldSuccAnswer = succAnswer;
		succAnswer = newSuccAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestModelPackage.REQUEST__SUCC_ANSWER, oldSuccAnswer, succAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, RestModelPackage.REQUEST__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestModelPackage.REQUEST__ROUTE:
				return basicSetRoute(null, msgs);
			case RestModelPackage.REQUEST__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case RestModelPackage.REQUEST__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case RestModelPackage.REQUEST__ROUTE:
				return getRoute();
			case RestModelPackage.REQUEST__DATA:
				return getData();
			case RestModelPackage.REQUEST__SUCC_ANSWER:
				if (resolve) return getSuccAnswer();
				return basicGetSuccAnswer();
			case RestModelPackage.REQUEST__OPERATIONS:
				return getOperations();
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
			case RestModelPackage.REQUEST__ROUTE:
				setRoute((Route)newValue);
				return;
			case RestModelPackage.REQUEST__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case RestModelPackage.REQUEST__SUCC_ANSWER:
				setSuccAnswer((Answer)newValue);
				return;
			case RestModelPackage.REQUEST__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
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
			case RestModelPackage.REQUEST__ROUTE:
				setRoute((Route)null);
				return;
			case RestModelPackage.REQUEST__DATA:
				getData().clear();
				return;
			case RestModelPackage.REQUEST__SUCC_ANSWER:
				setSuccAnswer((Answer)null);
				return;
			case RestModelPackage.REQUEST__OPERATIONS:
				getOperations().clear();
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
			case RestModelPackage.REQUEST__ROUTE:
				return route != null;
			case RestModelPackage.REQUEST__DATA:
				return data != null && !data.isEmpty();
			case RestModelPackage.REQUEST__SUCC_ANSWER:
				return succAnswer != null;
			case RestModelPackage.REQUEST__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestImpl
