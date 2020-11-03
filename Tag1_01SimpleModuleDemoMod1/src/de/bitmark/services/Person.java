package de.bitmark.services;

public class Person {
	
	private String vorname,name;

	
	public Person() {
		this("John","Doe");
	}
	public Person(String vorname, String name) {
		super();
		this.vorname = vorname;
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", name=" + name + "]";
	}
	
	

}
