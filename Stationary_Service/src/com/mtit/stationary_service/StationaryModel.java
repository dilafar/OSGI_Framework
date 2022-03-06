package com.mtit.stationary_service;

public class StationaryModel {
	
	private String name;
	private int qty;
	private double subtotal;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setSubTotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getSubTotal() {
		return this.subtotal;
	}
	

}
