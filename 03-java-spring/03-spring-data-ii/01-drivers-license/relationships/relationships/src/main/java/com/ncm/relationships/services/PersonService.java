package com.ncm.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.relationships.models.Person;
import com.ncm.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	
		private PersonRepository personRepo;
		
		public PersonService(PersonRepository personRepo) {
			this.personRepo = personRepo;
		}
		//List all
		
		public List<Person> allPersons(){
			return personRepo.findAll();
		}
		//create a new person
		
		public Person createPerson(Person newPerson ) {
			return this.personRepo.save(newPerson);
		}
		
		//Show one Person
		
		public Person showPerson(Long id) {
			return this.personRepo.findById(id).orElse(null);
		}
		
		
		
}
