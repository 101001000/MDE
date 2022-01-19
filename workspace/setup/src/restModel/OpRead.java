/**
 */
package restModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restModel.OpRead#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getOpRead()
 * @model
 * @generated
 */
public interface OpRead extends Operation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see restModel.RestModelPackage#getOpRead_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

} // OpRead
