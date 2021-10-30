package com.ncm.roster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncm.roster.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findAll();
	
}