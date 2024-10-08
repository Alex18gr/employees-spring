package gr.alexc.employees.dto.employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeAddressDTO {
    private Long id;
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
}
