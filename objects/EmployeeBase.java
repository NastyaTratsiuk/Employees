package objects;

import java.io.Serializable;
import java.util.List;

public class EmployeeBase implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Employee> employees;


    public EmployeeBase() {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeBase{");
        sb.append("employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }
}
