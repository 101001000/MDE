/**
 */
package metamodelREST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.RestSystem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rest System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestSystemTest extends TestCase {

	/**
	 * The fixture for this Rest System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestSystemTest.class);
	}

	/**
	 * Constructs a new Rest System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rest System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RestSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rest System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createRestSystem());
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

} //RestSystemTest
