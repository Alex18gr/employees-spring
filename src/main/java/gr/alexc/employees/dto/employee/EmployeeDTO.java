package gr.alexc.employees.dto.employee;

import gr.alexc.employees.dto.office.OfficeDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeDTO {
    private Long id;
    private String name;
    private String surname;
    private String personalEmail;
    private String companyEmail;
    private EmployeeAddressDTO address;
    private List<EmployeePhoneDTO> phones;
    private OfficeDTO office;
}
