import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.semanticcontext.util.SemanticContextEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.semanticcontext {
	
	exports org.nasdanika.models.semanticcontext;
	exports org.nasdanika.models.semanticcontext.impl;
	exports org.nasdanika.models.semanticcontext.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with SemanticContextEPackageResourceSetCapabilityFactory;
	
}