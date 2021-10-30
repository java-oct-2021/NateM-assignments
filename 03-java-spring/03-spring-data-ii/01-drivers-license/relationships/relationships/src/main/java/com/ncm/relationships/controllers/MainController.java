package com.ncm.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncm.relationships.models.License;
import com.ncm.relationships.models.Person;
import com.ncm.relationships.services.LicenseService;
import com.ncm.relationships.services.PersonService;

@Controller
public class MainController {
	@Autowired
	private final PersonService personService;
	@Autowired
	private final LicenseService licenseService;
	
	public MainController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	//Person info
	
	@GetMapping("/person")
	public String newPerson(@ModelAttribute("persons") Person person) {
		return "person.jsp";
	}
	
	@PostMapping("/person/new")
	public String addPerson(@Valid @ModelAttribute("persons") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "person.jsp";
		}
		else {
			this.personService.createPerson(person);
			return "redirect:/person";
		}
	}	
	//License info
		
	@GetMapping("/license")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", personService.allPersons());
		return "license.jsp";
	}
	
	@PostMapping("/license/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "license.jsp";
		}
		else {
			this.licenseService.createLicense(license);
			return "redirect:/license";
		}
	}
	//Show info of one
	@GetMapping("/info/{id}")
	public String showInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", personService.showPerson(id));
		return "info.jsp";
	}
	
}
