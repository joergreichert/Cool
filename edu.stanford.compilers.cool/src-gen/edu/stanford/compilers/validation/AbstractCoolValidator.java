/*
 * generated by Xtext
 */
package edu.stanford.compilers.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCoolValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(edu.stanford.compilers.cool.CoolPackage.eINSTANCE);
		return result;
	}
}
