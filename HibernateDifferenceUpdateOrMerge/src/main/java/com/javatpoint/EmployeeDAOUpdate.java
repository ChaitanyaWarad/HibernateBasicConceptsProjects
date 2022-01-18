package com.javatpoint;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();
		try {
			Session session = factory.openSession();
			session.get(Employee.class, 1);
		} catch (HibernateException e) {
			// TODO: handle exception
		}

	}

}
