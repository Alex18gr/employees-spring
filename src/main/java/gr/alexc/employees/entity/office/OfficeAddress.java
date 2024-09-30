package gr.alexc.employees.entity.office;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OfficeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Office office;

}
