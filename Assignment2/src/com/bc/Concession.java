package com.bc;

public class Concession extends ProductInfo{
	private double UnitCost;
	
	public Concession() {
		super();
	}

	public Concession(String code, String label, double unitCost) {
		super(code, label);
		UnitCost = unitCost;
	}

	public double getUnitCost() {
		return UnitCost;
	}

	public void setUnitCost(double unitCost) {
		UnitCost = unitCost;
	}
	
	public String getType() {
		return "Concession";
	}
	
}
