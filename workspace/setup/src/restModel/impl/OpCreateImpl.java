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
import restModel.OpCreate;
import restModel.RestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restModel.impl.OpCreateImpl#getFieldset <em>Fieldset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpCreateImpl extends OperationImpl implements OpCreate {
	/**
	 * The cached value of the '{@link #getFieldset() <em>Fieldset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldset()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldSet> fieldset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestModelPackage.Literals.OP_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldSet> getFieldset() {
		if (fieldset == null) {
			fieldset = new EObjectContainmentEList<FieldSet>(FieldSet.class, this, RestModelPackage.OP_CREATE__FIELDSET);
		}
		return fieldset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestModelPackage.OP_CREATE__FIELDSET:
				return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
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
			case RestModelPackage.OP_CREATE__FIELDSET:
				return getFieldset();
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
			case RestModelPackage.OP_CREATE__FIELDSET:
				getFieldset().clear();
				getFieldset().addAll((Collection<? extends FieldSet>)newValue);
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
			case RestModelPackage.OP_CREATE__FIELDSET:
				getFieldset().clear();
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
			case RestModelPackage.OP_CREATE__FIELDSET:
				return fieldset != null && !fieldset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpCreateImpl
