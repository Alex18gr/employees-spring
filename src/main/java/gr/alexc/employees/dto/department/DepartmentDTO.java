package gr.alexc.employees.dto.department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDTO {
    private Long id;
    private String code;
    private String name;
    private String description;
}
