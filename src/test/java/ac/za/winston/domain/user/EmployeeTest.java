package ac.za.winston.domain.user;

import ac.za.winston.factory.user.EmployeeFactory;
import ac.za.winston.repository.user.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employeeRepository = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee("TestEmpNo", "TestFirstName", "TestSurname", "TestGender", "TestRace");
    }

    @Test
    public void getEmpNo() {
        assertNotNull(employee.getEmpNo());
        System.out.println(employee.getEmpNo());
    }

    @Test
    public void getFirstName() {
        assertNotNull(employee.getFirstName());
        System.out.println(employee.getFirstName());
    }

    @Test
    public void getSurname() {
        assertNotNull(employee.getSurname());
        System.out.println(employee.getSurname());
    }

    @Test
    public void getGender() {
        assertNotNull(employee.getGender().getEmpNo());
        System.out.println(employee.getGender());
    }

    @Test
    public void getRace() {
        assertNotNull(employee.getRace().getEmpNo());
        System.out.println(employee.getRace());
    }
}
