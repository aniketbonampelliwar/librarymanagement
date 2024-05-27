package com.techdenovo.apps.librarymanagement.model;

public class Book {
	private int bookId;
	private String iBSN;
	private String bookName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String iBSN, String bookName) {
		super();
		this.bookId = bookId;
		this.iBSN = iBSN;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getiBSN() {
		return iBSN;
	}
	public void setiBSN(String iBSN) {
		this.iBSN = iBSN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	

}
