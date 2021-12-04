package com.unique.events.register.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unique.events.register.domain.Events;
import com.unique.events.register.repository.DAOEvents;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class EventsController {

	@Autowired
	private DAOEvents daoEvents;

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public List<Events> Get() {
		return daoEvents.findAll();
	}

	@RequestMapping(value = "/events/{id_events}", method = RequestMethod.GET)
	public ResponseEntity<Events> GetById(@PathVariable(value = "id_events") Integer id_events) {
		Optional<Events> events = daoEvents.findById(id_events);
		if (events.isPresent())
			return new ResponseEntity<Events>(events.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/events", method = RequestMethod.POST)
	public Events Post(@Validated @RequestBody Events events) {
		return daoEvents.save(events);
	}

}
