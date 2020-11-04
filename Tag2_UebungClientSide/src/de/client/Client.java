package de.client;

import de.flowdmo.EndSubscriber;
import de.services.StringPublisher;

public class Client {

	public static void main(String[] args) {
		var publisher = StringPublisher.getInstance();
		
		publisher.subscribe(new EndSubscriber<String>());
		
		publisher.start();

	}

}
