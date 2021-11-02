package com.ncm.roster.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncm.roster.models.Contact;
import com.ncm.roster.models.Student;
import com.ncm.roster.services.ContactService;
import com.ncm.roster.services.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService sService;
	@Autowired
	private ContactService cService;
	
//	public HomeController(StudentService sService, ContactService cService) {
//		this.sService = sService;
//		this.cService = cService;
	
	
	@GetMapping("/")
	public String newStudent(@ModelAttribute("students") Student student) {
		return "student.jsp";
	}
	
	@PostMapping("/student")
	public String createStudent(@ModelAttribute("students") Student student) {
		this.sService.createStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/contact")
	public String newContact(@ModelAttribute("contacts") Contact contact, Model model) {
		model.addAttribute("students", sService.allStudents());
		return "contact.jsp";
	}
	
	@PostMapping("/contact/create")
	public String createContact(@ModelAttribute("contacts") Contact contact) {
		this.cService.createContact(contact);
		return "redirect:/show";
	}
	
	@GetMapping("/show")
	public String showStudents(Model model) {
		List<Student> allStudents = this.sService.allStudents();
		model.addAttribute("allStudents", allStudents);
		return "all.jsp";
	}

}
