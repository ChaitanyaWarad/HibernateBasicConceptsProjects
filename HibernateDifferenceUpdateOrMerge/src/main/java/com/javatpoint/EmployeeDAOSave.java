package com.javatpoint;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOSave {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpname("chaitu");
		emp.setEmpsalary("10000");

		Employee emp1 = new Employee();
		emp1.setEmpname("pramod");
		emp1.setEmpsalary("10000");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		session.save(emp);
		session.save(emp1);
		Transaction t = session.beginTransaction();
		t.commit();
	}

}
