package com;
public class Employee {

	private Integer empNo;
	private String empName;
	private double salary;
	private Address address;
	
	public Employee(int empNo, String empName, double salary, Address address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return  empName 
				+ "\n\tID No.: " + empNo 
				+ "\n\tSalary: $" + salary 
				+ "\n\tAddress: " + address;
	}
	
}

