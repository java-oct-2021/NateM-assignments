package com.ncm.dojoNinja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncm.dojoNinja.models.Ninja;
import com.ncm.dojoNinja.services.DojoService;
import com.ncm.dojoNinja.services.NinjaService;

@Controller
public class NinjaController {
	
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}
	
	//create a new ninja
	
	@GetMapping("/ninja")
	public String ninja(@ModelAttribute("ninjas") Ninja ninja) {
		return "ninja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@ModelAttribute("ninjas") Ninja ninja) {
		this.ninjaService.createNinja(ninja);
		return "redirect:/view";
	}
}
