
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.Employee;
import com.Address;
import com.EmployeeServiceImpl;

public class TestEmployeeServiceImpl {
	
	private EmployeeServiceImpl esi = new EmployeeServiceImpl();
	
	private Employee e = new Employee(1,"Sean",3.0, new Address("the","place"));
	
	@Test
	void testYearlySalary() {
		esi.addEmployee(e);
		double yearSalary = esi.calculateYearlySalary(e);
		assertEquals(36, yearSalary);
	}
	
	@Test
	void testFindByEmployeeNo() {
		esi.addEmployee(e);
		assertEquals(1, esi.findByEmployeeNo(1).getEmpNo());
		assertEquals("Sean", esi.findByEmployeeNo(1).getEmpName());
		assertEquals(3.0, esi.findByEmployeeNo(1).getSalary());
	}
	
}
