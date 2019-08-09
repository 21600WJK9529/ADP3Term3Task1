package ac.za.winston.repository.user;

import ac.za.winston.domain.user.Employee;
import ac.za.winston.repository.IRepository;

import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
