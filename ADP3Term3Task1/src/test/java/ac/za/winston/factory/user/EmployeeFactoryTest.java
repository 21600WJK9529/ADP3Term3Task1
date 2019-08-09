package ac.za.winston.factory.user;

import ac.za.winston.domain.user.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee employee;
    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.buildEmployee("TestEmpNo"
                ,"TestFirstName"
                ,"TestSurname"
                , "TestGender"
                ,"TestRace");
    }

    @Test
    public void buildEmployee() {
        assertNotNull(employee);
        System.out.println(employee);
    }
}
