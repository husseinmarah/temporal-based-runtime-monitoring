package org.xtext.constraint.mydsl.loading;

import java.util.Iterator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;

import at.jku.se.mosumo.dronology.constraint.esper.Constraint;
import at.jku.se.mosumo.dronology.constraint.esper.EsperEngine;
import at.jku.se.mosumo.dronology.constraint.esper.EsperPackage;

public class loadEsperModel {
    public static EsperEngine load() {
        // Initialize the model
		EPackage.Registry.INSTANCE.put(EsperPackage.eINSTANCE.getNsURI(), EsperPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        // Get the resource
		Resource resource = resSet.getResource(
				URI.createURI("file:///C:/Users/Hussein/eclipse-workspace-dsl-demo/org.xtext.example.mydsl.parent/at.jku.se.mosumo.dronology.constraint.esper/model/EsperEngine3.xmi"),
				true);
        // Get the first model element and cast it to the right type
        EsperEngine esperEngine = (EsperEngine) resource.getContents().get(0);
        return esperEngine;
    }
    
    
    public static void main(String[] args) {
        // Loading the existing model
//    	loadEsperModel loader = new loadEsperModel();
    	EsperEngine e = loadEsperModel.load();
        // Accessing the model information
        System.out.println(e.getName());
        System.out.println(e.getConfiguration().getName());

        for (Iterator<Constraint> iterator = e.getConstraint().iterator(); iterator.hasNext();) {
        	Constraint c = iterator.next();
            System.out.println("Name : " + c.getName());
        }
    }
}
