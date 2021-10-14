package com.ncm.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		
		SimpleDateFormat dFormat = new SimpleDateFormat("EEE, 'the' dd 'of' MMMM, yyyy");
		String currentDate = dFormat.format(new Date());
		model.addAttribute("date", currentDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		
		SimpleDateFormat tFormat = new SimpleDateFormat("hh:mm aaa");
		String currentTime = tFormat.format(new Date());
		model.addAttribute("time", currentTime);
		return "time.jsp";
	}
}
