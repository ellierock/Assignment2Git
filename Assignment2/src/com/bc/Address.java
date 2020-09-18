package com.bc;

public class Address {
	protected String Street;
	protected String City;
	protected String State;
	protected String Zip;
	protected String Country;
	
	public Address(String street, String city, String state, String zip, String country) {
		Street = street;
		City = city;
		State = state;
		Zip = zip;
		Country = country;
	}
	
	public Address() {
	}

	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
}
