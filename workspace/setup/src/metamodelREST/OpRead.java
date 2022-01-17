/**
 */
package metamodelREST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.OpRead#getFields <em>Fields</em>}</li>
 *   <li>{@link metamodelREST.OpRead#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getOpRead()
 * @model
 * @generated
 */
public interface OpRead extends Operation {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute.
	 * @see #setFields(String)
	 * @see metamodelREST.MetamodelRESTPackage#getOpRead_Fields()
	 * @model
	 * @generated
	 */
	String getFields();

	/**
	 * Sets the value of the '{@link metamodelREST.OpRead#getFields <em>Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' attribute.
	 * @see #getFields()
	 * @generated
	 */
	void setFields(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see metamodelREST.MetamodelRESTPackage#getOpRead_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link metamodelREST.OpRead#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // OpRead
