/**
 */
package metamodelREST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.Struct#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute.
	 * @see #setFields(String)
	 * @see metamodelREST.MetamodelRESTPackage#getStruct_Fields()
	 * @model
	 * @generated
	 */
	String getFields();

	/**
	 * Sets the value of the '{@link metamodelREST.Struct#getFields <em>Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' attribute.
	 * @see #getFields()
	 * @generated
	 */
	void setFields(String value);

} // Struct
