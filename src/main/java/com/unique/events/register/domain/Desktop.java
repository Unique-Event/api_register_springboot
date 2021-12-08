package com.unique.events.register.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desktop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_desktop;

	public Desktop() {
		super();
	}

	public Desktop(long id_desktop) {
		super();
		this.id_desktop = id_desktop;
	}

	public long getId_desktop() {
		return id_desktop;
	}

	public void setId_desktop(long id_desktop) {
		this.id_desktop = id_desktop;
	}

}
