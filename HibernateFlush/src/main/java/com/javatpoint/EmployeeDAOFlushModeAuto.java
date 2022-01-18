package com.javatpoint;

import java.io.Serializable;
import java.math.BigInteger;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOFlushModeAuto {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpname("chaitu");
		emp.setEmpsalary("10000");

		session.save(emp);

		// session.getTransaction().commit();
		long b = (Long) session.createQuery("select count(*) from Employee").setHibernateFlushMode(FlushMode.AUTO)
				.getSingleResult();
		System.out.println("Employee count : " + b);
		session.getTransaction().commit();
	}

}
