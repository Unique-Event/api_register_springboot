package com.unique.events.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unique.events.register.domain.Participant;
import com.unique.events.register.repository.DAOParticipant;
import com.unique.events.register.repository.DAOVersion;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ParticipantController {
		
	    @Autowired
		DAOParticipant daoParticipant;
		
	    @Autowired
		DAOVersion daoVersion;
		
		
	    @RequestMapping(value = "/participants", method = RequestMethod.GET)
	    public List<Participant> Get() {
	        return daoParticipant.findAll();
	    }
	    
		/*
		@GetMapping("/participants")
		public ResponseEntity<List<Participant>> getAllParticipants(@RequestParam(required = false) String firstName, String lastName) {
			try {
				List<Participant> participants = new ArrayList<Participant>();
	
				if (firstName == null)
					daoParticipant.findAll().forEach(participants::add);
				else
					daoParticipant.findByFirstContaining(firstName, lastName).forEach(participants::add);
	
				if (participants.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
	
				return new ResponseEntity<>(participants, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
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
		@PostMapping("/participants")
		public ResponseEntity<Participant> createParticipant(@RequestBody Participant participant) {
			try {
				Participant participant_ = daoParticipant
						.save(new Participant(null, participant.getFirstName(), participant.getLastName(), participant.getCompanyName(), participant.getJob(), participant.getPhone(),participant.getEmail(), participant.getPassword()));
				return new ResponseEntity<>(participant_, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
	

}
