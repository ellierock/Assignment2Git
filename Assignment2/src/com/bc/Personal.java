package com.bc;

public class Personal extends Customer{
	
	public Personal() {
		super();
	}

	public Personal(String code, String name, String contactCode, Address address) {
		super(code, name, contactCode, address);
	}
	public String getType(){
		return "Personal";
	}
}
