package ac.za.winston.service.user;

import ac.za.winston.domain.user.Employee;
import ac.za.winston.service.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
