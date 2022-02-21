package service;

import objects.EmployeeBase;

import java.io.*;

public class FileService {

    private static final File file = new File("employees.txt");

    public static void updateEmployeeBase(EmployeeBase employeeBase) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeBase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EmployeeBase getEmployeeBase() {
        EmployeeBase employeeBase = new EmployeeBase();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employeeBase = (EmployeeBase) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employeeBase;
    }

}
