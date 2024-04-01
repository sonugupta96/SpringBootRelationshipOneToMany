package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address_dtls")
public class Address {

	@Id
	private Integer addressId;
	private String streat;
	private String city;
	private String country;
	
	
	@ManyToOne
	private Student student;
	
	public Address(Integer addressId, String streat, String city, String country) {
		super();
		this.addressId = addressId;
		this.streat = streat;
		this.city = city;
		this.country = country;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreat() {
		return streat;
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	
	
	
}
