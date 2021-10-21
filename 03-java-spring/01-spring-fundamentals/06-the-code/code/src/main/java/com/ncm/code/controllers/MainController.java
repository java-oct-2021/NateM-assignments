package com.ncm.code.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/codeInput")
	public String code(@RequestParam(value="input")String input){
		if(input.equals("bushido")) {
			return "code.jsp";
		}  else {
			return "redirect:/errors";
		}
	}
	
	@GetMapping("/errors")
	public String errors(RedirectAttributes redAtt) {
		redAtt.addFlashAttribute("error", "You must try harder!");
		return "redirect:/";
	}
	
	
	
}