/**
 */
package metamodelREST;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.OpCreate#getId <em>Id</em>}</li>
 *   <li>{@link metamodelREST.OpCreate#getFieldset <em>Fieldset</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getOpCreate()
 * @model
 * @generated
 */
public interface OpCreate extends Operation {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see metamodelREST.MetamodelRESTPackage#getOpCreate_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link metamodelREST.OpCreate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Fieldset</b></em>' containment reference list.
	 * The list contents are of type {@link metamodelREST.FieldSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldset</em>' containment reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getOpCreate_Fieldset()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldSet> getFieldset();

} // OpCreate
