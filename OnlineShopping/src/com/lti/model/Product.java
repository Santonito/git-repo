package com.lti.model;

public class Product {

	int pdtId;
	String pdtName;
	double discount;
  int qty;
	double price;
	
	public double getDiscount() {
		return discount;
  }
  public void setDiscount(int discount) {
		this.discount = discount;
	}
  
	public int getPrice(){
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
  
	public int getQty(){
		return qty;
	}
  public void setQty(int qty){
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
