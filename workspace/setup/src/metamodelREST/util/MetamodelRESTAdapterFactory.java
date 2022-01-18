/**
 */
package metamodelREST.util;

import metamodelREST.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodelREST.MetamodelRESTPackage
 * @generated
 */
public class MetamodelRESTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelRESTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelRESTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelRESTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelRESTSwitch<Adapter> modelSwitch =
		new MetamodelRESTSwitch<Adapter>() {
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseReGet(ReGet object) {
				return createReGetAdapter();
			}
			@Override
			public Adapter caseRePost(RePost object) {
				return createRePostAdapter();
			}
			@Override
			public Adapter caseRePut(RePut object) {
				return createRePutAdapter();
			}
			@Override
			public Adapter caseReDelete(ReDelete object) {
				return createReDeleteAdapter();
			}
			@Override
			public Adapter caseRoute(Route object) {
				return createRouteAdapter();
			}
			@Override
			public Adapter caseSegment(Segment object) {
				return createSegmentAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseAttachments(Attachments object) {
				return createAttachmentsAdapter();
			}
			@Override
			public Adapter caseRandom(Random object) {
				return createRandomAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOpCreate(OpCreate object) {
				return createOpCreateAdapter();
			}
			@Override
			public Adapter caseFieldSet(FieldSet object) {
				return createFieldSetAdapter();
			}
			@Override
			public Adapter caseOpRead(OpRead object) {
				return createOpReadAdapter();
			}
			@Override
			public Adapter caseOpUpdate(OpUpdate object) {
				return createOpUpdateAdapter();
			}
			@Override
			public Adapter caseOpDelete(OpDelete object) {
				return createOpDeleteAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseStruct(Struct object) {
				return createStructAdapter();
			}
			@Override
			public Adapter caseRestSystem(RestSystem object) {
				return createRestSystemAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.ReGet <em>Re Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.ReGet
	 * @generated
	 */
	public Adapter createReGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.RePost <em>Re Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.RePost
	 * @generated
	 */
	public Adapter createRePostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.RePut <em>Re Put</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.RePut
	 * @generated
	 */
	public Adapter createRePutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.ReDelete <em>Re Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.ReDelete
	 * @generated
	 */
	public Adapter createReDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Attachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Attachments
	 * @generated
	 */
	public Adapter createAttachmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Random
	 * @generated
	 */
	public Adapter createRandomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.OpCreate <em>Op Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.OpCreate
	 * @generated
	 */
	public Adapter createOpCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.FieldSet <em>Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.FieldSet
	 * @generated
	 */
	public Adapter createFieldSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.OpRead <em>Op Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.OpRead
	 * @generated
	 */
	public Adapter createOpReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.OpUpdate <em>Op Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.OpUpdate
	 * @generated
	 */
	public Adapter createOpUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.OpDelete <em>Op Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.OpDelete
	 * @generated
	 */
	public Adapter createOpDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Struct
	 * @generated
	 */
	public Adapter createStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.RestSystem <em>Rest System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.RestSystem
	 * @generated
	 */
	public Adapter createRestSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodelREST.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodelREST.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodelRESTAdapterFactory
