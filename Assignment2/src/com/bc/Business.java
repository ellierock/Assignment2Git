package com.bc;

public class Business extends Customer{
	
	public Business() {
		super();
	}

	public Business(String code, String name, String contactCode, Address address) {
		super(code, name, contactCode, address);
	}

	public String getType(){
		return "Business";
	}
}