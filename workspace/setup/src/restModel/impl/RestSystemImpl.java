/**
 */
package restModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restModel.Answer;
import restModel.Request;
import restModel.RestModelPackage;
import restModel.RestSystem;
import restModel.Struct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restModel.impl.RestSystemImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link restModel.impl.RestSystemImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link restModel.impl.RestSystemImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestSystemImpl extends MinimalEObjectImpl.Container implements RestSystem {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> request;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected EList<Struct> struct;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestModelPackage.Literals.REST_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Request>(Request.class, this, RestModelPackage.REST_SYSTEM__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Struct> getStruct() {
		if (struct == null) {
			struct = new EObjectContainmentEList<Struct>(Struct.class, this, RestModelPackage.REST_SYSTEM__STRUCT);
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<Answer>(Answer.class, this, RestModelPackage.REST_SYSTEM__ANSWER);
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestModelPackage.REST_SYSTEM__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case RestModelPackage.REST_SYSTEM__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case RestModelPackage.REST_SYSTEM__ANSWER:
				return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
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
			case RestModelPackage.REST_SYSTEM__REQUEST:
				return getRequest();
			case RestModelPackage.REST_SYSTEM__STRUCT:
				return getStruct();
			case RestModelPackage.REST_SYSTEM__ANSWER:
				return getAnswer();
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
			case RestModelPackage.REST_SYSTEM__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Request>)newValue);
				return;
			case RestModelPackage.REST_SYSTEM__STRUCT:
				getStruct().clear();
				getStruct().addAll((Collection<? extends Struct>)newValue);
				return;
			case RestModelPackage.REST_SYSTEM__ANSWER:
				getAnswer().clear();
				getAnswer().addAll((Collection<? extends Answer>)newValue);
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
			case RestModelPackage.REST_SYSTEM__REQUEST:
				getRequest().clear();
				return;
			case RestModelPackage.REST_SYSTEM__STRUCT:
				getStruct().clear();
				return;
			case RestModelPackage.REST_SYSTEM__ANSWER:
				getAnswer().clear();
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
			case RestModelPackage.REST_SYSTEM__REQUEST:
				return request != null && !request.isEmpty();
			case RestModelPackage.REST_SYSTEM__STRUCT:
				return struct != null && !struct.isEmpty();
			case RestModelPackage.REST_SYSTEM__ANSWER:
				return answer != null && !answer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RestSystemImpl
