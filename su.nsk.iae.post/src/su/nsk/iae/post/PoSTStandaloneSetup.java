/*
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PoSTStandaloneSetup extends PoSTStandaloneSetupGenerated {

	public static void doSetup() {
		new PoSTStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
