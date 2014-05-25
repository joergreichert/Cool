package edu.stanford.compilers.validation;

import com.google.inject.Inject;
import edu.stanford.compilers.CoolTypesystem;
import edu.stanford.compilers.validation.CoolValidator;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;

@SuppressWarnings("all")
public class CoolTypesystemValidator extends CoolValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected CoolTypesystem xsemanticsSystem;
  
  protected CoolTypesystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
