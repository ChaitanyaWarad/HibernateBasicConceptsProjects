package com.javatpoint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDAOQueryList {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Vehicle");
		@SuppressWarnings("deprecation")
		List results = query.list();
		System.out.println(results);
	}

}
