package gr.alexc.employees.mapper.office;

import gr.alexc.employees.dto.office.OfficeAddressDTO;
import gr.alexc.employees.entity.office.OfficeAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfficeAddressMapper {

    OfficeAddressDTO toOfficeAddressDTO(OfficeAddress officeAddress);

}
