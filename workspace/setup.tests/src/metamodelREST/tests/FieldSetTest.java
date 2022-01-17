/**
 */
package metamodelREST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metamodelREST.FieldSet;
import metamodelREST.MetamodelRESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Field Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldSetTest extends TestCase {

	/**
	 * The fixture for this Field Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldSetTest.class);
	}

	/**
	 * Constructs a new Field Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Field Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FieldSet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Field Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSet getFixture() {
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
		setFixture(MetamodelRESTFactory.eINSTANCE.createFieldSet());
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

} //FieldSetTest
