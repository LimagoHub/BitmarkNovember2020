package de.bitmark.services.impl;

import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;
import de.commons.StringUtils;

public class PersonServiceImpl implements PersonService {

	@Override
	public void save(Person person) throws PersonenServiceException{
		System.out.println(StringUtils.toUpper(person.toString()));
	}

	@Override
	public Person load() {
		
		return new Person();
	}

}
