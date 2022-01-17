/**
 */
package metamodelREST.tests;

import junit.textui.TestRunner;

import metamodelREST.Attachments;
import metamodelREST.MetamodelRESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attachments</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttachmentsTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttachmentsTest.class);
	}

	/**
	 * Constructs a new Attachments test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attachments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Attachments getFixture() {
		return (Attachments)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelRESTFactory.eINSTANCE.createAttachments());
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

} //AttachmentsTest
