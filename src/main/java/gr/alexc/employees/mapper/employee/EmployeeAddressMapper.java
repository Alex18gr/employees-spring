package gr.alexc.employees.mapper.employee;

import gr.alexc.employees.dto.employee.EmployeeAddressDTO;
import gr.alexc.employees.entity.employee.EmployeeAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeAddressMapper {

    EmployeeAddressDTO toEmployeeAddressDTO(EmployeeAddress employeeAddress);

    EmployeeAddress fromEmployeeAddressDTO(EmployeeAddressDTO employeeAddressDTO);
}
