package com.ncm.roster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.roster.models.Contact;
import com.ncm.roster.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired

	private ContactRepository contactRepo;


	public List<Contact> allContacts(){
		return contactRepo.findAll();
	}
	
	public Contact createContact(Contact newContact) {
		return contactRepo.save(newContact);
	}
	
}
	
	
	
	
