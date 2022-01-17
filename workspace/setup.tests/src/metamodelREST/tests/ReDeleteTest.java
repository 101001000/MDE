/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.ReDelete;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Re Delete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReDeleteTest extends RequestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReDeleteTest.class);
	}

	/**
	 * Constructs a new Re Delete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReDeleteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Re Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReDelete getFixture() {
		return (ReDelete)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createReDelete());
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

} //ReDeleteTest
