/**
 */
package restModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restModel.FieldSet#getName <em>Name</em>}</li>
 *   <li>{@link restModel.FieldSet#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getFieldSet()
 * @model
 * @generated
 */
public interface FieldSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see restModel.RestModelPackage#getFieldSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link restModel.FieldSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(String)
	 * @see restModel.RestModelPackage#getFieldSet_Expr()
	 * @model
	 * @generated
	 */
	String getExpr();

	/**
	 * Sets the value of the '{@link restModel.FieldSet#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(String value);

} // FieldSet
