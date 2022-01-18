package com.javatpoint;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "empid")
	private int empid;
	@Column(name = "empname")
	private String empname;
	@Column(name = "empsalary")
	private String empsalary;
	@ElementCollection
	@JoinTable(name="employee_address" ,joinColumns = @JoinColumn(name="emp_id"))
	private Set<AddressDetails> addressDetails = new HashSet<AddressDetails>();

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}

	public Set<AddressDetails> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(Set<AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}

}
