package com.unique.events.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unique.events.register.domain.Desktop;
import com.unique.events.register.domain.VR;
import com.unique.events.register.repository.DAODesktop;
import com.unique.events.register.repository.DAOVR;

@RestController
@RequestMapping("/version")
public class VersionController {

	@Autowired
	private DAODesktop daoDesktop;

	@Autowired
	private DAOVR daoVR;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/desktop", method = RequestMethod.GET)
	public List<Desktop> GetDesktop() {
		return daoDesktop.findAll();
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/desktop", method = RequestMethod.POST, produces = "application/json")
	public Desktop Post(@Validated @RequestBody Desktop desktop) {
		return daoDesktop.save(desktop);
	}
	

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/vr", method = RequestMethod.GET)
	public List<VR> GetVr() {
		return daoVR.findAll();
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/vr", method = RequestMethod.POST, produces = "application/json")
	public VR Post(@Validated @RequestBody VR vr) {
		return daoVR.save(vr);
	}

}
