package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{12+12}")
	private int x;
	
	@Value("#{19+10}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25)}")// call static method
	private double z;
	
	@Value("#{ T( java.lang.Math).PI}") //call ststic variable 	
	private double e;
	
	@Value("#{5<6}")
	private boolean isactive;
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Value("#{new java.lang.String('Aditya')}") //call object
	private String name;
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", isactive=" + isactive + ", name=" + name
				+ "]";
	}

	
	
	

}
