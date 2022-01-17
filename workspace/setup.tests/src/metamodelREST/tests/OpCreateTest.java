/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.OpCreate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Op Create</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpCreateTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpCreateTest.class);
	}

	/**
	 * Constructs a new Op Create test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpCreateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Op Create test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OpCreate getFixture() {
		return (OpCreate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createOpCreate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OpCreateTest
