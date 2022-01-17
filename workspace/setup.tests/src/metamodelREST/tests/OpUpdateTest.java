/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.OpUpdate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Op Update</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpUpdateTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpUpdateTest.class);
	}

	/**
	 * Constructs a new Op Update test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpUpdateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Op Update test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OpUpdate getFixture() {
		return (OpUpdate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createOpUpdate());
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

} //OpUpdateTest
