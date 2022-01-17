/**
 */
package metamodelREST;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.Request#getRoute <em>Route</em>}</li>
 *   <li>{@link metamodelREST.Request#getData <em>Data</em>}</li>
 *   <li>{@link metamodelREST.Request#getOps <em>Ops</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getRequest()
 * @model abstract="true"
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see metamodelREST.MetamodelRESTPackage#getRequest_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link metamodelREST.Request#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link metamodelREST.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRequest_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' reference list.
	 * The list contents are of type {@link metamodelREST.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRequest_Ops()
	 * @model
	 * @generated
	 */
	EList<Operation> getOps();

} // Request
