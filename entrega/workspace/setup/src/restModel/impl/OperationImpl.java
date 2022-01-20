/**
 */
package restModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restModel.Answer;
import restModel.Operation;
import restModel.RestModelPackage;
import restModel.Struct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restModel.impl.OperationImpl#getFailedAnswer <em>Failed Answer</em>}</li>
 *   <li>{@link restModel.impl.OperationImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link restModel.impl.OperationImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The cached value of the '{@link #getFailedAnswer() <em>Failed Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer failedAnswer;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Struct struct;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getFailedAnswer() {
		if (failedAnswer != null && failedAnswer.eIsProxy()) {
			InternalEObject oldFailedAnswer = (InternalEObject)failedAnswer;
			failedAnswer = (Answer)eResolveProxy(oldFailedAnswer);
			if (failedAnswer != oldFailedAnswer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestModelPackage.OPERATION__FAILED_ANSWER, oldFailedAnswer, failedAnswer));
			}
		}
		return failedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer basicGetFailedAnswer() {
		return failedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedAnswer(Answer newFailedAnswer) {
		Answer oldFailedAnswer = failedAnswer;
		failedAnswer = newFailedAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestModelPackage.OPERATION__FAILED_ANSWER, oldFailedAnswer, failedAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		if (struct != null && struct.eIsProxy()) {
			InternalEObject oldStruct = (InternalEObject)struct;
			struct = (Struct)eResolveProxy(oldStruct);
			if (struct != oldStruct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestModelPackage.OPERATION__STRUCT, oldStruct, struct));
			}
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct basicGetStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestModelPackage.OPERATION__STRUCT, oldStruct, struct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestModelPackage.OPERATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestModelPackage.OPERATION__FAILED_ANSWER:
				if (resolve) return getFailedAnswer();
				return basicGetFailedAnswer();
			case RestModelPackage.OPERATION__STRUCT:
				if (resolve) return getStruct();
				return basicGetStruct();
			case RestModelPackage.OPERATION__ID:
				return getId();
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
			case RestModelPackage.OPERATION__FAILED_ANSWER:
				setFailedAnswer((Answer)newValue);
				return;
			case RestModelPackage.OPERATION__STRUCT:
				setStruct((Struct)newValue);
				return;
			case RestModelPackage.OPERATION__ID:
				setId((String)newValue);
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
			case RestModelPackage.OPERATION__FAILED_ANSWER:
				setFailedAnswer((Answer)null);
				return;
			case RestModelPackage.OPERATION__STRUCT:
				setStruct((Struct)null);
				return;
			case RestModelPackage.OPERATION__ID:
				setId(ID_EDEFAULT);
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
			case RestModelPackage.OPERATION__FAILED_ANSWER:
				return failedAnswer != null;
			case RestModelPackage.OPERATION__STRUCT:
				return struct != null;
			case RestModelPackage.OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
