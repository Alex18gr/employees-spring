package gr.alexc.employees.enums;

import lombok.Getter;

@Getter
public enum EmployeePhoneType {
    PERSONAL("PERSONAL"),
    COMPANY("COMPANY");

    private final String type;

    EmployeePhoneType(String type) {
        this.type = type;
    }

}
