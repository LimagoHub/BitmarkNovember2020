package de.bitmark.services;

public class Person {
	
	private String vorname,name;
	private int alter = 18;
	
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
	public int getAlter() {
		return alter;
	}
	private void setAlter(int alter) {
		this.alter = alter;
	}
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", name=" + name + ", alter=" + alter + "]";
	}

	

}
