/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.MetamodelRESTFactory;
import metamodelREST.Random;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Random</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RandomTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RandomTest.class);
	}

	/**
	 * Constructs a new Random test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Random test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Random getFixture() {
		return (Random)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createRandom());
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

} //RandomTest
