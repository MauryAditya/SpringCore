package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();
//		LifeCycle life=(LifeCycle)context.getBean("s1");
//		System.out.println(life);
//	
//		System.out.println("++++++hello world+++++++!");
//		LifeCycle1 life2=(LifeCycle1)context.getBean("s2");
//		System.out.println(life2);
		
		AnnotationLife l=(AnnotationLife)context.getBean("s3");
		System.out.println(l);
		
	}

}
