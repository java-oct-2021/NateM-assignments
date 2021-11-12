package com.ncm.events.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ncm.events.models.User;
import com.ncm.events.services.UserService;
import com.ncm.events.validators.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	
	
	@GetMapping("/")
	public String login(@ModelAttribute("user") User user) {
		return "login.jsp";
	}
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "login.jsp";
		} else {
			User newUser = userService.registerUser(user);
			session.setAttribute("userId", newUser.getId());
			return "redirect:/events";
		}
	}
		
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirAtt) {
		if(userService.authenticateUser(email, password)) {
			User user = userService.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/events";
			}
		else {
			redirAtt.addFlashAttribute("error", "Invald email/password combination");
			return "redirect:/";
		}
	}
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/";
	}
}


