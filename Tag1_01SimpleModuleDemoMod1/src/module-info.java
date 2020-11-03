import de.bitmark.services.PersonService;
import de.bitmark.services.impl.PersonServiceImpl;

module Tag1_01SimpleModuleDemoMod1 {
	
	exports de.bitmark.services;
	provides PersonService with PersonServiceImpl;
}