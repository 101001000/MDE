/**
 */
package restModel;

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
 *   <li>{@link restModel.RestSystem#getRequests <em>Requests</em>}</li>
 *   <li>{@link restModel.RestSystem#getStructs <em>Structs</em>}</li>
 *   <li>{@link restModel.RestSystem#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getRestSystem()
 * @model
 * @generated
 */
public interface RestSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see restModel.RestModelPackage#getRestSystem_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Structs</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structs</em>' containment reference list.
	 * @see restModel.RestModelPackage#getRestSystem_Structs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Struct> getStructs();

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see restModel.RestModelPackage#getRestSystem_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // RestSystem
