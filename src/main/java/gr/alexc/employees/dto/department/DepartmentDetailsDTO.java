package gr.alexc.employees.dto.department;

import gr.alexc.employees.dto.employee.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class DepartmentDetailsDTO {
    private Long id;
    private String code;
    private String name;
    private String description;
    private Set<EmployeeDTO> employees;
}
