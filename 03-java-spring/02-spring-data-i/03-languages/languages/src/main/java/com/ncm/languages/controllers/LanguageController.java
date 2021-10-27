package com.ncm.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ncm.languages.models.Language;
import com.ncm.languages.services.LanguageService;

@Controller
public class LanguageController {

	@Autowired
	private LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute("language") Language language, Model model) {
		model.addAttribute("allLanguages", this.languageService.allLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLanguages", this.languageService.allLanguages());
			return "index.jsp";
		}
		this.languageService.createLanguage(language);
			return "redirect:/";
	}
	
//view one language
	@GetMapping("/show/{id}")
	public String showLanguage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("retrieveLanguage", this.languageService.retrieveLanguage(id));
		return "show.jsp";
	}
	//edit/update language
	@GetMapping("/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", this.languageService.retrieveLanguage(id));
		return "edit.jsp";
		}
	@PutMapping("/edit/{id}")
	public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("language", this.languageService.retrieveLanguage(id));
			return "edit.jsp";
	}
		this.languageService.updateLanguage(language);
		return "redirect:/show/{id}";
}
	//delete route
	@DeleteMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.languageService.delete(id);
		return "redirect:/";
	}
	}
