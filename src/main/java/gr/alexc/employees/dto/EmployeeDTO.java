package gr.alexc.employees.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private Long id;
    private String name;
    private String surname;
    private String personalEmail;
    private String companyEmail;
    private String personalPhoneMobile;
    private String personalPhoneLandline;
    private String companyPhoneMobile;
    private String companyPhoneLandline;
}
