package com.bc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
	public static List<String> readLines(File data) {
		List<String> Lines = new ArrayList<String>();

		Scanner s = null;
		try {
			s = new Scanner(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (s.hasNextLine()) {
			Lines.add(s.nextLine());
		}
		s.close();

		Lines.remove(0);

		return Lines;
	}

	public static List<Customer> getCustomers(File data) {
		List<String> Lines = readLines(data);
		List<Customer> allC = new ArrayList<Customer>();

		for (String L : Lines) {
			String[] tokens = L.split(";");
			String code = tokens[0];
			String type = tokens[1];
			String name = tokens[2];
			String contactCode = tokens[3];

			String[] address = tokens[4].split(",");
			String street = address[0];
			String city = address[1];
			String state = address[2];
			String zip = address[3];
			String country = address[4];

			Customer c;
			Address a;
			a = new Address(street, city, state, zip, country);

			if (type == "P") {
				c = new Personal(code, name, contactCode, a);
			} else {
				c = new Business(code, name, contactCode, a);
			}

			allC.add(c);
		}

		return allC;
	}

	public static List<Persons> getPersons(File data) {
		List<String> Lines = readLines(data);
		List<Persons> allP = new ArrayList<Persons>();

		for (String L : Lines) {
			String[] tokens = L.split(";");
			String code = tokens[0];

			String[] name = tokens[1].split(",");
			String lastName = name[0];
			String firstName = name[1];

			String[] address = tokens[2].split(",");
			String street = address[0];
			String city = address[1];
			String state = address[2];
			String zip = address[3];
			String country = address[4];

			List<String> emails = new ArrayList<String>();
			if (tokens.length > 3) {
				String[] email = tokens[3].split(",");
				for (String e : email) {
					emails.add(e);
				}
			}
			Address a;
			a = new Address(street, city, state, zip, country);
			
			Persons p = new Persons(code, firstName, lastName, emails, a);
			allP.add(p);
		}

		return allP;
	}

	public static List<ProductInfo> getProductInfo(File data) {
		List<String> Lines = readLines(data);
		List<ProductInfo> allP = new ArrayList<ProductInfo>();

		for (String L : Lines) {
			String[] tokens = L.split(";");
			String code = tokens[0];
			String type = tokens[1];
			String label = tokens[2];

			ProductInfo p;

			if (type == "R") {
				double dailyCost = Double.parseDouble(tokens[3]);
				double deposit = Double.parseDouble(tokens[4]);
				double cleaningFee = Double.parseDouble(tokens[5]);
				p = new Rental(code, label, dailyCost, deposit, cleaningFee);
			} else if (type == "F") {
				double partsCost = Double.parseDouble(tokens[3]);
				double laborCost = Double.parseDouble(tokens[4]);
				p = new Repair(code, label, partsCost, laborCost);

			} else if (type == "C") {
				double unitCost = Double.parseDouble(tokens[3]);
				p = new Concession(code, label, unitCost);
			} else {
				double costPerMile = Double.parseDouble(tokens[3]);
				p = new Concession(code, label, costPerMile);
			}

			allP.add(p);
		}

		return allP;
	}

}
