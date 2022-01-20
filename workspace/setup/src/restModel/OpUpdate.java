/**
 */
package restModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restModel.OpUpdate#getFieldsets <em>Fieldsets</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getOpUpdate()
 * @model
 * @generated
 */
public interface OpUpdate extends Operation {
	/**
	 * Returns the value of the '<em><b>Fieldsets</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.FieldSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldsets</em>' containment reference list.
	 * @see restModel.RestModelPackage#getOpUpdate_Fieldsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldSet> getFieldsets();

} // OpUpdate
