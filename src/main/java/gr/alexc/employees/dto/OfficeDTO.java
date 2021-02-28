package gr.alexc.employees.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class OfficeDTO {

    private Long id;
    private String name;
    private String location;
}
