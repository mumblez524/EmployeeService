import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Employee;
import com.Address;
import com.EmployeeService;
import com.EmployeeServiceImpl;
import com.UseEmployee;

public class TestEmployeeServiceImpl {
	
	private EmployeeServiceImpl esi;
	
	private Employee e = new Employee(1,"Jade",3.0, new Address("the","place"));
	
	@BeforeEach
	void initEmployeeList() {
		esi = new EmployeeServiceImpl();
	}
	
	@Test
	void testDisplayAllEmployees() {
		esi.addEmployee(e);
	
	}
	
	@Test
	void testCalculateYearlySalary(Employee e1) {
		
	}

}
