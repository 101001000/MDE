/**
 */
package metamodelREST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.Operation#getFailedAnswer <em>Failed Answer</em>}</li>
 *   <li>{@link metamodelREST.Operation#getSuccAnswer <em>Succ Answer</em>}</li>
 *   <li>{@link metamodelREST.Operation#getStruct <em>Struct</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Answer</em>' containment reference.
	 * @see #setFailedAnswer(Answer)
	 * @see metamodelREST.MetamodelRESTPackage#getOperation_FailedAnswer()
	 * @model containment="true"
	 * @generated
	 */
	Answer getFailedAnswer();

	/**
	 * Sets the value of the '{@link metamodelREST.Operation#getFailedAnswer <em>Failed Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Answer</em>' containment reference.
	 * @see #getFailedAnswer()
	 * @generated
	 */
	void setFailedAnswer(Answer value);

	/**
	 * Returns the value of the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ Answer</em>' containment reference.
	 * @see #setSuccAnswer(Answer)
	 * @see metamodelREST.MetamodelRESTPackage#getOperation_SuccAnswer()
	 * @model containment="true"
	 * @generated
	 */
	Answer getSuccAnswer();

	/**
	 * Sets the value of the '{@link metamodelREST.Operation#getSuccAnswer <em>Succ Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succ Answer</em>' containment reference.
	 * @see #getSuccAnswer()
	 * @generated
	 */
	void setSuccAnswer(Answer value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(Struct)
	 * @see metamodelREST.MetamodelRESTPackage#getOperation_Struct()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link metamodelREST.Operation#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

} // Operation
