package gr.alexc.employees.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
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

    @Column(name = "personal_email")
    private String personalEmail;

    @Column(name = "company_email")
    private String companyEmail;

    @Column(name = "personal_phone_mobile")
    private String personalPhoneMobile;

    @Column(name = "personal_phone_landline")
    private String personalPhoneLandline;

    @Column(name = "company_phone_mobile")
    private String companyPhoneMobile;

    @Column(name = "company_phone_landline")
    private String companyPhoneLandline;

    @ManyToOne
    @JoinColumn(name="office_id", nullable=true)
    private Office office;

}
