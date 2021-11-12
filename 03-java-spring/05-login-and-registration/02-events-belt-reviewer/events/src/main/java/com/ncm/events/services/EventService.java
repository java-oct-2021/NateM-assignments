package com.ncm.events.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.events.models.Event;
import com.ncm.events.repositories.EventRepository;

@Service
public class EventService {

		@Autowired
		private EventRepository eventRepo;
		
		
		//List events
		public List<Event> allEvents(){
			return this.eventRepo.findAll();
		}
		//create an event
		public Event createEvent(Event event) {
			System.out.println("A fun new event!");
			return eventRepo.save(event);
		}
		//get one event
		public Event getEvent(Long id) {
			return this.eventRepo.findById(id).orElse(null);
		}
		//edit event
		public Event editEvent(Long id, String eventName, String location, Date date ) {
			Event event = getEvent(id);
			event.setEventName(eventName);
			event.setLocation(location);
			event.setDate(date);
			return eventRepo.save(event);
		}
		//delete event
		public void deleteEvent(Long id) {
			eventRepo.deleteById(id);
		}
	
}
