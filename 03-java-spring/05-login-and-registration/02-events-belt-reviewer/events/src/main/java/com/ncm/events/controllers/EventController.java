package com.ncm.events.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncm.events.models.Event;
import com.ncm.events.models.User;
import com.ncm.events.services.EventService;
import com.ncm.events.services.UserService;

@Controller
public class EventController {
		
	@Autowired
	private EventService eventService;
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/events")
	public String Events(Model model, HttpSession session) {
		if(session.getAttribute("userId") != null) {
			List<Event> events = this.eventService.allEvents();
			User user = userService.getUser((Long) session.getAttribute("userId"));
			model.addAttribute("events", events);
			model.addAttribute("user", user);
			return "events.jsp";
		}
		return "redirect:/";
	}
	
	//New
	@GetMapping("/events/new")
	public String newEvent(@ModelAttribute("newEvent") Event event) {
		return "newEvent.jsp";
	}
	//create event
	@PostMapping("/events/create")
	public String create(@Valid @ModelAttribute("newEvent") Event event, BindingResult result) {
		if(result.hasErrors()) {
			return "newEvent.jsp";
		} else {
			Event newEvent = eventService.createEvent(event);
			return "redirect:/events";
		}
	}
	
	//get one event details
	@GetMapping("/events/event/{id}")
	public String event(@PathVariable("id") Long eventId, Model model, HttpSession session) {
		Event event = eventService.getEvent(eventId);
		model.addAttribute("event", event);
		model.addAttribute("userLoggedIn", (Long)session.getAttribute("userId"));
		return "event.jsp";
	}
	
	//Delete event
	@GetMapping("/events/delete/{id}")
	public String deleteEvent(@PathVariable("id") Long id) {
		eventService.deleteEvent(id);
		return "redirect:/events";
	}
	
	//View edit event
	@GetMapping("/events/edit/{id}")
	public String editEvent(@PathVariable("id") Long id, @ModelAttribute("editedEvent") Event event, Model model, HttpSession session) {
		Event editEvent = eventService.getEvent(id);
		model.addAttribute("editEvent", editEvent);
		return "editEvents.jsp";
	}
	//Edit event
	@PostMapping("/events/edit/{id}")
	public String updateEvent(@PathVariable("id") Long id, @Valid @ModelAttribute("editedEvent") Event event, BindingResult result, Model model) {
		if(result.hasErrors()) {
			Event editEvent = eventService.getEvent(id);
			model.addAttribute("editEvent", editEvent);
			return "editEvent.jsp";
		} else {
			Event newEvent = eventService.editEvent(id, event.getEventName(), event.getLocation(), event.getDate());
			return "redirect:/events";
		}
	}
}
