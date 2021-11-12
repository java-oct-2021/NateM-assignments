package com.ncm.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ncm.events.models.Event;
import com.ncm.events.models.User;

public interface EventRepository extends CrudRepository<Event, Long>{
	
	List<Event> findAll();
	List<Event> findAllEventsByUser(User user);
}
