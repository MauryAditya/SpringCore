package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLife {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotationLife() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnnotationLife [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init !");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy !");
	}

}
