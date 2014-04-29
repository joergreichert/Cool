package edu.stanford.compilers.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import edu.stanford.compilers.cool.Class_;
import edu.stanford.compilers.cool.Feature_;
import edu.stanford.compilers.cool.IdentifiableElement;

public class CoolQualifiedNameProvider extends
		IQualifiedNameProvider.AbstractImpl {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		String name = null;
		if (obj instanceof Feature_) {
			Class_ class_ = EcoreUtil2.getContainerOfType(obj, Class_.class);
			if (class_ != null) {
				name += class_.getName() + ".";
			}
			name += ((Feature_) obj).getName();
		} else if (obj instanceof IdentifiableElement) {
			name = ((IdentifiableElement) obj).getName();
		}
		if (name == null)
			return null;
		return converter.toQualifiedName(name);
	}
}