package gr.alexc.employees.entity.employee;

import gr.alexc.employees.enums.EmployeePhoneLineType;
import gr.alexc.employees.enums.EmployeePhoneType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeePhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;

    private String prefix;
    private String phone;
    private EmployeePhoneType type;
    private EmployeePhoneLineType lineType;

}


