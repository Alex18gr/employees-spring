package gr.alexc.employees.dto.office;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeDTO {
    private Long id;
    private String name;
    private String location;
    private OfficeAddressDTO address;
}
