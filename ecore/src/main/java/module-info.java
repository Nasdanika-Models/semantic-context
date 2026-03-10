import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.semanticcontext.ecore.ECoreGenSemanticContextProcessorsCapabilityFactory;

module org.nasdanika.models.semanticcontext.ecore {
		
	requires transitive org.nasdanika.models.semanticcontext;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.semanticcontext.ecore;
	opens org.nasdanika.models.semanticcontext.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenSemanticContextProcessorsCapabilityFactory; 		
	
}
