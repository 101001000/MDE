/**
 */
package restModel;

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
 * @see restModel.RestModelFactory
 * @model kind="package"
 * @generated
 */
public interface RestModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/metamodel/restModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestModelPackage eINSTANCE = restModel.impl.RestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link restModel.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RequestImpl
	 * @see restModel.impl.RestModelPackageImpl#getRequest()
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
	 * The feature id for the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SUCC_ANSWER = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__OPERATIONS = 3;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restModel.impl.ReGetImpl <em>Re Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.ReGetImpl
	 * @see restModel.impl.RestModelPackageImpl#getReGet()
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
	 * The feature id for the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET__SUCC_ANSWER = REQUEST__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_GET__OPERATIONS = REQUEST__OPERATIONS;

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
	 * The meta object id for the '{@link restModel.impl.RePostImpl <em>Re Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RePostImpl
	 * @see restModel.impl.RestModelPackageImpl#getRePost()
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
	 * The feature id for the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST__SUCC_ANSWER = REQUEST__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_POST__OPERATIONS = REQUEST__OPERATIONS;

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
	 * The meta object id for the '{@link restModel.impl.RePutImpl <em>Re Put</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RePutImpl
	 * @see restModel.impl.RestModelPackageImpl#getRePut()
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
	 * The feature id for the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT__SUCC_ANSWER = REQUEST__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_PUT__OPERATIONS = REQUEST__OPERATIONS;

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
	 * The meta object id for the '{@link restModel.impl.ReDeleteImpl <em>Re Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.ReDeleteImpl
	 * @see restModel.impl.RestModelPackageImpl#getReDelete()
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
	 * The feature id for the '<em><b>Succ Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE__SUCC_ANSWER = REQUEST__SUCC_ANSWER;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_DELETE__OPERATIONS = REQUEST__OPERATIONS;

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
	 * The meta object id for the '{@link restModel.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RouteImpl
	 * @see restModel.impl.RestModelPackageImpl#getRoute()
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
	 * The meta object id for the '{@link restModel.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.SegmentImpl
	 * @see restModel.impl.RestModelPackageImpl#getSegment()
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
	 * The meta object id for the '{@link restModel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.DataImpl
	 * @see restModel.impl.RestModelPackageImpl#getData()
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
	 * The meta object id for the '{@link restModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.ParameterImpl
	 * @see restModel.impl.RestModelPackageImpl#getParameter()
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
	 * The meta object id for the '{@link restModel.impl.AttachmentsImpl <em>Attachments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.AttachmentsImpl
	 * @see restModel.impl.RestModelPackageImpl#getAttachments()
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
	 * The meta object id for the '{@link restModel.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RandomImpl
	 * @see restModel.impl.RestModelPackageImpl#getRandom()
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
	 * The meta object id for the '{@link restModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.OperationImpl
	 * @see restModel.impl.RestModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FAILED_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = 2;

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
	 * The meta object id for the '{@link restModel.impl.OpCreateImpl <em>Op Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.OpCreateImpl
	 * @see restModel.impl.RestModelPackageImpl#getOpCreate()
	 * @generated
	 */
	int OP_CREATE = 12;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
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
	int OP_CREATE__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Fieldset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE__FIELDSET = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_CREATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restModel.impl.FieldSetImpl <em>Field Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.FieldSetImpl
	 * @see restModel.impl.RestModelPackageImpl#getFieldSet()
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
	 * The meta object id for the '{@link restModel.impl.OpReadImpl <em>Op Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.OpReadImpl
	 * @see restModel.impl.RestModelPackageImpl#getOpRead()
	 * @generated
	 */
	int OP_READ = 14;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__STRUCT = OPERATION__STRUCT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ__FIELD = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_READ_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restModel.impl.OpUpdateImpl <em>Op Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.OpUpdateImpl
	 * @see restModel.impl.RestModelPackageImpl#getOpUpdate()
	 * @generated
	 */
	int OP_UPDATE = 15;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
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
	int OP_UPDATE__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Fieldset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE__FIELDSET = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_UPDATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restModel.impl.OpDeleteImpl <em>Op Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.OpDeleteImpl
	 * @see restModel.impl.RestModelPackageImpl#getOpDelete()
	 * @generated
	 */
	int OP_DELETE = 16;

	/**
	 * The feature id for the '<em><b>Failed Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE__FAILED_ANSWER = OPERATION__FAILED_ANSWER;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
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
	int OP_DELETE__ID = OPERATION__ID;

	/**
	 * The number of structural features of the '<em>Op Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Op Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DELETE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restModel.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.AnswerImpl
	 * @see restModel.impl.RestModelPackageImpl#getAnswer()
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
	 * The meta object id for the '{@link restModel.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.StructImpl
	 * @see restModel.impl.RestModelPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restModel.impl.RestSystemImpl <em>Rest System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.RestSystemImpl
	 * @see restModel.impl.RestModelPackageImpl#getRestSystem()
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
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM__STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM__ANSWER = 2;

	/**
	 * The number of structural features of the '<em>Rest System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rest System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restModel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restModel.impl.FieldImpl
	 * @see restModel.impl.RestModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link restModel.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see restModel.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference '{@link restModel.Request#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see restModel.Request#getRoute()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.Request#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see restModel.Request#getData()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Data();

	/**
	 * Returns the meta object for the reference '{@link restModel.Request#getSuccAnswer <em>Succ Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Succ Answer</em>'.
	 * @see restModel.Request#getSuccAnswer()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_SuccAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.Request#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see restModel.Request#getOperations()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Operations();

	/**
	 * Returns the meta object for class '{@link restModel.ReGet <em>Re Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Get</em>'.
	 * @see restModel.ReGet
	 * @generated
	 */
	EClass getReGet();

	/**
	 * Returns the meta object for class '{@link restModel.RePost <em>Re Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Post</em>'.
	 * @see restModel.RePost
	 * @generated
	 */
	EClass getRePost();

	/**
	 * Returns the meta object for class '{@link restModel.RePut <em>Re Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Put</em>'.
	 * @see restModel.RePut
	 * @generated
	 */
	EClass getRePut();

	/**
	 * Returns the meta object for class '{@link restModel.ReDelete <em>Re Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Delete</em>'.
	 * @see restModel.ReDelete
	 * @generated
	 */
	EClass getReDelete();

	/**
	 * Returns the meta object for class '{@link restModel.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see restModel.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.Route#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see restModel.Route#getSegment()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Segment();

	/**
	 * Returns the meta object for class '{@link restModel.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see restModel.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Segment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see restModel.Segment#getValue()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Value();

	/**
	 * Returns the meta object for class '{@link restModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see restModel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restModel.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for class '{@link restModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see restModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link restModel.Attachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachments</em>'.
	 * @see restModel.Attachments
	 * @generated
	 */
	EClass getAttachments();

	/**
	 * Returns the meta object for class '{@link restModel.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see restModel.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for class '{@link restModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see restModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link restModel.Operation#getFailedAnswer <em>Failed Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed Answer</em>'.
	 * @see restModel.Operation#getFailedAnswer()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_FailedAnswer();

	/**
	 * Returns the meta object for the reference '{@link restModel.Operation#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see restModel.Operation#getStruct()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Struct();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Operation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see restModel.Operation#getId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Id();

	/**
	 * Returns the meta object for class '{@link restModel.OpCreate <em>Op Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Create</em>'.
	 * @see restModel.OpCreate
	 * @generated
	 */
	EClass getOpCreate();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.OpCreate#getFieldset <em>Fieldset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldset</em>'.
	 * @see restModel.OpCreate#getFieldset()
	 * @see #getOpCreate()
	 * @generated
	 */
	EReference getOpCreate_Fieldset();

	/**
	 * Returns the meta object for class '{@link restModel.FieldSet <em>Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Set</em>'.
	 * @see restModel.FieldSet
	 * @generated
	 */
	EClass getFieldSet();

	/**
	 * Returns the meta object for the attribute '{@link restModel.FieldSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restModel.FieldSet#getName()
	 * @see #getFieldSet()
	 * @generated
	 */
	EAttribute getFieldSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link restModel.FieldSet#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see restModel.FieldSet#getExpr()
	 * @see #getFieldSet()
	 * @generated
	 */
	EAttribute getFieldSet_Expr();

	/**
	 * Returns the meta object for class '{@link restModel.OpRead <em>Op Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Read</em>'.
	 * @see restModel.OpRead
	 * @generated
	 */
	EClass getOpRead();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.OpRead#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see restModel.OpRead#getField()
	 * @see #getOpRead()
	 * @generated
	 */
	EReference getOpRead_Field();

	/**
	 * Returns the meta object for class '{@link restModel.OpUpdate <em>Op Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Update</em>'.
	 * @see restModel.OpUpdate
	 * @generated
	 */
	EClass getOpUpdate();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.OpUpdate#getFieldset <em>Fieldset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldset</em>'.
	 * @see restModel.OpUpdate#getFieldset()
	 * @see #getOpUpdate()
	 * @generated
	 */
	EReference getOpUpdate_Fieldset();

	/**
	 * Returns the meta object for class '{@link restModel.OpDelete <em>Op Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Delete</em>'.
	 * @see restModel.OpDelete
	 * @generated
	 */
	EClass getOpDelete();

	/**
	 * Returns the meta object for class '{@link restModel.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see restModel.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Answer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see restModel.Answer#getStatus()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Status();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Answer#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see restModel.Answer#getReturn()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Return();

	/**
	 * Returns the meta object for class '{@link restModel.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see restModel.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Struct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restModel.Struct#getName()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.Struct#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see restModel.Struct#getFields()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Fields();

	/**
	 * Returns the meta object for class '{@link restModel.RestSystem <em>Rest System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest System</em>'.
	 * @see restModel.RestSystem
	 * @generated
	 */
	EClass getRestSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.RestSystem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see restModel.RestSystem#getRequest()
	 * @see #getRestSystem()
	 * @generated
	 */
	EReference getRestSystem_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.RestSystem#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see restModel.RestSystem#getStruct()
	 * @see #getRestSystem()
	 * @generated
	 */
	EReference getRestSystem_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link restModel.RestSystem#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see restModel.RestSystem#getAnswer()
	 * @see #getRestSystem()
	 * @generated
	 */
	EReference getRestSystem_Answer();

	/**
	 * Returns the meta object for class '{@link restModel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see restModel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link restModel.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restModel.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestModelFactory getRestModelFactory();

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
		 * The meta object literal for the '{@link restModel.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RequestImpl
		 * @see restModel.impl.RestModelPackageImpl#getRequest()
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
		 * The meta object literal for the '<em><b>Succ Answer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__SUCC_ANSWER = eINSTANCE.getRequest_SuccAnswer();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__OPERATIONS = eINSTANCE.getRequest_Operations();

		/**
		 * The meta object literal for the '{@link restModel.impl.ReGetImpl <em>Re Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.ReGetImpl
		 * @see restModel.impl.RestModelPackageImpl#getReGet()
		 * @generated
		 */
		EClass RE_GET = eINSTANCE.getReGet();

		/**
		 * The meta object literal for the '{@link restModel.impl.RePostImpl <em>Re Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RePostImpl
		 * @see restModel.impl.RestModelPackageImpl#getRePost()
		 * @generated
		 */
		EClass RE_POST = eINSTANCE.getRePost();

		/**
		 * The meta object literal for the '{@link restModel.impl.RePutImpl <em>Re Put</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RePutImpl
		 * @see restModel.impl.RestModelPackageImpl#getRePut()
		 * @generated
		 */
		EClass RE_PUT = eINSTANCE.getRePut();

		/**
		 * The meta object literal for the '{@link restModel.impl.ReDeleteImpl <em>Re Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.ReDeleteImpl
		 * @see restModel.impl.RestModelPackageImpl#getReDelete()
		 * @generated
		 */
		EClass RE_DELETE = eINSTANCE.getReDelete();

		/**
		 * The meta object literal for the '{@link restModel.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RouteImpl
		 * @see restModel.impl.RestModelPackageImpl#getRoute()
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
		 * The meta object literal for the '{@link restModel.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.SegmentImpl
		 * @see restModel.impl.RestModelPackageImpl#getSegment()
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
		 * The meta object literal for the '{@link restModel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.DataImpl
		 * @see restModel.impl.RestModelPackageImpl#getData()
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
		 * The meta object literal for the '{@link restModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.ParameterImpl
		 * @see restModel.impl.RestModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link restModel.impl.AttachmentsImpl <em>Attachments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.AttachmentsImpl
		 * @see restModel.impl.RestModelPackageImpl#getAttachments()
		 * @generated
		 */
		EClass ATTACHMENTS = eINSTANCE.getAttachments();

		/**
		 * The meta object literal for the '{@link restModel.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RandomImpl
		 * @see restModel.impl.RestModelPackageImpl#getRandom()
		 * @generated
		 */
		EClass RANDOM = eINSTANCE.getRandom();

		/**
		 * The meta object literal for the '{@link restModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.OperationImpl
		 * @see restModel.impl.RestModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Failed Answer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FAILED_ANSWER = eINSTANCE.getOperation_FailedAnswer();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__STRUCT = eINSTANCE.getOperation_Struct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ID = eINSTANCE.getOperation_Id();

		/**
		 * The meta object literal for the '{@link restModel.impl.OpCreateImpl <em>Op Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.OpCreateImpl
		 * @see restModel.impl.RestModelPackageImpl#getOpCreate()
		 * @generated
		 */
		EClass OP_CREATE = eINSTANCE.getOpCreate();

		/**
		 * The meta object literal for the '<em><b>Fieldset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_CREATE__FIELDSET = eINSTANCE.getOpCreate_Fieldset();

		/**
		 * The meta object literal for the '{@link restModel.impl.FieldSetImpl <em>Field Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.FieldSetImpl
		 * @see restModel.impl.RestModelPackageImpl#getFieldSet()
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
		 * The meta object literal for the '{@link restModel.impl.OpReadImpl <em>Op Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.OpReadImpl
		 * @see restModel.impl.RestModelPackageImpl#getOpRead()
		 * @generated
		 */
		EClass OP_READ = eINSTANCE.getOpRead();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_READ__FIELD = eINSTANCE.getOpRead_Field();

		/**
		 * The meta object literal for the '{@link restModel.impl.OpUpdateImpl <em>Op Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.OpUpdateImpl
		 * @see restModel.impl.RestModelPackageImpl#getOpUpdate()
		 * @generated
		 */
		EClass OP_UPDATE = eINSTANCE.getOpUpdate();

		/**
		 * The meta object literal for the '<em><b>Fieldset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_UPDATE__FIELDSET = eINSTANCE.getOpUpdate_Fieldset();

		/**
		 * The meta object literal for the '{@link restModel.impl.OpDeleteImpl <em>Op Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.OpDeleteImpl
		 * @see restModel.impl.RestModelPackageImpl#getOpDelete()
		 * @generated
		 */
		EClass OP_DELETE = eINSTANCE.getOpDelete();

		/**
		 * The meta object literal for the '{@link restModel.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.AnswerImpl
		 * @see restModel.impl.RestModelPackageImpl#getAnswer()
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
		 * The meta object literal for the '{@link restModel.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.StructImpl
		 * @see restModel.impl.RestModelPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__NAME = eINSTANCE.getStruct_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

		/**
		 * The meta object literal for the '{@link restModel.impl.RestSystemImpl <em>Rest System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.RestSystemImpl
		 * @see restModel.impl.RestModelPackageImpl#getRestSystem()
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

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SYSTEM__STRUCT = eINSTANCE.getRestSystem_Struct();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SYSTEM__ANSWER = eINSTANCE.getRestSystem_Answer();

		/**
		 * The meta object literal for the '{@link restModel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restModel.impl.FieldImpl
		 * @see restModel.impl.RestModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

	}

} //RestModelPackage
