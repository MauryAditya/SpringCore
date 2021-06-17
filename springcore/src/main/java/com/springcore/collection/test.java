package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp emp1=(Emp)context.getBean("emp1");
		 System.out.println( emp1.getName() );
		 System.out.println( emp1.getPhones() );
		 System.out.println( emp1.getAddress() );
		 System.out.println( emp1.getCourses() );
		 System.out.println( emp1.getProperties() );
		 
		 
	}

}
