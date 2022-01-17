/**
 */
package metamodelREST;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodelREST.MetamodelRESTFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelRESTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodelREST";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "metamodelREST";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodelREST";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelRESTPackage eINSTANCE = metamodelREST.impl.MetamodelRESTPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RequestImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DATA = 1;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__OPS = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.ReGetImpl <em>Re Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.ReGetImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getReGet()
	 * @generated
	 */
	int RE_GET = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET__ROUTE = REQUEST__ROUTE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET__DATA = REQUEST__DATA;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET__OPS = REQUEST__OPS;

	/**
	 * The number of structural features of the '<em>Re Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Re Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RePostImpl <em>Re Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RePostImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRePost()
	 * @generated
	 */
	int RE_POST = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST__ROUTE = REQUEST__ROUTE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST__DATA = REQUEST__DATA;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST__OPS = REQUEST__OPS;

	/**
	 * The number of structural features of the '<em>Re Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Re Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RePutImpl <em>Re Put</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RePutImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRePut()
	 * @generated
	 */
	int RE_PUT = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT__ROUTE = REQUEST__ROUTE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT__DATA = REQUEST__DATA;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT__OPS = REQUEST__OPS;

	/**
	 * The number of structural features of the '<em>Re Put</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Re Put</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.ReDeleteImpl <em>Re Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.ReDeleteImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getReDelete()
	 * @generated
	 */
	int RE_DELETE = 4;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE__ROUTE = REQUEST__ROUTE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE__DATA = REQUEST__DATA;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE__OPS = REQUEST__OPS;

	/**
	 * The number of structural features of the '<em>Re Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Re Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RouteImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SEGMENT = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.SegmentImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.DataImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getData()
	 * @generated
	 */
	int DATA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.ParameterImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.AttachmentsImpl <em>Attachments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.AttachmentsImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getAttachments()
	 * @generated
	 */
	int ATTACHMENTS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Attachments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RandomImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.OperationImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FAILED_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUCC_ANSWER = 1;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STRUCT = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.OpCreateImpl <em>Op Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.OpCreateImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpCreate()
	 * @generated
	 */
	int OP_CREATE = 12;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__SUCC_ANSWER = OPERATION__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__STRUCT = OPERATION__STRUCT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__ID = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fieldset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__FIELDSET = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Op Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Op Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.FieldSetImpl <em>Field Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.FieldSetImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getFieldSet()
	 * @generated
	 */
	int FIELD_SET = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.OpReadImpl <em>Op Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.OpReadImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpRead()
	 * @generated
	 */
	int OP_READ = 14;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__SUCC_ANSWER = OPERATION__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__STRUCT = OPERATION__STRUCT;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__FIELDS = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__ID = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Op Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Op Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.OpUpdateImpl <em>Op Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.OpUpdateImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpUpdate()
	 * @generated
	 */
	int OP_UPDATE = 15;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__SUCC_ANSWER = OPERATION__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__STRUCT = OPERATION__STRUCT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__ID = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fieldset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__FIELDSET = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Op Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Op Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.OpDeleteImpl <em>Op Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.OpDeleteImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpDelete()
	 * @generated
	 */
	int OP_DELETE = 16;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Succ Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE__SUCC_ANSWER = OPERATION__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE__STRUCT = OPERATION__STRUCT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE__ID = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.AnswerImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__RETURN = 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.StructImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 18;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodelREST.impl.RestSystemImpl <em>Rest System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodelREST.impl.RestSystemImpl
	 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRestSystem()
	 * @generated
	 */
	int REST_SYSTEM = 19;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM__REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Rest System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rest System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metamodelREST.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see metamodelREST.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference '{@link metamodelREST.Request#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see metamodelREST.Request#getRoute()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.Request#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see metamodelREST.Request#getData()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.Request#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see metamodelREST.Request#getOps()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Ops();

	/**
	 * Returns the meta object for class '{@link metamodelREST.ReGet <em>Re Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Get</em>'.
	 * @see metamodelREST.ReGet
	 * @generated
	 */
	EClass getReGet();

	/**
	 * Returns the meta object for class '{@link metamodelREST.RePost <em>Re Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Post</em>'.
	 * @see metamodelREST.RePost
	 * @generated
	 */
	EClass getRePost();

	/**
	 * Returns the meta object for class '{@link metamodelREST.RePut <em>Re Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Put</em>'.
	 * @see metamodelREST.RePut
	 * @generated
	 */
	EClass getRePut();

	/**
	 * Returns the meta object for class '{@link metamodelREST.ReDelete <em>Re Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Delete</em>'.
	 * @see metamodelREST.ReDelete
	 * @generated
	 */
	EClass getReDelete();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see metamodelREST.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.Route#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see metamodelREST.Route#getSegment()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Segment();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see metamodelREST.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.Segment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodelREST.Segment#getValue()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Value();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see metamodelREST.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodelREST.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see metamodelREST.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Attachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachments</em>'.
	 * @see metamodelREST.Attachments
	 * @generated
	 */
	EClass getAttachments();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see metamodelREST.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see metamodelREST.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link metamodelREST.Operation#getFailedAnswer <em>Failed Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failed Answer</em>'.
	 * @see metamodelREST.Operation#getFailedAnswer()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_FailedAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link metamodelREST.Operation#getSuccAnswer <em>Succ Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Succ Answer</em>'.
	 * @see metamodelREST.Operation#getSuccAnswer()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_SuccAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link metamodelREST.Operation#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see metamodelREST.Operation#getStruct()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Struct();

	/**
	 * Returns the meta object for class '{@link metamodelREST.OpCreate <em>Op Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Create</em>'.
	 * @see metamodelREST.OpCreate
	 * @generated
	 */
	EClass getOpCreate();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.OpCreate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metamodelREST.OpCreate#getId()
	 * @see #getOpCreate()
	 * @generated
	 */
	EAttribute getOpCreate_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.OpCreate#getFieldset <em>Fieldset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldset</em>'.
	 * @see metamodelREST.OpCreate#getFieldset()
	 * @see #getOpCreate()
	 * @generated
	 */
	EReference getOpCreate_Fieldset();

	/**
	 * Returns the meta object for class '{@link metamodelREST.FieldSet <em>Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Set</em>'.
	 * @see metamodelREST.FieldSet
	 * @generated
	 */
	EClass getFieldSet();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.FieldSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodelREST.FieldSet#getName()
	 * @see #getFieldSet()
	 * @generated
	 */
	EAttribute getFieldSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.FieldSet#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see metamodelREST.FieldSet#getExpr()
	 * @see #getFieldSet()
	 * @generated
	 */
	EAttribute getFieldSet_Expr();

	/**
	 * Returns the meta object for class '{@link metamodelREST.OpRead <em>Op Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Read</em>'.
	 * @see metamodelREST.OpRead
	 * @generated
	 */
	EClass getOpRead();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.OpRead#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fields</em>'.
	 * @see metamodelREST.OpRead#getFields()
	 * @see #getOpRead()
	 * @generated
	 */
	EAttribute getOpRead_Fields();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.OpRead#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metamodelREST.OpRead#getId()
	 * @see #getOpRead()
	 * @generated
	 */
	EAttribute getOpRead_Id();

	/**
	 * Returns the meta object for class '{@link metamodelREST.OpUpdate <em>Op Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Update</em>'.
	 * @see metamodelREST.OpUpdate
	 * @generated
	 */
	EClass getOpUpdate();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.OpUpdate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metamodelREST.OpUpdate#getId()
	 * @see #getOpUpdate()
	 * @generated
	 */
	EAttribute getOpUpdate_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.OpUpdate#getFieldset <em>Fieldset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldset</em>'.
	 * @see metamodelREST.OpUpdate#getFieldset()
	 * @see #getOpUpdate()
	 * @generated
	 */
	EReference getOpUpdate_Fieldset();

	/**
	 * Returns the meta object for class '{@link metamodelREST.OpDelete <em>Op Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Delete</em>'.
	 * @see metamodelREST.OpDelete
	 * @generated
	 */
	EClass getOpDelete();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.OpDelete#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see metamodelREST.OpDelete#getId()
	 * @see #getOpDelete()
	 * @generated
	 */
	EAttribute getOpDelete_Id();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see metamodelREST.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.Answer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see metamodelREST.Answer#getStatus()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Status();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.Answer#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see metamodelREST.Answer#getReturn()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Return();

	/**
	 * Returns the meta object for class '{@link metamodelREST.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see metamodelREST.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the attribute '{@link metamodelREST.Struct#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fields</em>'.
	 * @see metamodelREST.Struct#getFields()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Fields();

	/**
	 * Returns the meta object for class '{@link metamodelREST.RestSystem <em>Rest System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest System</em>'.
	 * @see metamodelREST.RestSystem
	 * @generated
	 */
	EClass getRestSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodelREST.RestSystem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see metamodelREST.RestSystem#getRequest()
	 * @see #getRestSystem()
	 * @generated
	 */
	EReference getRestSystem_Request();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelRESTFactory getMetamodelRESTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RequestImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__ROUTE = eINSTANCE.getRequest_Route();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__DATA = eINSTANCE.getRequest_Data();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__OPS = eINSTANCE.getRequest_Ops();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.ReGetImpl <em>Re Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.ReGetImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getReGet()
		 * @generated
		 */
		EClass RE_GET = eINSTANCE.getReGet();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RePostImpl <em>Re Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RePostImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRePost()
		 * @generated
		 */
		EClass RE_POST = eINSTANCE.getRePost();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RePutImpl <em>Re Put</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RePutImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRePut()
		 * @generated
		 */
		EClass RE_PUT = eINSTANCE.getRePut();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.ReDeleteImpl <em>Re Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.ReDeleteImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getReDelete()
		 * @generated
		 */
		EClass RE_DELETE = eINSTANCE.getReDelete();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RouteImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__SEGMENT = eINSTANCE.getRoute_Segment();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.SegmentImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__VALUE = eINSTANCE.getSegment_Value();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.DataImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.ParameterImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.AttachmentsImpl <em>Attachments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.AttachmentsImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getAttachments()
		 * @generated
		 */
		EClass ATTACHMENTS = eINSTANCE.getAttachments();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RandomImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRandom()
		 * @generated
		 */
		EClass RANDOM = eINSTANCE.getRandom();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.OperationImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Failed Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FAILED_ANSWER = eINSTANCE.getOperation_FailedAnswer();

		/**
		 * The meta object literal for the '<em><b>Succ Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SUCC_ANSWER = eINSTANCE.getOperation_SuccAnswer();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__STRUCT = eINSTANCE.getOperation_Struct();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.OpCreateImpl <em>Op Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.OpCreateImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpCreate()
		 * @generated
		 */
		EClass OP_CREATE = eINSTANCE.getOpCreate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_CREATE__ID = eINSTANCE.getOpCreate_Id();

		/**
		 * The meta object literal for the '<em><b>Fieldset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_CREATE__FIELDSET = eINSTANCE.getOpCreate_Fieldset();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.FieldSetImpl <em>Field Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.FieldSetImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getFieldSet()
		 * @generated
		 */
		EClass FIELD_SET = eINSTANCE.getFieldSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SET__NAME = eINSTANCE.getFieldSet_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SET__EXPR = eINSTANCE.getFieldSet_Expr();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.OpReadImpl <em>Op Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.OpReadImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpRead()
		 * @generated
		 */
		EClass OP_READ = eINSTANCE.getOpRead();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_READ__FIELDS = eINSTANCE.getOpRead_Fields();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_READ__ID = eINSTANCE.getOpRead_Id();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.OpUpdateImpl <em>Op Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.OpUpdateImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpUpdate()
		 * @generated
		 */
		EClass OP_UPDATE = eINSTANCE.getOpUpdate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_UPDATE__ID = eINSTANCE.getOpUpdate_Id();

		/**
		 * The meta object literal for the '<em><b>Fieldset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_UPDATE__FIELDSET = eINSTANCE.getOpUpdate_Fieldset();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.OpDeleteImpl <em>Op Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.OpDeleteImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getOpDelete()
		 * @generated
		 */
		EClass OP_DELETE = eINSTANCE.getOpDelete();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_DELETE__ID = eINSTANCE.getOpDelete_Id();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.AnswerImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__STATUS = eINSTANCE.getAnswer_Status();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__RETURN = eINSTANCE.getAnswer_Return();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.StructImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

		/**
		 * The meta object literal for the '{@link metamodelREST.impl.RestSystemImpl <em>Rest System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodelREST.impl.RestSystemImpl
		 * @see metamodelREST.impl.MetamodelRESTPackageImpl#getRestSystem()
		 * @generated
		 */
		EClass REST_SYSTEM = eINSTANCE.getRestSystem();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SYSTEM__REQUEST = eINSTANCE.getRestSystem_Request();

	}

} //MetamodelRESTPackage
