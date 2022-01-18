package com.javatpoint;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.FlushModeType;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOFlushModeAlways {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.setHibernateFlushMode(FlushMode.ALWAYS);
		session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpname("chaitu");
		emp.setEmpsalary("10000");

		session.save(emp);

		//session.getTransaction().commit();
		BigInteger k = (BigInteger) session.createNativeQuery("select count(*) from Employee").getSingleResult();
		System.out.println("Employee Count :" + k);
		 session.getTransaction().commit();
	}

}
