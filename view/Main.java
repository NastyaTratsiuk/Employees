package view;

import objects.EmployeeBase;
import objects.EmployeeSpeciality;
import objects.MaritalStatus;
import service.EmployeeService;
import service.FileService;

import java.util.Scanner;

public class Main {

    public static EmployeeBase employeeBase;

    public static void main(String[] args) {

        employeeBase = FileService.getEmployeeBase();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hello user!");
            System.out.println("Select an option:");
            System.out.println("1- View the list of employees.");
            System.out.println("2- Delete employee.");
            System.out.println("3- Add employee.");
            System.out.println("4- Exit");

            switch (scanner.nextInt()) {
                case 1: {
                    EmployeeService.printEmployees(employeeBase);
                    break;
                }
                case 2: {
                    deleteEmployee();
                    break;
                }
                case 3: {
                    addEmployee();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Typo!");
            }
        }
    }

    public static void deleteEmployee() {
        System.out.println("Input name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Input surname");
        String surname = scanner.next();
        EmployeeService.deleteEmployee(name, surname, employeeBase);
    }

    public static void addEmployee() {
        System.out.println("Input name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Input surname");
        String surname = scanner.next();
        System.out.println("Input speciality (Engeneer, Manager) ");
        String employeeSpeciality1 = scanner.next();
        EmployeeSpeciality employeeSpeciality = EmployeeSpeciality.valueOf(employeeSpeciality1);
        System.out.println("Input position");
        String position = scanner.next();
        System.out.println("Input age");
        int age = scanner.nextInt();
        System.out.println("Input mariyal status ( Married, NotMarried, Divorced");
        String mariyalStatus1 = scanner.next();
        MaritalStatus maritalStatus = MaritalStatus.valueOf(mariyalStatus1);
        System.out.println("Input current experience");
        float current_experience = scanner.nextFloat();
        EmployeeService.registerUser(name, surname, employeeSpeciality, position, age, maritalStatus,
                current_experience, employeeBase);
    }

}




