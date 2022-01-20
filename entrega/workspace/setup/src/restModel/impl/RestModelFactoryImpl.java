/**
 */
package restModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import restModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestModelFactoryImpl extends EFactoryImpl implements RestModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestModelFactory init() {
		try {
			RestModelFactory theRestModelFactory = (RestModelFactory)EPackage.Registry.INSTANCE.getEFactory(RestModelPackage.eNS_URI);
			if (theRestModelFactory != null) {
				return theRestModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestModelPackage.RE_GET: return createReGet();
			case RestModelPackage.RE_POST: return createRePost();
			case RestModelPackage.RE_PUT: return createRePut();
			case RestModelPackage.RE_DELETE: return createReDelete();
			case RestModelPackage.ROUTE: return createRoute();
			case RestModelPackage.SEGMENT: return createSegment();
			case RestModelPackage.PARAMETER: return createParameter();
			case RestModelPackage.OP_CREATE: return createOpCreate();
			case RestModelPackage.FIELD_SET: return createFieldSet();
			case RestModelPackage.OP_READ: return createOpRead();
			case RestModelPackage.OP_UPDATE: return createOpUpdate();
			case RestModelPackage.OP_DELETE: return createOpDelete();
			case RestModelPackage.ANSWER: return createAnswer();
			case RestModelPackage.STRUCT: return createStruct();
			case RestModelPackage.REST_SYSTEM: return createRestSystem();
			case RestModelPackage.FIELD: return createField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReGet createReGet() {
		ReGetImpl reGet = new ReGetImpl();
		return reGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RePost createRePost() {
		RePostImpl rePost = new RePostImpl();
		return rePost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RePut createRePut() {
		RePutImpl rePut = new RePutImpl();
		return rePut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReDelete createReDelete() {
		ReDeleteImpl reDelete = new ReDeleteImpl();
		return reDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpCreate createOpCreate() {
		OpCreateImpl opCreate = new OpCreateImpl();
		return opCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSet createFieldSet() {
		FieldSetImpl fieldSet = new FieldSetImpl();
		return fieldSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRead createOpRead() {
		OpReadImpl opRead = new OpReadImpl();
		return opRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpUpdate createOpUpdate() {
		OpUpdateImpl opUpdate = new OpUpdateImpl();
		return opUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpDelete createOpDelete() {
		OpDeleteImpl opDelete = new OpDeleteImpl();
		return opDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestSystem createRestSystem() {
		RestSystemImpl restSystem = new RestSystemImpl();
		return restSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestModelPackage getRestModelPackage() {
		return (RestModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestModelPackage getPackage() {
		return RestModelPackage.eINSTANCE;
	}

} //RestModelFactoryImpl
