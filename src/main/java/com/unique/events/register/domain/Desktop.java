package com.unique.events.register.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desktop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_desktop;

	public Desktop() {
		super();
	}

	public Desktop(Integer id_desktop) {
		super();
		this.id_desktop = id_desktop;
	}

	public Integer getId_desktop() {
		return id_desktop;
	}

	public void setId_desktop(Integer id_desktop) {
		this.id_desktop = id_desktop;
	}

}
