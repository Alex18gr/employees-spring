package gr.alexc.employees.entity.employee;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Employee employee;

}
