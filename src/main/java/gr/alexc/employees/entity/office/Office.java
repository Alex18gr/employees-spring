package gr.alexc.employees.entity.office;

import gr.alexc.employees.entity.employee.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    @OneToMany(mappedBy="office")
    private Set<Employee> employees;

    @OneToOne(cascade = CascadeType.ALL)
    private OfficeAddress address;

}
