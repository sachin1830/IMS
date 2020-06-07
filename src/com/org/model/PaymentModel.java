package com.org.model;

public class PaymentModel {
	private String year;
	private int regno;
	private int amount;
	private int returnamount;
	private int returnperyearamount;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getReturnamount() {
		return returnamount;
	}
	public void setReturnamount(int returnamount) {
		this.returnamount = returnamount;
	}
	public int getReturnperyearamount() {
		return returnperyearamount;
	}
	public void setReturnperyearamount(int returnperyearamount) {
		this.returnperyearamount = returnperyearamount;
	}
	
}
