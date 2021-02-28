package gr.alexc.employees.dto;

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
}
