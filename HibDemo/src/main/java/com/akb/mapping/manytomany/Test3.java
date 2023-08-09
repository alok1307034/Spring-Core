package com.akb.mapping.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test3 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setPname("Laptop");
		
		Product p2 = new Product();
		p2.setPname("Watch");
		
		List<Product> pList= Arrays.asList(p1,p2);
		
		Customer c1 = new Customer();
		c1.setCname("Alok");
		c1.setProductList(pList);
		
		Customer c2 = new Customer();
		c2.setCname("Gautam");
		c2.setProductList(pList);
		
		List<Customer> cList =Arrays.asList(c1,c2);
		
		p1.setCustomerList(cList);
		p2.setCustomerList(cList);
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(c1);
/*		session.save(c2);
		session.save(p1);
		session.save(p2);	*/
		
		tx.commit();
		session.close();
		sf.close();
	}

}
