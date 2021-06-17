package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		Employee emp=context.getBean("emp1",Employee.class);//**not need of type casting
		//Employee awt=(Employee)context.getBean("emp1"); //**need of type casting
		System.out.println(emp);
	}

}
