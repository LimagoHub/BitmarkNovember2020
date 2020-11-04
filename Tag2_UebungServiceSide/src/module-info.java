import de.services.StringPublisher;
import de.services.impl.StringPublisherImpl;
import de.sources.StringSource;
import de.sources.impl.RaWStringSource;

module Tag2_UebungServiceSide {
	exports de.services;
	
	provides StringPublisher with StringPublisherImpl;
	uses StringPublisher;
	
	provides StringSource with RaWStringSource;
	uses StringSource;
}