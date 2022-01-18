package com.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpid(4);
		emp.setEmpname("chaitu");
		emp.setEmpsalary("10000");
		


		AddressDetails a1 = new AddressDetails();
		a1.setStreename("hebbal");
		a1.setStatename("KA");
		a1.setPincode(66666);
		
		AddressDetails a2 = new AddressDetails();
		a2.setStreename("krpuram");
		a2.setStatename("KA");
		a2.setPincode(555555);
		
		emp.getAddressDetails().add(a1);
		emp.getAddressDetails().add(a2);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();

		session.save(emp);
		Transaction t = session.beginTransaction();
		t.commit();
	}

}
