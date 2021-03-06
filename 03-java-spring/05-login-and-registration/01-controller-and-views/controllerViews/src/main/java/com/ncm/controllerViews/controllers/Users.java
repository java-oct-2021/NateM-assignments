package com.ncm.controllerViews.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ncm.controllerViews.models.User;
import com.ncm.controllerViews.services.UserService;
import com.ncm.controllerViews.validators.UserValidator;

@Controller
public class Users {
	
	@Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
    	userValidator.validate(user, result);
    	if(result.hasErrors()) {
    		return "loginPage.jsp";
    	}
    	// else, save the user in the database, save the user id in session, and redirect them to the /home route
    	else {
    		User newUser = userService.registerUser(user);
    		session.setAttribute("userId", newUser.getId());
    		return "redirect:/home";
    	}
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
        // if the user is authenticated, save their user id in session
    	if(userService.authenticateUser(email, password)) {
    		User user = userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
    		return "redirect:/home";
    	}
        // else, add error messages and return the login page
    	else {
    		model.addAttribute("error", "Incorrect email/password combination!");
    		return "loginPage.jsp";
    	//::::For flash error - include RedirectAttribute function, and code as follow:::::::
    	// redirectAttributes.addFlashAttribute("error", "Invaild Email/Pass!!!");
   		// return "redirect:/";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	Long userId = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(userId);
    	model.addAttribute("user", u);
    	return "homePage.jsp";
    	
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
        // redirect to login page
    		return "redirect:/login";
    }
}