package com.lti.model;

public class Product {

	int pdtId;
	String pdtName;
	int qty;
	
	public int getQty(){
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPdtId() {
		return pdtId;
	}
	public void setPdtId(int pdtId) {
		this.pdtId = pdtId;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	
}
