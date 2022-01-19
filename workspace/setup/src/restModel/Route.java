/**
 */
package restModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restModel.Route#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see restModel.RestModelPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link restModel.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see restModel.RestModelPackage#getRoute_Segment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Segment> getSegment();

} // Route
