package com.bc;

public class Towing extends ProductInfo{
	private double CostPerMile;

	public Towing() {
		super();
	}

	public Towing(String code, String label, double costPerMile) {
		super(code, label);
		CostPerMile = costPerMile;
	}

	public double getCostPerMile() {
		return CostPerMile;
	}

	public void setCostPerMile(double costPerMile) {
		CostPerMile = costPerMile;
	}
	
	public String getType() {
		return "Towing";
	}
	
}
