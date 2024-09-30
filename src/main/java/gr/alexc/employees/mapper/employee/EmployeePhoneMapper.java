package gr.alexc.employees.mapper.employee;

import gr.alexc.employees.dto.employee.EmployeePhoneDTO;
import gr.alexc.employees.entity.employee.EmployeePhone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeePhoneMapper {
    EmployeePhoneDTO toEmployeePhoneDTO(EmployeePhone employeePhone);

    EmployeePhone toEmployeePhone(EmployeePhoneDTO employeePhoneDTO);
}
