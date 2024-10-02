package gr.alexc.employees.util;

import gr.alexc.employees.dto.csv.EmployeeCsvDto;
import gr.alexc.employees.entity.employee.Employee;
import gr.alexc.employees.entity.employee.EmployeePhone;
import gr.alexc.employees.enums.EmployeePhoneLineType;
import gr.alexc.employees.enums.EmployeePhoneType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CsvUtils {

    public static List<EmployeeCsvDto> employeeListToEmployeeCsvDtoList(List<Employee> employees) {
        List<EmployeeCsvDto> employeeCsvDtoList = new ArrayList<>();
        for (Employee employee : employees) {
            EmployeeCsvDto employeeCsvDto = new EmployeeCsvDto();
            employeeCsvDto.setId(employee.getId());
            employeeCsvDto.setName(employee.getName());
            employeeCsvDto.setSurname(employee.getSurname());
            employeeCsvDto.setPersonalEmail(employee.getPersonalEmail());
            employeeCsvDto.setCompanyEmail(employee.getCompanyEmail());

            employee.getPhones().forEach(employeePhone -> {
                if (employeePhone.getType().equals(EmployeePhoneType.COMPANY)) {
                    if (employeePhone.getLineType().equals(EmployeePhoneLineType.LANDLINE)) {
                        employeeCsvDto.setCompanyPhoneLandline(employeePhone.getPhone());
                    } else if (employeePhone.getLineType().equals(EmployeePhoneLineType.MOBILE)) {
                        employeeCsvDto.setCompanyPhoneMobile(employeePhone.getPhone());
                    }
                } else if (employeePhone.getType().equals(EmployeePhoneType.PERSONAL)) {
                    if (employeePhone.getLineType().equals(EmployeePhoneLineType.LANDLINE)) {
                        employeeCsvDto.setPersonalPhoneLandline(employeePhone.getPhone());
                    } else if (employeePhone.getLineType().equals(EmployeePhoneLineType.MOBILE)) {
                        employeeCsvDto.setPersonalPhoneMobile(employeePhone.getPhone());
                    }
                }
            });

            employeeCsvDtoList.add(employeeCsvDto);
        }

        return employeeCsvDtoList;
    }

}
