package de.main;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.ServiceLoader;



import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;
import de.commons.StringUtils;

public class Main {

	public static void main(String[] args) throws Exception{

		
		StringBuilder s = new StringBuilder();
		
		Instant start = Instant.now(); 
		
		for (int i = 0; i < 2_000_000; i++) {
			s.append( "a");
		}
		String ergebnis = s.toString();
		Instant ende = Instant.now(); 
		
		Duration duration = Duration.between(start, ende);
		System.out.println("Duration = " + duration.toMillis());
		
//			PersonService ps = PersonService.getInstance().get();
//			
//			Client client  = new Client(ps);
//			
//			client.run();
//		Person p = new Person();
//		System.out.println(p);
//		
//		Method m = p.getClass().getDeclaredMethod("setAlter",int.class);
//		m.setAccessible(true);
//		m.invoke(p, 20);
//		System.out.println(p);
		
		
		
	}

}
