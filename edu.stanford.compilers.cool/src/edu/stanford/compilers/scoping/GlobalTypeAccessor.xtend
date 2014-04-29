package edu.stanford.compilers.scoping

import com.google.inject.Inject
import edu.stanford.compilers.cool.Type
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IGlobalScopeProvider

class GlobalTypeAccessor {
	@Inject 
	private IGlobalScopeProvider globalScopeProvider

	def getObject(EObject eo, EReference reference) {
		eo.getGlobalType("Object", reference)
	}
	
	def getBool(EObject eo, EReference reference) {
		eo.getGlobalType("Bool", reference)
	}
	
	def getString(EObject eo, EReference reference) {
		eo.getGlobalType("String", reference)
	}	
	
	def getInt(EObject eo, EReference reference) {
		eo.getGlobalType("Int", reference)
	}	
	
	def private getGlobalType(EObject eo, String typeName, EReference reference) {
		return globalScopeProvider.getScope(eo.eResource, reference) [
			return typeName.equals(it.getName())
		].allElements.filter(Type).head 
	}	
}