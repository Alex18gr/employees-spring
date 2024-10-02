package gr.alexc.employees.mapper.employee;

import gr.alexc.employees.dto.employee.EmployeeDTO;
import gr.alexc.employees.dto.csv.EmployeeCsvDto;
import gr.alexc.employees.entity.employee.Employee;
import gr.alexc.employees.mapper.office.OfficeMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeePhoneMapper.class, EmployeeAddressMapper.class})
public interface EmployeeMapper {

    EmployeeDTO employeeToEmployeeDto(Employee employee);

}
