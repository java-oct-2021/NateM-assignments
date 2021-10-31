package com.ncm.dojoNinja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncm.dojoNinja.models.Dojo;
import com.ncm.dojoNinja.models.Ninja;
import com.ncm.dojoNinja.services.DojoService;
import com.ncm.dojoNinja.services.NinjaService;

@Controller
public class DojoController {
	
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	//Create a dojo
	
	@GetMapping("/dojo")
	public String dojo(@ModelAttribute("dojos") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createDojo(@ModelAttribute("dojos") Dojo dojo) {
		this.dojoService.createDojo(dojo);
		return "redirect:/view/{id}";
	}
	
	@GetMapping("/view/{id}")
	public String allDojos(@PathVariable("id") Long id, Dojo dojo, Model model) {
		Dojo showDojo = this.dojoService.oneDojo(id);
		List<Ninja> showNinjas = this.ninjaService.allNinjas(showDojo);
		model.addAttribute("showNinjas", showNinjas);
		model.addAttribute("showDojo", showDojo);
		return "location.jsp";
	}

}
