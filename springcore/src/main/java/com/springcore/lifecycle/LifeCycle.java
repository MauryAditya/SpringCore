package com.springcore.lifecycle;

public class LifeCycle {
	private double price;

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set price");
		this.price = price;
	}
	public LifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LifeCycle [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init !");
	}
	public void destroy() {
		System.out.println("Inside destroy !");
	}
}
