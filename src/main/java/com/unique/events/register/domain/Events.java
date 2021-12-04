package com.unique.events.register.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_events;

	@Column(name = "CompanyEvent", length = 40, nullable = false)
	private String company_event;
    
	/*
	@OneToMany(targetEntity=Participant.class, fetch=FetchType.LAZY)
    @JoinColumn(name="fk_participant")
	private List<Participant> participant = new ArrayList<>();
    */
	public Events() {
		super();
	}

	public Events(Integer id_events, String company_event) {
		super();
		this.id_events = id_events;
		this.company_event = company_event;
	}

	public int getId_events() {
		return id_events;
	}

	public void setId_events(Integer id_events) {
		this.id_events = id_events;
	}

	public String getCompany_event() {
		return company_event;
	}

	public void setCompany_event(String company_event) {
		this.company_event = company_event;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_events);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Events) {
			Events other = (Events) obj;
			return this.company_event.equals(other.company_event) && this.id_events == other.id_events;
		}

		return false;
	}

	
}
