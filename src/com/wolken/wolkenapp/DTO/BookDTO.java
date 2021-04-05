package com.wolken.wolkenapp.DTO;



public class BookDTO{
	private int bookid;
	private  String name;
	
	private String publisher;
	private String edition;
	private String author;
	private int price;
	private String type;
	
	
	public BookDTO(){
		System.out.println(this.getClass().getSimpleName()+"object has created");
		
	}
	
	
	public BookDTO(int bookid, String name, String publisher, String edition, String author, int price, String type) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.publisher = publisher;
		this.edition = edition;
		this.author = author;
		this.price = price;
		this.type = type;
		toString();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return this.getAuthor()+" "+this.getBookid()+" "+this.getBookid()+" "+this.getPublisher();
		
	}
	

}
