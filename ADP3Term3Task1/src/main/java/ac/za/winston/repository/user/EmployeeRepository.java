package ac.za.winston.repository.user;

import ac.za.winston.domain.user.Employee;

import java.util.*;

public class EmployeeRepository implements IEmployeeRepository{

    private static EmployeeRepository repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepository() {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepository();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        if(read(employee.getEmpNo())  == null){
            this.employees.put(employee.getEmpNo(),employee);
        }
        return employee;
    }

    @Override
    public Employee read(String s) {
        return this.employees.get(s);
    }

    @Override
    public Employee update(Employee employee) {
        if(read(employee.getEmpNo()) != null){
            employees.replace(employee.getEmpNo(), employee);
        }
        return employee;
    }

    @Override
    public void delete(String s) {
        Employee employee = read(s);
        this.employees.remove(s, employee);
    }
}

