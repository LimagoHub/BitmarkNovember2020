package de.bitmark.services;

public interface PersonService {
	
	public void save(Person person) throws PersonenServiceException;
	public Person load();

}
