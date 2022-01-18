package com.javatpoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class AddressDetails {

	@Column(name = "homeno")
	private int homeno;
	@Column(name = "streename")
	private String streename;
	@Column(name = "statename")
	private String statename;
	@Column(name = "pincode")
	private int pincode;

	public int getHomeno() {
		return homeno;
	}

	public void setHomeno(int homeno) {
		this.homeno = homeno;
	}

	public String getStreename() {
		return streename;
	}

	public void setStreename(String streename) {
		this.streename = streename;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDetails [homeno=" + homeno + ", streename=" + streename + ", statename=" + statename
				+ ", pincode=" + pincode + "]";
	}

}
