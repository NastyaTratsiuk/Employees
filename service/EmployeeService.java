package service;

import objects.Employee;
import objects.EmployeeBase;
import objects.EmployeeSpeciality;
import objects.MaritalStatus;

import java.util.List;

public class EmployeeService {

    public static Employee registerUser(String name, String surname, EmployeeSpeciality employeeSpeciality, String position, int age,
                                        MaritalStatus maritalStatus, float current_experience, EmployeeBase employeeBase) {
        Employee employee = new Employee(name, surname, employeeSpeciality, position, age, maritalStatus, current_experience);
        return EmployeeBaseService.addEmployee(employee, employeeBase);
    }

    public static void printEmployees(EmployeeBase employeeBase) {
        for (int i = 0; i < employeeBase.getEmployees().size(); i++) {
            System.out.println("Number : " + i + " Employee: " + employeeBase.getEmployees().get(i).getName() + " "
                    + employeeBase.getEmployees().get(i).getSurname());
        }
    }

    public static List<Employee> deleteEmployee(String name, String surname, EmployeeBase employeeBase) {
        employeeBase.getEmployees().removeIf(employee -> employee.getSurname().equals(surname) &&
                employee.getName().equals(name));
        System.out.println("Employee deleted.");
        FileService.updateEmployeeBase(employeeBase);
        return employeeBase.getEmployees();
    }

}
