package objects;

public enum MaritalStatus {
    Married("Married"),
    NotMarried("Not married"),
    Divorced("divorced");

    private final String maritalStatusName;

    MaritalStatus(String maritalStatusName) {
        this.maritalStatusName = maritalStatusName;
    }

    public String getMaritalStatusName() {
        return maritalStatusName;
    }
}
