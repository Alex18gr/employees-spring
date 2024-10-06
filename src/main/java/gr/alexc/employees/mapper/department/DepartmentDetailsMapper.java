package gr.alexc.employees.mapper.department;

import gr.alexc.employees.dto.department.DepartmentDetailsDTO;
import gr.alexc.employees.entity.Department;
import gr.alexc.employees.mapper.employee.EmployeeMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface DepartmentDetailsMapper {
    DepartmentDetailsDTO toDepartmentDetailsDTO(Department department);
}
