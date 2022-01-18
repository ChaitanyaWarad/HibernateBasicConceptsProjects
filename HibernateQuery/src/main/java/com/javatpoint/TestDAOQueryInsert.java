package com.javatpoint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDAOQueryInsert {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("insert into Vehicle(vehicleId,vehicleName)");
		query.setParameter("vehicleId", 2);
		@SuppressWarnings("deprecation")
		int result = query.executeUpdate();
		System.out.println(result);
	}

}
