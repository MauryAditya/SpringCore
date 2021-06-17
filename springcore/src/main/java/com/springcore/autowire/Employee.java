package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
//	@Autowired // property injection
//	@Qualifier("address2") //to refer namewise
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired  //setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired  //constructor injection
	public Employee(Address address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
