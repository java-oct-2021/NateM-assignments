package com.ncm.dojoNinja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.dojoNinja.models.Dojo;
import com.ncm.dojoNinja.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	
	private DojoRepository dojoRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo oneDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	public Dojo createDojo(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}
}