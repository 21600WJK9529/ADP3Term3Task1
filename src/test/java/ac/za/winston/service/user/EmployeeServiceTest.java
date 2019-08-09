package ac.za.winston.service.user;

import ac.za.winston.domain.user.Employee;
import ac.za.winston.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    EmployeeService service;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        service = EmployeeService.getService();
        employee = EmployeeFactory.buildEmployee("TestEmpNo"
                , "TestFirstName"
                , "TestSurname"
                , "TestGender"
                ,"TestRace");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(employee);
        assertNotNull(service.read("TestEmpNo"));
        System.out.println("Created\n" + service.read("TestEmpNo"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("TestEmpNo"));
        System.out.println("Read\n"+ service.read("TestEmpNo"));
    }

    @Test
    public void update() {
        service.create(employee);
        System.out.println(service.read("TestEmpNo"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee("TestEmpNoUp", "TestFirstNameUp", "TestSurnameUp", "TestGenderUp","TestRaceUp");
        service.update(employeeUpdated);
        Employee em = service.read("TestEmpNo");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Update\n"+service.read("TestEmpNo"));
    }

    @Test
    public void delete() {
        service.delete("TestEmpNo");
        assertNull(service.read(employee.getEmpNo()));
        System.out.println("Delete\n"+service.read(employee.getEmpNo()));
    }
}
