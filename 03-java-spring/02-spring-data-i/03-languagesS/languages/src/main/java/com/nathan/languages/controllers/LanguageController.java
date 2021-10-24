package com.nathan.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.nathan.languages.models.Languages;
import com.nathan.languages.services.LanguagesService;

@Controller
public class LanguageController {
	private final LanguagesService langService;
	public LanguageController(LanguagesService service) {
		this.langService = service;
	}
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("languages") Languages languages) {
		model.addAttribute("allLanguages", this.langService.allLanguages());
		return "index.jsp";
	}
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping("/")
	public String addLang(@Valid @ModelAttribute("languages") Languages languages, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLanguages", this.langService.allLanguages());
			return "index.jsp";
		}
		this.langService.createLanguage(languages);
			return "redirect:/";
	}
	//view a language 
	@GetMapping("/view/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("viewLang", this.langService.findLanguage(id));
		return "view.jsp";
	}
	//edit a language
	@GetMapping("/edit/{id}")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("languages", this.langService.findLanguage(id));
		return "edit.jsp";
	}
	@PutMapping("/edit/{id}")
	public String editLang(@Valid @ModelAttribute("languages") Languages lang, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()){
			model.addAttribute("languages", this.langService.findLanguage(id));
			return "edit.jsp";
		}
		this.langService.updateLanguage(lang);
		return "redirect:/view/{id}";
}
	@DeleteMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		return "redirect:/";
	}
}