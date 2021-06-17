package com.springcore.sterio;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("obj")//to change variable name
@Scope("prototype")
public class Sterio {
	@Value("Aditya")
	private String name;
	@Value("Noida")
	private String city;
	@Value("#{temp}")
	private List<String> addresss;
	public List<String> getAddresss() {
		return addresss;
	}
	public void setAddresss(List<String> addresss) {
		this.addresss = addresss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Sterio [name=" + name + ", city=" + city + "]";
	}
	
}
