package manager.service;

import manager.model.Employee;
import manager.myinterface.ICrud;
import manager.myinterface.ISearch;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements ICrud<Employee>, ISearch<Employee> {

    static List<Employee> employeeList;

    public EmployeeService() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Lien", 23, "NamDinh"));
        employeeList.add(new Employee(2, "Hoang", 23, "ThaiBinh"));
        employeeList.add(new Employee(3, "Vu", 23, "HaNoi"));

    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void update(int index, Employee employee) {
        employeeList.set(index, employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        for (Employee e :
                employeeList) {
            if (e.getId() == id) {
                employee = e;
                break;
            }
        }
        return employee;
    }
}
