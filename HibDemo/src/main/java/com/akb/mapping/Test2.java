package com.akb.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		
		Products p = new Products();
		p.setProductName("TV");
		
		Products p2 = new Products();
		p2.setProductName("phone");
		
		List<Products> list_products = Arrays.asList(p,p2);
		
		Orders o = new Orders();
		o.setCustomerName("Alok");
//		o.setProducts(p);					//@One to One
		
		o.setList(list_products);
		
		p.setOrders(o);
		p2.setOrders(o);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(o);
		session.save(p);
		session.save(p2);
		
		txn.commit();
		session.close();
		sf.close();

	}

}
