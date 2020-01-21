package com.robomq.day2assgn;

public class Book {
	private int id;
	private String name;
	private  String author;
	private String publisher;
	private int quantity;
	
public Book() {}

public Book(int id,String name,String author,String publisher,int quantity) {
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
	
	public int getid() {
	    return id;

	}
	public void setid(int id) {
	    this.id=id;

	}
	public String getauthor() {
	    return author;
	}
	public void setauthor(String author) {
	    this.author=author;
	}
	public int getquantity() {
	    return quantity;

	}
	public void setquantity(int quantity) {
	    this.quantity=quantity;

	}
	public String getpublisher() {
	    return publisher;
	}
	public void setpublisher(String publisher) {
	    this.publisher=publisher;
	}
	public String getname() {
	    return name;
	}
	public void setname(String name) {
	    this.name=name;
	}

	public String toString() {
	    return "\n Member id :: " +id+" author name ::  " +author+" Quantity::"+quantity+" Publisher name :::  " +publisher+" Member name:::"+name+"";

	}

	} 
