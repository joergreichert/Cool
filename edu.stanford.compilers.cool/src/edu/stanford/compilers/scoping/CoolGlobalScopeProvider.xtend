package edu.stanford.compilers.scoping

import com.google.common.base.Predicate
import edu.stanford.compilers.cool.CoolPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider

class CoolGlobalScopeProvider extends DefaultGlobalScopeProvider {

	override getScope(IScope parent, Resource context, boolean ignoreCase, EClass eClass,
			Predicate<IEObjectDescription> filter) {
		var result = super.getScope(parent, context, ignoreCase, eClass, filter);
		if (isType(eClass)) {
			result = new BuiltInTypeScope(context.resourceSet, result);
			return result;
		}
		return result;
	}
	
	def private isType(EClass eClass) {
		return eClass == CoolPackage.Literals.TYPE || eClass.getEPackage() == CoolPackage.eINSTANCE
				&& CoolPackage.Literals.TYPE.isSuperTypeOf(eClass);		
	}
}