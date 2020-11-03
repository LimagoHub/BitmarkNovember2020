import de.bitmark.services.PersonService;
import de.bitmark.services.impl.PersonServiceImpl;

module Tag1_01SimpleModuleDemoMod1 {
	
	requires transitive Tag1_03SimpleModuleDemoMod3;
	
	exports de.bitmark.services;
	opens de.bitmark.services;
	
	provides PersonService with PersonServiceImpl;
	uses PersonService;
}