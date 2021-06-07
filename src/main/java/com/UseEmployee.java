package com;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * 1. Create Maven Project
 * 2. Apply util Logs
 * 3. Write JUnit test cases
 * 4. Use Streams to display menu choices
 */

public class UseEmployee {

	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Create the EmployeeServiceImpl 
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		
		esi.addEmployee(new Employee(1, "Sean", 600.0, new Address("Clarksville", "Tennessee")));
		esi.addEmployee(new Employee(2, "Jake", 700.0, new Address("Durham", "North Carolina")));
		esi.addEmployee(new Employee(3, "Rachel", 650.0, new Address("Knoxville", "Tennessee")));
		esi.addEmployee(new Employee(4, "Sophia", 10.0, new Address("Seattle", "Washington")));
		
		int choice = 0;	
		int temp = 0;
		
		System.out.println("Welcome to EmployeeServices");
		
		do {
			// Create a menu for choice
			System.out.print("1. List all employees\n"
					+ "2. Employee Yearly Salary\n"
					+ "3. Employee Details\n"
					+ "4. Modify Employee Details\n"
					+ "5. Delete Employee\n"
					+ "6. Quit\n"
					+ "Choice: ");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:		//	1. List all employees
				esi.displayAllEmployees();
				System.out.println();
				break;
				
			case 2:		//	2. Display Yearly salary
				
				LOGGER.info("Logger Name: " + LOGGER.getName());
				LOGGER.warning("Can cause NullPointerException");
				
				try {
					System.out.println("Employee ID Number:");
					temp = scan.nextInt();
					Employee e = esi.findByEmployeeNo(temp);
					System.out.println(esi.findByEmployeeNo(temp).getEmpName() + " Yearly Salary: $" + esi.calculateYearlySalary(e) + "\n");
				} catch (NullPointerException e) {
					LOGGER.log(Level.SEVERE, "Exception occurred");
				}
				break;
				
			case 3:		//	3. Display specific employee details
				try {
					System.out.println("Employee ID Number:");
					temp = scan.nextInt();
					if(esi.findByEmployeeNo(temp) == null) {
						System.out.println("\nINVALID ID!!!\n");
					}
					else {
						System.out.println("\n" + esi.findByEmployeeNo(temp) + "\n");
					}
				} catch (NullPointerException e) {
					LOGGER.log(Level.SEVERE, "Exception occurred");
				}
				break;
				
			case 4:		//	4. Modify the employee details
				System.out.println("Sophia's address has changed\nUpdating Employee List...\n");
				esi.updateEmployee(new Employee(4, "Sophia", 12.0, new Address("With", "Parents")));
				System.out.println(esi.findByEmployeeNo(4) + "\n");
				break;
				
			case 5:		//	5. Delete an employee
				System.out.println("Sean got fired for sniffing glue...\nUpdating Employee List...\n");
				esi.deleteEmployee(esi.findByEmployeeNo(1));
				esi.displayAllEmployees();
				System.out.println();
				break;
				
			case 6:
				
				System.out.println("Goodbye!");
				break;
			}
		
		
		} while (choice != 6);
		
		scan.close();
	}
}