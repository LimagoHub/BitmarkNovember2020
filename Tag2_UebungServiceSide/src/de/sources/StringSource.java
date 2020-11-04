package de.sources;

import java.util.List;
import java.util.ServiceLoader;

public interface StringSource {
	
	List<String> findStrings();
	
	static StringSource getInstance() {
		ServiceLoader<StringSource> serviceLoader = ServiceLoader.load(StringSource.class);
		return serviceLoader.findFirst().get();
		
	}

}
