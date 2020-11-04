package de.main;

import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;

public class Client {
	
	private final PersonService personService;
	
	

	public Client(final PersonService personService) {
		
		this.personService = personService;
	}



	public void run() {
		try {
			personService.save(new Person());
		} catch (PersonenServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
