package de.main;

import java.util.ServiceLoader;

import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;

public class Main {

	public static void main(String[] args) {
		try {
			ServiceLoader<PersonService> serviceLoader = ServiceLoader.load(PersonService.class);
			
			serviceLoader.findFirst().get().save(new Person());
		} catch (PersonenServiceException e) {
			
			e.printStackTrace();
		}

	}

}
