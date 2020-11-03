package de.bitmark.services.impl;

import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;

public class PersonServiceImpl implements PersonService {

	@Override
	public void save(Person person) throws PersonenServiceException{
		System.out.println(person);
	}

	@Override
	public Person load() {
		
		return new Person();
	}

}
