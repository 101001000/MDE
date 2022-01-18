/**
 */
package metamodelREST.impl;

import java.util.Collection;

import metamodelREST.Answer;
import metamodelREST.MetamodelRESTPackage;
import metamodelREST.Operation;
import metamodelREST.Request;
import metamodelREST.RestSystem;

import metamodelREST.Struct;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.impl.RestSystemImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link metamodelREST.impl.RestSystemImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link metamodelREST.impl.RestSystemImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link metamodelREST.impl.RestSystemImpl#getAnswer <em>Answer</em>}</li>
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
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;
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
		return MetamodelRESTPackage.Literals.REST_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Request>(Request.class, this, MetamodelRESTPackage.REST_SYSTEM__REQUEST);
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
			struct = new EObjectContainmentEList<Struct>(Struct.class, this, MetamodelRESTPackage.REST_SYSTEM__STRUCT);
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, MetamodelRESTPackage.REST_SYSTEM__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<Answer>(Answer.class, this, MetamodelRESTPackage.REST_SYSTEM__ANSWER);
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
			case MetamodelRESTPackage.REST_SYSTEM__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case MetamodelRESTPackage.REST_SYSTEM__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
			case MetamodelRESTPackage.REST_SYSTEM__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case MetamodelRESTPackage.REST_SYSTEM__ANSWER:
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
			case MetamodelRESTPackage.REST_SYSTEM__REQUEST:
				return getRequest();
			case MetamodelRESTPackage.REST_SYSTEM__STRUCT:
				return getStruct();
			case MetamodelRESTPackage.REST_SYSTEM__OPERATION:
				return getOperation();
			case MetamodelRESTPackage.REST_SYSTEM__ANSWER:
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
			case MetamodelRESTPackage.REST_SYSTEM__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Request>)newValue);
				return;
			case MetamodelRESTPackage.REST_SYSTEM__STRUCT:
				getStruct().clear();
				getStruct().addAll((Collection<? extends Struct>)newValue);
				return;
			case MetamodelRESTPackage.REST_SYSTEM__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case MetamodelRESTPackage.REST_SYSTEM__ANSWER:
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
			case MetamodelRESTPackage.REST_SYSTEM__REQUEST:
				getRequest().clear();
				return;
			case MetamodelRESTPackage.REST_SYSTEM__STRUCT:
				getStruct().clear();
				return;
			case MetamodelRESTPackage.REST_SYSTEM__OPERATION:
				getOperation().clear();
				return;
			case MetamodelRESTPackage.REST_SYSTEM__ANSWER:
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
			case MetamodelRESTPackage.REST_SYSTEM__REQUEST:
				return request != null && !request.isEmpty();
			case MetamodelRESTPackage.REST_SYSTEM__STRUCT:
				return struct != null && !struct.isEmpty();
			case MetamodelRESTPackage.REST_SYSTEM__OPERATION:
				return operation != null && !operation.isEmpty();
			case MetamodelRESTPackage.REST_SYSTEM__ANSWER:
				return answer != null && !answer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RestSystemImpl
