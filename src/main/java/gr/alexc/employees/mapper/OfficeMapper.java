package gr.alexc.employees.mapper;

import gr.alexc.employees.dto.OfficeDTO;
import gr.alexc.employees.dto.OfficeDetailsDTO;
import gr.alexc.employees.entity.office.Office;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfficeMapper {

    OfficeDTO officeToOfficeDto(Office office);

    OfficeDetailsDTO officeToOfficeDetailsDto(Office office);

}
