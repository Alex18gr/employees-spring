package gr.alexc.employees.mapper;

import gr.alexc.employees.dto.EmployeeDTO;
import gr.alexc.employees.dto.csv.EmployeeCsvDto;
import gr.alexc.employees.entity.Employee;

public class EmployeeMapper {

    public static Employee employeeDtoToEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setSurname(employeeDTO.getSurname());
        employee.setPersonalEmail(employeeDTO.getPersonalEmail());
        employee.setCompanyEmail(employeeDTO.getCompanyEmail());
        employee.setPersonalPhoneMobile(employeeDTO.getPersonalPhoneMobile());
        employee.setPersonalPhoneLandline(employeeDTO.getPersonalPhoneLandline());
        employee.setCompanyPhoneMobile(employeeDTO.getCompanyPhoneMobile());
        employee.setCompanyPhoneLandline(employeeDTO.getPersonalPhoneLandline());
        return employee;
    }

    public static EmployeeDTO employeeToEmployeeDto(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setSurname(employee.getSurname());
        employeeDTO.setPersonalEmail(employee.getPersonalEmail());
        employeeDTO.setCompanyEmail(employee.getCompanyEmail());
        employeeDTO.setPersonalPhoneMobile(employee.getPersonalPhoneMobile());
        employeeDTO.setPersonalPhoneLandline(employee.getPersonalPhoneLandline());
        employeeDTO.setCompanyPhoneMobile(employee.getCompanyPhoneMobile());
        employeeDTO.setCompanyPhoneLandline(employee.getPersonalPhoneLandline());
        return employeeDTO;
    }

    public static EmployeeCsvDto employeeToEmployeeCsvDto(Employee employee) {
        EmployeeCsvDto employeeCsvDTO = new EmployeeCsvDto();
        employeeCsvDTO.setId(employee.getId());
        employeeCsvDTO.setName(employee.getName());
        employeeCsvDTO.setSurname(employee.getSurname());
        employeeCsvDTO.setPersonalEmail(employee.getPersonalEmail());
        employeeCsvDTO.setCompanyEmail(employee.getCompanyEmail());
        employeeCsvDTO.setPersonalPhoneMobile(employee.getPersonalPhoneMobile());
        employeeCsvDTO.setPersonalPhoneLandline(employee.getPersonalPhoneLandline());
        employeeCsvDTO.setCompanyPhoneMobile(employee.getCompanyPhoneMobile());
        employeeCsvDTO.setCompanyPhoneLandline(employee.getPersonalPhoneLandline());
        return employeeCsvDTO;
    }

}
