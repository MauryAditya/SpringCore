package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Employee emp=context.getBean("emp",Employee.class);//**no need of type casting
	//	AutoTest awt=(AutoTest)context.getBean("emp"); //**need of type casting
		System.out.println(emp);
	}

}
