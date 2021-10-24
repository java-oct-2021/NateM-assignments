package com.ncm.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ncm.languages.models.Language;
import com.ncm.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository langRepository) {
		this.languageRepository = langRepository;
	}
	//return all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	//create a language
	public Language createLanguage(Language newLanguage) {
		return languageRepository.save(newLanguage);
	}
	//return a specific language
	public Language retrieveLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get(); 
		} else {
				return null;
			}
	}
	//update language
	public Language update(Language updateLanguage) {
		return languageRepository.save(updateLanguage);
	}
	//delete language
	public void delete(Long id) {
		languageRepository.deleteById(id);
	}
		}
	

