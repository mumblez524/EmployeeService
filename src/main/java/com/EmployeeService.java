package com;
public interface EmployeeService {

	void displayAllEmployees();
	
	double calculateYearlySalary(Employee e1);
	
	Employee findByEmployeeNo(int empNo);
	
	void updateEmployee(Employee e1);
	
	void deleteEmployee(Employee e);
}
