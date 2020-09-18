package com.bc;

import java.io.File;
import java.util.List;


public class DataConverter {

	public static void main(String[] args) {
		//Create file objects for each input file
		File cust = new File("data/Customers.dat");
		File pers = new File("data/Persons.dat");
		File prod = new File("data/Products.dat");
		
		//Parse data from files
		List<Customer> customers = FileReader.getCustomers(cust);
		List<Persons> persons = FileReader.getPersons(pers);
		List<ProductInfo> products = FileReader.getProductInfo(prod);

	}

}
