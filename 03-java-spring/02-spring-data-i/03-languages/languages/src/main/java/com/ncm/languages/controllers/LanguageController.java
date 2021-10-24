package com.ncm.languages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ncm.languages.services.LanguageService;

@Controller
public class LanguageController {

	@Autowired
	private LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
}
