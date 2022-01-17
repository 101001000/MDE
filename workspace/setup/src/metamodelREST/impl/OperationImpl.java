/**
 */
package metamodelREST.impl;

import metamodelREST.Answer;
import metamodelREST.MetamodelRESTPackage;
import metamodelREST.Operation;
import metamodelREST.Struct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.impl.OperationImpl#getFailedAnswer <em>Failed Answer</em>}</li>
 *   <li>{@link metamodelREST.impl.OperationImpl#getSuccAnswer <em>Succ Answer</em>}</li>
 *   <li>{@link metamodelREST.impl.OperationImpl#getStruct <em>Struct</em>}</li>
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
	 * The cached value of the '{@link #getSuccAnswer() <em>Succ Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer succAnswer;

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
		return MetamodelRESTPackage.Literals.OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelRESTPackage.OPERATION__FAILED_ANSWER, oldFailedAnswer, failedAnswer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__FAILED_ANSWER, oldFailedAnswer, failedAnswer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelRESTPackage.OPERATION__SUCC_ANSWER, oldSuccAnswer, succAnswer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__SUCC_ANSWER, oldSuccAnswer, succAnswer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelRESTPackage.OPERATION__STRUCT, oldStruct, struct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__STRUCT, oldStruct, struct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				if (resolve) return getFailedAnswer();
				return basicGetFailedAnswer();
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				if (resolve) return getSuccAnswer();
				return basicGetSuccAnswer();
			case MetamodelRESTPackage.OPERATION__STRUCT:
				if (resolve) return getStruct();
				return basicGetStruct();
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
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				setFailedAnswer((Answer)newValue);
				return;
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				setSuccAnswer((Answer)newValue);
				return;
			case MetamodelRESTPackage.OPERATION__STRUCT:
				setStruct((Struct)newValue);
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
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				setFailedAnswer((Answer)null);
				return;
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				setSuccAnswer((Answer)null);
				return;
			case MetamodelRESTPackage.OPERATION__STRUCT:
				setStruct((Struct)null);
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
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				return failedAnswer != null;
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				return succAnswer != null;
			case MetamodelRESTPackage.OPERATION__STRUCT:
				return struct != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
