package com.unique.events.register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_address;
	@Column(name = "streetName", length = 20, nullable = false)
	private String streetName;
	@Column(name = "country", length = 20, nullable = false)
	private String country;
	@Column(name = "number", length = 15, nullable = false)
	private String number;
	@Column(name = "zipCode", length = 15, nullable = false)
	private int zipCode;
	@Column(name = "municipality", length = 20, nullable = false)
	private String municipality;

	public Address() {
		super();
	}

	public Address(long id_address, String streetName, String country, String number, int zipCode,
			String municipality) {
		super();
		this.id_address = id_address;
		this.streetName = streetName;
		this.country = country;
		this.number = number;
		this.zipCode = zipCode;
		this.municipality = municipality;
	}

	public long getId_address() {
		return id_address;
	}

	public void setId_address(long id_address) {
		this.id_address = id_address;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	
	

}
