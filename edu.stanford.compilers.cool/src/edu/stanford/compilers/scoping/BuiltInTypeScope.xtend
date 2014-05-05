package edu.stanford.compilers.scoping

import com.google.common.collect.ForwardingMap
import edu.stanford.compilers.cool.IdentifiableElement
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.MapBasedScope

class BuiltInTypeScope extends MapBasedScope {

	new(ResourceSet resourceSet, IScope parentScope) {
		super(parentScope, new BuiltInTypeEObjectDescriptionMap(resourceSet), false);
	}
}

class BuiltInTypeEObjectDescriptionMap extends ForwardingMap<QualifiedName, IEObjectDescription> {
	private Map<QualifiedName, IEObjectDescription> innerDelegate = null
	private ResourceSet resourceSet

	new(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	override Map<QualifiedName, IEObjectDescription> delegate() {
		if (innerDelegate == null) {
			innerDelegate = createDescriptions
		}
		return innerDelegate;
	}

	def createDescriptions() {
		val result = <QualifiedName, IEObjectDescription>newHashMap()
		val uri = URI.createURI("builtin.cl")
		var resource = resourceSet.getResource(uri, false)
		if(resource === null) {		
			resource = resourceSet.createResource(URI.createURI("builtin.cl"))
			for (type : BuiltInTypes.getBuiltInTypes) {
				resource.contents.add(type)
				val description = EObjectDescription.create((type as IdentifiableElement).getName(), type);
				result.put(description.getName(), description);
			}
		}
		for (type : resource.contents) {
			val description = EObjectDescription.create((type as IdentifiableElement).getName(), type);
			result.put(description.getName(), description);
		}
		return result;
	}
}
