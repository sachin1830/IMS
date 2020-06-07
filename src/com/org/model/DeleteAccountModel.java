package com.org.model;

public class DeleteAccountModel {
	private int regno;
	private int regnoaccountant;
	public int getRegnoaccountant() {
		return regnoaccountant;
	}
	public void setRegnoaccountant(int regnoaccountant) {
		this.regnoaccountant = regnoaccountant;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String pass;

}
