/*
 * generated by Xtext 2.25.0
 */
package rest.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import restXTEXT.ui.internal.RestXTEXTActivator;

public class RestUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RestXTEXTActivator.getInstance().getInjector("rest.Rest");
	}

}
