package gr.alexc.employees.mapper.department;

import gr.alexc.employees.dto.department.DepartmentDTO;
import gr.alexc.employees.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDTO departmentToDepartmentDTO(Department department);
}
