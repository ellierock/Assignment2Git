package com.bc;

public class Rental extends ProductInfo{
	private double DailyCost;
	private double Deposit;
	private double CleaningFee;
	
	
	
	public Rental() {
		super();
	}

	public Rental(String code, String label, double dailyCost, double deposit, double cleaningFee) {
		super(code, label);
		DailyCost = dailyCost;
		Deposit = deposit;
		CleaningFee = cleaningFee;
	}
	
	public double getDailyCost() {
		return DailyCost;
	}
	public void setDailyCost(double dailyCost) {
		DailyCost = dailyCost;
	}
	public double getDeposit() {
		return Deposit;
	}
	public void setDeposit(double deposit) {
		Deposit = deposit;
	}
	public double getCleaningFee() {
		return CleaningFee;
	}
	public void setCleaningFee(double cleaningFee) {
		CleaningFee = cleaningFee;
	}
	
	public String getType() {
		return "Rental";
	}
	
}
