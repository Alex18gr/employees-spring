package gr.alexc.employees.enums;

public enum EmployeePhoneType {
    PERSONAL("PERSONAL"),
    COMPANY("COMPANY");

    private String type;

    EmployeePhoneType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
