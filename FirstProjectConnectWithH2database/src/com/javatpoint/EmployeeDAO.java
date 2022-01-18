package com.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Chaitu");
		emp.setSalary("10");

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		SessionFactory sf = config.buildSessionFactory();
		Session sess = sf.openSession();
		sess.save(emp);
		Transaction tx = sess.beginTransaction();
		tx.commit();

	}

}
