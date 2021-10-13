package com.ncm.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@RestController
//public class MainController {
	
//	@RequestMapping("/")
//	public String index() {
//		return "Hello Human!";
//	}
	
//	@RequestMapping("/{fname}/{lname}")
//	public String showName(@PathVariable("fname") String showFirstName, @PathVariable("lname") String showLastName) {
//		return "Hello " + showFirstName + " " + showLastName;
//	}

	// Above results were successful, but used PathVariables, not RequestParam.

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name) {
		model.addAttribute("name", name);
		return "hello.jsp";
	}
}

