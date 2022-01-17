/**
 */
package metamodelREST.impl;

import metamodelREST.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelRESTFactoryImpl extends EFactoryImpl implements MetamodelRESTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelRESTFactory init() {
		try {
			MetamodelRESTFactory theMetamodelRESTFactory = (MetamodelRESTFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodelRESTPackage.eNS_URI);
			if (theMetamodelRESTFactory != null) {
				return theMetamodelRESTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelRESTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelRESTFactoryImpl() {
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
			case MetamodelRESTPackage.RE_GET: return createReGet();
			case MetamodelRESTPackage.RE_POST: return createRePost();
			case MetamodelRESTPackage.RE_PUT: return createRePut();
			case MetamodelRESTPackage.RE_DELETE: return createReDelete();
			case MetamodelRESTPackage.ROUTE: return createRoute();
			case MetamodelRESTPackage.SEGMENT: return createSegment();
			case MetamodelRESTPackage.PARAMETER: return createParameter();
			case MetamodelRESTPackage.ATTACHMENTS: return createAttachments();
			case MetamodelRESTPackage.RANDOM: return createRandom();
			case MetamodelRESTPackage.OP_CREATE: return createOpCreate();
			case MetamodelRESTPackage.FIELD_SET: return createFieldSet();
			case MetamodelRESTPackage.OP_READ: return createOpRead();
			case MetamodelRESTPackage.OP_UPDATE: return createOpUpdate();
			case MetamodelRESTPackage.OP_DELETE: return createOpDelete();
			case MetamodelRESTPackage.ANSWER: return createAnswer();
			case MetamodelRESTPackage.STRUCT: return createStruct();
			case MetamodelRESTPackage.REST_SYSTEM: return createRestSystem();
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
	public Attachments createAttachments() {
		AttachmentsImpl attachments = new AttachmentsImpl();
		return attachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random createRandom() {
		RandomImpl random = new RandomImpl();
		return random;
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
	public MetamodelRESTPackage getMetamodelRESTPackage() {
		return (MetamodelRESTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelRESTPackage getPackage() {
		return MetamodelRESTPackage.eINSTANCE;
	}

} //MetamodelRESTFactoryImpl
