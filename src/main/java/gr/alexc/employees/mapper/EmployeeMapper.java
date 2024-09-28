package gr.alexc.employees.mapper;

import gr.alexc.employees.dto.EmployeeDTO;
import gr.alexc.employees.dto.csv.EmployeeCsvDto;
import gr.alexc.employees.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO employeeToEmployeeDto(Employee employee);

    EmployeeCsvDto employeeToEmployeeCsvDto(Employee employee);

}
