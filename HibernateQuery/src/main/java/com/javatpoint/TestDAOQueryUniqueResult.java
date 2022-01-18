package com.javatpoint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDAOQueryUniqueResult {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Vehicle v where v.vehicleId =2 ");
		@SuppressWarnings("deprecation")
		Vehicle v = (Vehicle) query.uniqueResult();
		System.out.println(v);
	}

}
