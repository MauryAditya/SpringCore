package com.springcore.withoutxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	
//@ComponentScan(basePackages = "com.springcore.withoutxmlconfig")
public class javaconfig {
	
	@Bean
	public Book getBook() {
		//Book bk=new Book();
		//return bk;
		return new  Book();
	}
	
	@Bean //@Bean(name={"student", "toget"}) // to get with name
	public Student getStudent() {
		Student st=new Student(getBook());
		return st;
	}

}
