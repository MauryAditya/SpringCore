package com.springcore.withoutxmlconfig;

import org.springframework.stereotype.Component;

//@Component("mystudent")
public class Student {
	
	private Book book;
	
	public Student(Book book) {
		super();
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void study() {
		this.book.display();
		System.out.println("Ready to read");
	}

}
