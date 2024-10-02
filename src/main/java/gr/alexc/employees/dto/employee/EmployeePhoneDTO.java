package gr.alexc.employees.dto.employee;

import gr.alexc.employees.enums.EmployeePhoneLineType;
import gr.alexc.employees.enums.EmployeePhoneType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePhoneDTO {
    private Long id;
    private String prefix;
    private String phone;
    private EmployeePhoneType type;
    private EmployeePhoneLineType lineType;
}
