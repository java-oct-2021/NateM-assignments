package com.nathan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nathan.languages.models.Languages;
import com.nathan.languages.repositories.LanguagesRepository;

@Service
public class LanguagesService {
	private final LanguagesRepository langRepo;
	
	public LanguagesService(LanguagesRepository repo) {
		this.langRepo = repo;
	}
	
	//return all languages
	public List<Languages> allLanguages(){
		return this.langRepo.findAll();
	}
	
	//retrieve a language // CRUD converts to optional (add .orElse(null))
	public Languages findLanguage(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	//create a language
	public Languages createLanguage(Languages newLang) {
		return this.langRepo.save(newLang);
	}
	
	//update/edit a language
	
	public Languages updateLanguage(Languages updatedLang) {
		return this.langRepo.save(updatedLang);
	}
	
	//delete a language
	public void deleteLanguage(Long id) {
		this.langRepo.deleteById(id);
	}
	
}