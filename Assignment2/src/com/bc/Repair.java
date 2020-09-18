package com.bc;

public class Repair extends ProductInfo{
	private double PartsCost;
	private double LaborCost;
	
	public Repair(String code, String label, double partsCost, double laborCost) {
		super(code, label);
		PartsCost = partsCost;
		LaborCost = laborCost;
	}
	
	public Repair() {
		super();
	}

	public double getPartsCost() {
		return PartsCost;
	}
	public void setPartsCost(double partsCost) {
		PartsCost = partsCost;
	}
	public double getLaborCost() {
		return LaborCost;
	}
	public void setLaborCost(double laborCost) {
		LaborCost = laborCost;
	}
	
	public String getType() {
		return "Repair";
	}
	
}
