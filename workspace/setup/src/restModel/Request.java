/**
 */
package restModel;

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
 *   <li>{@link restModel.Request#getRoute <em>Route</em>}</li>
 *   <li>{@link restModel.Request#getData <em>Data</em>}</li>
 *   <li>{@link restModel.Request#getOps <em>Ops</em>}</li>
 *   <li>{@link restModel.Request#getSuccAnswer <em>Succ Answer</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getRequest()
 * @model abstract="true"
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(Route)
	 * @see restModel.RestModelPackage#getRequest_Route()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link restModel.Request#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see restModel.RestModelPackage#getRequest_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' reference list.
	 * The list contents are of type {@link restModel.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' reference list.
	 * @see restModel.RestModelPackage#getRequest_Ops()
	 * @model
	 * @generated
	 */
	EList<Operation> getOps();

	/**
	 * Returns the value of the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ Answer</em>' reference.
	 * @see #setSuccAnswer(Answer)
	 * @see restModel.RestModelPackage#getRequest_SuccAnswer()
	 * @model required="true"
	 * @generated
	 */
	Answer getSuccAnswer();

	/**
	 * Sets the value of the '{@link restModel.Request#getSuccAnswer <em>Succ Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succ Answer</em>' reference.
	 * @see #getSuccAnswer()
	 * @generated
	 */
	void setSuccAnswer(Answer value);

} // Request
