package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/ref/lifecycleconfig.xml");
	A temt=(A)context.getBean("aref");
	System.out.println(temt.getX());
	System.out.println(temt.getOb().getY());
	System.out.println(temt);

	}

}
