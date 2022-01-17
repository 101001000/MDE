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

} // RestSystem
