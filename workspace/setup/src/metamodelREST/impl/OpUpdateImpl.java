/**
 */
package metamodelREST.impl;

import java.util.Collection;

import metamodelREST.FieldSet;
import metamodelREST.MetamodelRESTPackage;
import metamodelREST.OpUpdate;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.impl.OpUpdateImpl#getFieldset <em>Fieldset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpUpdateImpl extends OperationImpl implements OpUpdate {
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
		return MetamodelRESTPackage.Literals.OP_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldSet> getFieldset() {
		if (fieldset == null) {
			fieldset = new EObjectContainmentEList<FieldSet>(FieldSet.class, this, MetamodelRESTPackage.OP_UPDATE__FIELDSET);
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
			case MetamodelRESTPackage.OP_UPDATE__FIELDSET:
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
			case MetamodelRESTPackage.OP_UPDATE__FIELDSET:
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
			case MetamodelRESTPackage.OP_UPDATE__FIELDSET:
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
			case MetamodelRESTPackage.OP_UPDATE__FIELDSET:
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
			case MetamodelRESTPackage.OP_UPDATE__FIELDSET:
				return fieldset != null && !fieldset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpUpdateImpl
