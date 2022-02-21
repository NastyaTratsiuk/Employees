package service;

import objects.Employee;
import objects.EmployeeBase;
import objects.EmployeeSpeciality;
import objects.MaritalStatus;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBaseService {

    public static Employee addEmployee(Employee employee, EmployeeBase employeeBase) {
         employeeBase.getEmployees().add(employee);
        FileService.updateEmployeeBase(employeeBase);
        return employee;
    }

    public static void updateUsers(EmployeeBase employeeBase) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "Ivanov", EmployeeSpeciality.Manager, "manager", 30,
                MaritalStatus.NotMarried, (float) 3.8));
        employees.add(new Employee("Petr", "Petrov", EmployeeSpeciality.Engeneer, "engeneer", 25,
                MaritalStatus.NotMarried, (float) 1.5));
        employeeBase.setEmployees(employees);
    }
}
