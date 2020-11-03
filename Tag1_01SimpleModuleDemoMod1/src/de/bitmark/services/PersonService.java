package de.bitmark.services;

import java.util.Optional;
import java.util.ServiceLoader;

public interface PersonService {
	
	public void save(Person person) throws PersonenServiceException;
	public Person load();
	
	static Optional<PersonService> getInstance() {
		ServiceLoader<PersonService> serviceLoader = ServiceLoader.load(PersonService.class);
		
		return serviceLoader.findFirst();
	}

}
