/**
 */
package restModel;

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
 *   <li>{@link restModel.Operation#getFailedAnswer <em>Failed Answer</em>}</li>
 *   <li>{@link restModel.Operation#getStruct <em>Struct</em>}</li>
 *   <li>{@link restModel.Operation#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Answer</em>' reference.
	 * @see #setFailedAnswer(Answer)
	 * @see restModel.RestModelPackage#getOperation_FailedAnswer()
	 * @model required="true"
	 * @generated
	 */
	Answer getFailedAnswer();

	/**
	 * Sets the value of the '{@link restModel.Operation#getFailedAnswer <em>Failed Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Answer</em>' reference.
	 * @see #getFailedAnswer()
	 * @generated
	 */
	void setFailedAnswer(Answer value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' reference.
	 * @see #setStruct(Struct)
	 * @see restModel.RestModelPackage#getOperation_Struct()
	 * @model required="true"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link restModel.Operation#getStruct <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see restModel.RestModelPackage#getOperation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link restModel.Operation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Operation
