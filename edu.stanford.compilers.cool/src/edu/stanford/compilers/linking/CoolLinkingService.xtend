package edu.stanford.compilers.linking

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.EcoreUtil2
import edu.stanford.compilers.cool.Class_

class CoolLinkingService extends DefaultLinkingService {
	
	override getLinkedObjects(EObject context, EReference ref, INode node) {
		if("SELF_TYPE".equals(node.text)) {
			val clazz = EcoreUtil2.getContainerOfType(context, Class_)
			if(clazz !== null) {
				val linked = <EObject>newArrayList 
				linked += clazz		
				return linked
			}
		}
		return super.getLinkedObjects(context, ref, node)
	}
}