package gr.alexc.employees.enums;

import lombok.Getter;

@Getter
public enum EmployeePhoneLineType {
    LANDLINE("LANDLINE"),
    MOBILE("MOBILE");

    private final String lineType;

    EmployeePhoneLineType(String lineType) {
        this.lineType = lineType;
    }

}
