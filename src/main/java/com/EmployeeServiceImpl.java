package com;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

	private List<Employee> elist = new ArrayList<Employee>();

	@Override
	public void displayAllEmployees() { 
		elist.stream().forEach(y->System.out.println(y));
	}

	@Override
	public double calculateYearlySalary(Employee e1) {
		return e1.getSalary() * 12;
	}

	@Override
	public Employee findByEmployeeNo(int empNo) {
		return elist.stream().filter(e -> e.getEmpNo().equals(empNo)).findFirst().orElse(null);
	}	

	@Override
	public void updateEmployee(Employee e1) {
		for(Employee e : elist) {
			if(e.getEmpName() == e1.getEmpName()) {
				e.setEmpNo(e1.getEmpNo());
				e.setSalary(e1.getSalary());
				e.setAddress(e1.getAddress());
			}
		}
	}

	@Override
	public void deleteEmployee(Employee e) {
		elist.remove(e);
	}
	
	public  List<Employee> getEmployeeList() {
		return elist;
	}
	
	public void addEmployee(Employee e) {
		elist.add(new Employee(e.getEmpNo(), e.getEmpName(), e.getSalary(), e.getAddress()));
	}
	
}