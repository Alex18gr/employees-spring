package gr.alexc.employees.mapper;

import gr.alexc.employees.dto.OfficeDTO;
import gr.alexc.employees.dto.OfficeDetailsDTO;
import gr.alexc.employees.entity.Office;

import java.util.stream.Collectors;

public class OfficeMapper {

    public static OfficeDTO officeToOfficeDto(Office office) {
        OfficeDTO officeDTO = new OfficeDTO();
        officeDTO.setId(office.getId());
        officeDTO.setName(office.getName());
        officeDTO.setLocation(office.getLocation());
        return officeDTO;
    }

    public static OfficeDetailsDTO officeToOfficeDetailsDto(Office office) {
        OfficeDetailsDTO officeDetailsDTO = new OfficeDetailsDTO();
        officeDetailsDTO.setId(office.getId());
        officeDetailsDTO.setLocation(office.getLocation());
        officeDetailsDTO.setName(office.getName());
        officeDetailsDTO.setEmployees(office.getEmployees().stream().map(EmployeeMapper::employeeToEmployeeDto).collect(Collectors.toSet()));
        return officeDetailsDTO;
    }

}
