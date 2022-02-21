package objects;

import java.io.Serializable;
import java.util.UUID;

public class Employee implements Serializable {

    private UUID id;
    private String name;
    private String surname;
    private EmployeeSpeciality employeeSpeciality;
    private String position;
    private int age;
    private MaritalStatus maritalStatus;
    private float current_experience;


    public Employee(String name, String surname, EmployeeSpeciality employeeSpeciality, String position, int age, MaritalStatus maritalStatus, float current_experience) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.employeeSpeciality = employeeSpeciality;
        this.position = position;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.current_experience = current_experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public EmployeeSpeciality getEmployeeSpeciality() {
        return employeeSpeciality;
    }

    public void setEmployeeSpeciality(EmployeeSpeciality employeeSpeciality) {
        this.employeeSpeciality = employeeSpeciality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public float getCurrent_experience() {
        return current_experience;
    }

    public void setCurrent_experience(float current_experience) {
        this.current_experience = current_experience;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", employeeSpeciality=").append(employeeSpeciality);
        sb.append(", position='").append(position).append('\'');
        sb.append(", age=").append(age);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", current_experience=").append(current_experience);
        sb.append('}');
        return sb.toString();
    }
}
