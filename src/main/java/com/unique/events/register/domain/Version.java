package com.unique.events.register.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Version {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_version;

	@OneToOne(targetEntity = Desktop.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_version_desktop")
	private List<Desktop> desktop = new ArrayList<>();

	@OneToOne(targetEntity = VR.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_version_vr")
	private List<VR> vr = new ArrayList<>();

	public Version() {
		super();
	}

	public Version(long id_version, List<Desktop> desktop, List<VR> vr) {
		super();
		this.id_version = id_version;
		this.desktop = desktop;
		this.vr = vr;
	}

	public long getId_version() {
		return id_version;
	}

	public void setId_version(Integer id_version) {
		this.id_version = id_version;
	}

	public List<Desktop> getDesktop() {
		return desktop;
	}

	public void setDesktop(List<Desktop> desktop) {
		this.desktop = desktop;
	}

	public List<VR> getVr() {
		return vr;
	}

	public void setVr(List<VR> vr) {
		this.vr = vr;
	}

}
