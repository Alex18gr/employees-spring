package gr.alexc.employees.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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

    private String personalPhoneMobile;

    private String personalPhoneLandline;

    private String companyPhoneMobile;

    private String companyPhoneLandline;

    @ManyToOne
    private Office office;

}
