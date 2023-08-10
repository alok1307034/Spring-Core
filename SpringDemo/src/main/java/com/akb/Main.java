package com.akb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Doctor doc = context.getBean(Doctor.class);
		doc.assist();
		doc.setQualification("MBBS");
		System.out.println(doc);
		
		Doctor doc2 = context.getBean(Doctor.class);
		System.out.println(doc2); 
	}
}
