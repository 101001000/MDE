/**
 */
package metamodelREST.impl;

import metamodelREST.Answer;
import metamodelREST.MetamodelRESTPackage;
import metamodelREST.Operation;
import metamodelREST.Struct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getFailedAnswer() <em>Failed Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer failedAnswer;

	/**
	 * The cached value of the '{@link #getSuccAnswer() <em>Succ Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer succAnswer;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
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
		return failedAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailedAnswer(Answer newFailedAnswer, NotificationChain msgs) {
		Answer oldFailedAnswer = failedAnswer;
		failedAnswer = newFailedAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__FAILED_ANSWER, oldFailedAnswer, newFailedAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedAnswer(Answer newFailedAnswer) {
		if (newFailedAnswer != failedAnswer) {
			NotificationChain msgs = null;
			if (failedAnswer != null)
				msgs = ((InternalEObject)failedAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__FAILED_ANSWER, null, msgs);
			if (newFailedAnswer != null)
				msgs = ((InternalEObject)newFailedAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__FAILED_ANSWER, null, msgs);
			msgs = basicSetFailedAnswer(newFailedAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__FAILED_ANSWER, newFailedAnswer, newFailedAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getSuccAnswer() {
		return succAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccAnswer(Answer newSuccAnswer, NotificationChain msgs) {
		Answer oldSuccAnswer = succAnswer;
		succAnswer = newSuccAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__SUCC_ANSWER, oldSuccAnswer, newSuccAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccAnswer(Answer newSuccAnswer) {
		if (newSuccAnswer != succAnswer) {
			NotificationChain msgs = null;
			if (succAnswer != null)
				msgs = ((InternalEObject)succAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__SUCC_ANSWER, null, msgs);
			if (newSuccAnswer != null)
				msgs = ((InternalEObject)newSuccAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__SUCC_ANSWER, null, msgs);
			msgs = basicSetSuccAnswer(newSuccAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__SUCC_ANSWER, newSuccAnswer, newSuccAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Struct newStruct, NotificationChain msgs) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelRESTPackage.OPERATION__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.OPERATION__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				return basicSetFailedAnswer(null, msgs);
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				return basicSetSuccAnswer(null, msgs);
			case MetamodelRESTPackage.OPERATION__STRUCT:
				return basicSetStruct(null, msgs);
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
			case MetamodelRESTPackage.OPERATION__FAILED_ANSWER:
				return getFailedAnswer();
			case MetamodelRESTPackage.OPERATION__SUCC_ANSWER:
				return getSuccAnswer();
			case MetamodelRESTPackage.OPERATION__STRUCT:
				return getStruct();
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
