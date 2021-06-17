package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext con=	new ClassPathXmlApplicationContext(" com/springcore/standalone/standaloneconfig.xml");
	Person p=con.getBean("person" ,Person.class);
	//System.out.println(p);
///	System.out.println(p.getFriends().getClass().getName());
	System.out.println("++++++++??+++++++++");
	System.out.println("my friends list "+p.getFriends());
	System.out.println("++++++++??+++++++++");
	System.out.println("Training fees "+p.getFees());
	System.out.println("++++++++??+++++++++");
	System.out.println("Book list "+p.getBook());
	System.out.println("++++++++??+++++++++");
	System.out.println("Properties "+p.getProps());
	}

}
