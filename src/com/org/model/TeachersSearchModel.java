package com.org.model;

public class TeachersSearchModel {
	private String textentred;
	private int bookid;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauther() {
		return bookauther;
	}
	public void setBookauther(String bookauther) {
		this.bookauther = bookauther;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	private String bookname;
	private String bookauther;
	private String bookpublisher;

	public String getTextentred() {
		return textentred;
	}
	public void setTextentred(String textentred) {
		this.textentred = textentred;
	}

}
