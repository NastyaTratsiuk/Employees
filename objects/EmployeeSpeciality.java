package objects;

public enum EmployeeSpeciality {
    Engeneer("engenner"),
    Manager("manager");

    private final String specialityName;

    EmployeeSpeciality(String specialityName) {
        this.specialityName = specialityName;
    }

    public String getSpecialityName() {
        return specialityName;
    }
}
