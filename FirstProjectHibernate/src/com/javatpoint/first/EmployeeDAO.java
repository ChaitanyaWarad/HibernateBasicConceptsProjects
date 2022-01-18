package com.javatpoint.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("chaitu");
		emp.setSalary("1000");

		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(Employee.class);

		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		se.save(emp);
		Transaction t = se.beginTransaction();
		t.commit();

	}

}
