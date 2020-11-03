package de.main;

import java.lang.reflect.Method;
import java.util.ServiceLoader;



import de.bitmark.services.Person;
import de.bitmark.services.PersonService;
import de.bitmark.services.PersonenServiceException;
import de.commons.StringUtils;

public class Main {

	public static void main(String[] args) throws Exception{
	
			PersonService ps = PersonService.getInstance().get();
			
			ps.save(new Person());
		
			
			Person p = new Person();
			p.setVorname(StringUtils.toUpper(p.getVorname()));
			
			System.out.println(p);

//		Person p = new Person();
//		System.out.println(p);
//		
//		Method m = p.getClass().getDeclaredMethod("setAlter",int.class);
//		m.setAccessible(true);
//		m.invoke(p, 20);
//		System.out.println(p);
		
		
		
	}

}
