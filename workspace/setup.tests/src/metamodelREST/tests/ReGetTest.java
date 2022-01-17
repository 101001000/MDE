/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.ReGet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Re Get</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReGetTest extends RequestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReGetTest.class);
	}

	/**
	 * Constructs a new Re Get test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReGetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Re Get test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReGet getFixture() {
		return (ReGet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createReGet());
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

} //ReGetTest
