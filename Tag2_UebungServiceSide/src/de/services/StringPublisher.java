package de.services;

import java.util.ServiceLoader;
import java.util.concurrent.Flow.Publisher;

public interface StringPublisher extends Publisher<String> {
	
	void start();
	
	
	static StringPublisher getInstance() {
		ServiceLoader<StringPublisher> serviceLoader = ServiceLoader.load(StringPublisher.class);
		return serviceLoader.findFirst().get();
		
	}

}
