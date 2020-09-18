package com.bc;

public class Customer{
	private String Code;
	private String Name;
	private String ContactCode;
	private Address address;
	
	
	public Customer() {
		super();
	}
	
	public Customer(String code, String name, String contactCode, Address address) {
		Code = code;
		Name = name;
		ContactCode = contactCode;
		this.address = address;
	}

	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getType() {
		return "Customer";
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactCode() {
		return ContactCode;
	}
	public void setContactCode(String contactCode) {
		ContactCode = contactCode;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
