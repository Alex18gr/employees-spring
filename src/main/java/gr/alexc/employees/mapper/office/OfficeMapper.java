package gr.alexc.employees.mapper.office;

import gr.alexc.employees.dto.office.OfficeDTO;
import gr.alexc.employees.entity.office.Office;
import gr.alexc.employees.mapper.employee.EmployeeMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OfficeAddressMapper.class, EmployeeMapper.class})
public interface OfficeMapper {

    OfficeDTO officeToOfficeDto(Office office);

}
