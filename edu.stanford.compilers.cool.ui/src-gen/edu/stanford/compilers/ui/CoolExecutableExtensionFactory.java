/*
 * generated by Xtext
 */
package edu.stanford.compilers.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import edu.stanford.compilers.ui.internal.CoolActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CoolExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CoolActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CoolActivator.getInstance().getInjector(CoolActivator.EDU_STANFORD_COMPILERS_COOL);
	}
	
}
