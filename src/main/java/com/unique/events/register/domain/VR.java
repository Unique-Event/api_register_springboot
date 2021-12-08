package com.unique.events.register.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_vr;
	@Column(name = "regulation", length = 250)
	private String regulation;

	@OneToOne(targetEntity = Address.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_address_id")
	private List<Address> addresss = new ArrayList<>();

	public VR() {
		super();
	}

	public VR(long id_vr, String regulation, List<Address> addresss) {
		super();
		this.id_vr = id_vr;
		this.regulation = regulation;
		this.addresss = addresss;
	}

	public long getId_vr() {
		return id_vr;
	}

	public void setId_vr(long id_vr) {
		this.id_vr = id_vr;
	}

	public String getRegulation() {
		return regulation;
	}

	public void setRegulation(String regulation) {
		this.regulation = regulation;
	}

	public List<Address> getAddresss() {
		return addresss;
	}

	public void setAddresss(List<Address> addresss) {
		this.addresss = addresss;
	}

	
}
