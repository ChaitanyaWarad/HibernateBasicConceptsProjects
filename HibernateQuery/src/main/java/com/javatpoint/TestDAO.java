package com.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDAO {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Benz");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("honda");

		User user = new User();
		user.setUserName("Chaitu");
		user.getVehicles().add(vehicle1);
		user.getVehicles().add(vehicle2);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(user);
		
		t.commit();

	}

}
