package com.unique.events.register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_vr;
	@Column
	private String regulation;

	public VR() {
		super();
	}

	public VR(Integer id_vr, String regulation) {
		super();
		this.id_vr = id_vr;
		this.regulation = regulation;
	}

	public Integer getId_vr() {
		return id_vr;
	}

	public void setId_vr(Integer id_vr) {
		this.id_vr = id_vr;
	}

	public String getRegulation() {
		return regulation;
	}

	public void setRegulation(String regulation) {
		this.regulation = regulation;
	}
	
}
