package com.springcore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		ApplicationContext con=	new ClassPathXmlApplicationContext(" com/springcore/sterio/sterioconfig.xml");
		// Sterio str=con.getBean("sterio" ,Sterio.class);
		Sterio str=con.getBean("obj" ,Sterio.class);
//		System.out.println(str);
//		System.out.println(str.getAddresss());
		System.out.println(str.hashCode());
		Sterio str1=con.getBean("obj" ,Sterio.class);
		System.out.println(str1.hashCode());
		
		
		Sterioxml str2=con.getBean("strr" ,Sterioxml.class);
		System.out.println(str2.hashCode());
		Sterioxml str3=con.getBean("strr" ,Sterioxml.class);
		System.out.println(str3.hashCode());

	}

}
