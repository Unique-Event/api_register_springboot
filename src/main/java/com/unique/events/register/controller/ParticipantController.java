package com.unique.events.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unique.events.register.domain.Participant;
import com.unique.events.register.repository.DAOParticipant;

@RestController
public class ParticipantController {
		
	    @Autowired
		DAOParticipant daoParticipant;
	
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(value = "/participants", method = RequestMethod.GET)
	    public List<Participant> Get() {
	        return daoParticipant.findAll();
	    }
	    
		/*
		@GetMapping("/participants/{id}")
		public ResponseEntity<Participant> getParticipantById(@PathVariable("id") Integer id) {
			Optional<Participant> participantData = daoParticipant.findById(id);
	
			if (participantData.isPresent()) {
				return new ResponseEntity<>(participantData.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
        */
	    
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(value = "/participants", method =  RequestMethod.POST, produces = "application/json")
	    public Participant Post(@Validated @RequestBody Participant participant) {
    	        return daoParticipant.save(participant);
	    }
	

}
