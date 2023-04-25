package com.r3kprojects.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public Person process(Person item) throws Exception {
		
		String nombre = item.getFirstName().toUpperCase();
		String apellido = item.getLastName().toUpperCase();
		Person persona = new Person(nombre, apellido);
		logger.info("Transformando a mayusculas el objeto persona " + item + " en: " + persona);			
		
		return persona;	
	}

}
