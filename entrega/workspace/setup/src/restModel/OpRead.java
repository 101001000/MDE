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
 *   <li>{@link restModel.OpRead#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getOpRead()
 * @model
 * @generated
 */
public interface OpRead extends Operation {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link restModel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see restModel.RestModelPackage#getOpRead_Fields()
	 * @model
	 * @generated
	 */
	EList<Field> getFields();

} // OpRead
