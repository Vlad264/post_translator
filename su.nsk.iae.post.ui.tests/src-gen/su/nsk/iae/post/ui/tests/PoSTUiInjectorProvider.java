/*
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import su.nsk.iae.post.ui.internal.PostActivator;

public class PoSTUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PostActivator.getInstance().getInjector("su.nsk.iae.post.PoST");
	}

}