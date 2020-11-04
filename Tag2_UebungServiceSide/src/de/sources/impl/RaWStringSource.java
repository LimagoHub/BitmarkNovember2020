package de.sources.impl;

import java.util.List;

import de.sources.StringSource;

public class RaWStringSource implements StringSource{

	@Override
	public List<String> findStrings() {
		
		return List.of("eins","zwei","drei","vier");
	}

}
