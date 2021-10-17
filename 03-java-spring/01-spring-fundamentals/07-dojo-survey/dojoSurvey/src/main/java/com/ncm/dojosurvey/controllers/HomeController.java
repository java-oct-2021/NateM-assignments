package com.ncm.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
		@RequestMapping("/")
		public String index() {
			return "index.jsp";
		}
		
		@RequestMapping(path="/dashboard", method=RequestMethod.POST)
		public String success(@RequestParam("name") String name,
				@RequestParam("location") String location,
				@RequestParam("favLanguage") String favLanguage,
				@RequestParam("comment") String comment,
				Model userModel,
				HttpSession session) {
			userModel.addAttribute("name", name);
			userModel.addAttribute("location", location);
			userModel.addAttribute("favLanguage", favLanguage);
			userModel.addAttribute("comment", comment);
			session.setAttribute("name", name);
			return "dashboard.jsp";
			}
		
		{
			
		}	
}