package com.bc;

import java.util.List;

public class Persons{
	private String Code;
	private String FirstName;
	private String LastName;
	private List<String> Email;
	private Address address;
	
	public Persons() {
		super();
		}
	
	public Persons(String code, String firstName, String lastName, List<String> email, Address address) {
		Code = code;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.setAddress(address);
	}

	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public List<String> getEmail() {
		return Email;
	}
	public void setEmail(List<String> email) {
		Email = email;
	}
	
	public String getType() {
		return "Person";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
