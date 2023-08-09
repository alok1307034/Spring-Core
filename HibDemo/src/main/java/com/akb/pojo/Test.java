package com.akb.pojo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;



public class Test {

	public static void main(String[] args) throws IOException {
		
		Bucket b = new Bucket();
//		b.setBid(1);
//		b.setBdate(new Date());
//		
//		Bname n = new Bname("Tiger","Kumar");
//		b.setBname(n);
//		b.setBsize(25);
//		b.setX(10);
//		
//		FileInputStream fis = new FileInputStream("C:\\Users\\Alok\\Desktop\\Old\\Mvc_Flow.jpg");
//		byte[] by = new byte[fis.available()];
//		fis.read(by);
//		b.setImg(by);
//		
		Configuration con = new Configuration().configure("hibernate.cfg.xml"); //mapping addAnnotatedClass(Bucket.class)
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
/*		Criteria c = session.createCriteria(Bucket.class);
		c.add(Restrictions.eq("bname.fname","Dog"));
		List<Bucket> bucket_list =c.list();
		bucket_list.forEach(a -> System.out.println(a.getBid()));		*/
		
/*		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Bucket> cq = cb.createQuery(Bucket.class);
		Root<Bucket> root = cq.from(Bucket.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		List<Bucket> list = query.getResultList();	
		list.forEach(a -> System.out.println(a.getBdate()));	
		list.forEach(a -> System.out.println(a.getBname()));	*/
		
/*		Bucket b1 = session.get(Bucket.class, 2);
		System.out.println("b1 Fetching completed");
		System.out.println(b1.getBname());						*/
		
/*		Bucket b4= session.load(Bucket.class, 1);
		System.out.println("b4 Loading complete");
		System.out.println(b4.getBname());						*/
		
/*		Bucket b2 = session.get(Bucket.class, 2);
		System.out.println(" b2 Fetching completed");
		System.out.println(b2.getBname());						
		
//		session.save(b);
//		b.setBsize(100);
		
		tx.commit();
		session.close();
		
		Session ses2 = sf.openSession();
		Transaction tx2 = ses2.beginTransaction();
		Bucket b3 = ses2.get(Bucket.class, 2);
		System.out.println("b3 Fetching completed");
		System.out.println(b3.getBname());
		tx2.commit();
		ses2.close();											*/
		
		String query = "FROM Bucket ";//as b WHERE b.bid=:X
		Query<Bucket> q = session.createQuery(query, Bucket.class);
//		q.setParameter("X", 1);									
		
/*		String query = "SELECT * FROM BUCKET_TABLE";
		Query q = session.createNativeQuery(query);				*/
		
/*		List<Bucket> list = q.getResultList();
		for (Bucket buc : list) {
			System.out.println(buc.getBname());
		}														*/
		
		int end =1;
		while(end<=2) {
			q.setFirstResult(end-1);
			q.setMaxResults(end);			
			List<Bucket> list2 = q.getResultList();
			list2.forEach(a -> System.out.println(a.getBname()+" "+a.getBid()));
			end=end+1;
		}
		tx.commit();
		session.close();
		sf.close();
	}

}
