package converter;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import restModel.RestModelPackage;
import rest.RestStandaloneSetup;


public class Main {


	public static void main(String args[]) throws IOException {
		
		// register URI of ecore meta-model
		EPackage.Registry.INSTANCE.put(RestModelPackage.eNS_URI, RestModelPackage.eINSTANCE);
		// create resource for xtext file
		Injector injector = new RestStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet xtextRS = injector.getInstance(XtextResourceSet.class);
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    			
			XtextResource xtextInput = (XtextResource)xtextRS.getResource(URI.createURI("file:/" + selectedFile.getAbsolutePath()), true);
			EcoreUtil.resolveAll(xtextInput);
			// create empty xmi resource
			
			ResourceSet xmiRS = new ResourceSetImpl();
			Resource xmiOutput = xmiRS.createResource(URI.createURI("file:/" + selectedFile.getAbsolutePath() + ".xmi"));
			// save xtext resource in xmi resource
			xmiOutput.getContents().add(xtextInput.getContents().get(0));
			xmiOutput.save(null);
		 
		}
	

	}
	
}
