/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.constraint.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.constraint.mydsl.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}
}