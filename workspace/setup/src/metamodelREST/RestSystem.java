/**
 */
package metamodelREST;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.RestSystem#getRequest <em>Request</em>}</li>
 *   <li>{@link metamodelREST.RestSystem#getStruct <em>Struct</em>}</li>
 *   <li>{@link metamodelREST.RestSystem#getOperation <em>Operation</em>}</li>
 *   <li>{@link metamodelREST.RestSystem#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getRestSystem()
 * @model
 * @generated
 */
public interface RestSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link metamodelREST.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRestSystem_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequest();

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link metamodelREST.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRestSystem_Struct()
	 * @model containment="true"
	 * @generated
	 */
	EList<Struct> getStruct();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link metamodelREST.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRestSystem_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link metamodelREST.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRestSystem_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswer();

} // RestSystem
