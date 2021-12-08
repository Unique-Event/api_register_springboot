package com.unique.events.register.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idParticipant;

	@Column(name = "FirstName", length = 15, nullable = false)
	private String firstName;
	@Column(name = "LastName", length = 15, nullable = false)
	private String lastName;
	@Column(name = "CompanyName", length = 20, nullable = false)
	private String companyName;
	@Column(name = "Job", length = 25, nullable = false)
	private String job;
	@Column(name = "Email", length = 30, nullable = false)
	private String email;
	@Column(name = "Phone", length = 15, nullable = false)
	private String phone;
	@Column(name = "Password", length = 20, nullable = false)
	private String password;

	public Participant() {
		super();
	}

	public Participant(Integer idParticipant, String firstName, String lastName, String companyName, String job,
			String email, String phone, String password) {
		super();
		this.idParticipant = idParticipant;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.job = job;
		this.email = email;
		this.phone = phone;
		this.password = password;

	}

	public long getIdParticipant() {
		return idParticipant;
	}

	public void setId_participant(Integer idParticipant) {
		this.idParticipant = idParticipant;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(companyName, email, firstName, idParticipant, job, lastName, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Participant) {
			Participant other = (Participant) obj;
			return Objects.equals(companyName, other.companyName) && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName)
					&& Objects.equals(idParticipant, other.idParticipant) && Objects.equals(job, other.job)
					&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
					&& Objects.equals(phone, other.phone);
		}
		return false;
	}
	

}
