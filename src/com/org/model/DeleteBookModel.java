package com.org.model;

public class DeleteBookModel {
	private int bookid;
	private String password;
	private int librarianid;
	public int getLibrarianid() {
		return librarianid;
	}
	public void setLibrarianid(int librarianid) {
		this.librarianid = librarianid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
