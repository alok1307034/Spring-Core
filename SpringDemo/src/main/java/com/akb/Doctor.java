package com.akb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
public class Doctor implements Staff,BeanNameAware{
	
	private String qualification;

	public void assist() {
		System.out.println("Doctor is assisting");
		
	}
	
	public void setQualification(String qualification) {
		this.qualification=qualification;
	}
	
	public String getQualification() {
		return qualification;
	}
	
	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	public void setBeanName(String name) {
		System.out.println("setBeanName method of Doctor class is called");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("post contruct is called");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre-Destroy method is called");
	}
	
/*	public Doctor(String qualification) {
		this.qualification=qualification;
	}*/

}
