/**
 */
package restModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restModel.FieldSet;
import restModel.OpUpdate;
import restModel.RestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restModel.impl.OpUpdateImpl#getFieldsets <em>Fieldsets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpUpdateImpl extends OperationImpl implements OpUpdate {
	/**
	 * The cached value of the '{@link #getFieldsets() <em>Fieldsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldsets()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldSet> fieldsets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestModelPackage.Literals.OP_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldSet> getFieldsets() {
		if (fieldsets == null) {
			fieldsets = new EObjectContainmentEList<FieldSet>(FieldSet.class, this, RestModelPackage.OP_UPDATE__FIELDSETS);
		}
		return fieldsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestModelPackage.OP_UPDATE__FIELDSETS:
				return ((InternalEList<?>)getFieldsets()).basicRemove(otherEnd, msgs);
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
			case RestModelPackage.OP_UPDATE__FIELDSETS:
				return getFieldsets();
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
			case RestModelPackage.OP_UPDATE__FIELDSETS:
				getFieldsets().clear();
				getFieldsets().addAll((Collection<? extends FieldSet>)newValue);
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
			case RestModelPackage.OP_UPDATE__FIELDSETS:
				getFieldsets().clear();
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
			case RestModelPackage.OP_UPDATE__FIELDSETS:
				return fieldsets != null && !fieldsets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpUpdateImpl
