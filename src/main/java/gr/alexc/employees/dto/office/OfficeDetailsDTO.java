package gr.alexc.employees.dto.office;

import gr.alexc.employees.dto.employee.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class OfficeDetailsDTO {
    private Long id;
    private String name;
    private String location;
    private Set<EmployeeDTO> employees;
    private OfficeAddressDTO address;
}
