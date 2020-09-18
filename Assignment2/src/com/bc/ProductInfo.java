package com.bc;

public class ProductInfo {
	protected String Code;
	protected String Label;
	
	public ProductInfo(String code, String label) {
		Code = code;
		Label = label;
	}
	
	public ProductInfo() {
	}

	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	
	
}
