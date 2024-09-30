package gr.alexc.employees.dto.office;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeAddressDTO {
    private Long id;
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
}
