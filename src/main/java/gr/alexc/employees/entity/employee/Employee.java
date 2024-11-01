package gr.alexc.employees.entity.employee;

import gr.alexc.employees.entity.Department;
import gr.alexc.employees.entity.office.Office;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "surname", nullable = false)
    private String surname;

    private String personalEmail;

    private String companyEmail;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeAddress address;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeePhone> phones;

    @ManyToOne
    private Office office;

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

}
