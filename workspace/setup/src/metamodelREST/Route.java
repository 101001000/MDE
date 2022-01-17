/**
 */
package metamodelREST;

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
 *   <li>{@link metamodelREST.Route#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see metamodelREST.MetamodelRESTPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' reference list.
	 * The list contents are of type {@link metamodelREST.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' reference list.
	 * @see metamodelREST.MetamodelRESTPackage#getRoute_Segment()
	 * @model required="true"
	 * @generated
	 */
	EList<Segment> getSegment();

} // Route
