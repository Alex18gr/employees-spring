package gr.alexc.employees.service;

import gr.alexc.employees.dto.employee.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Page<EmployeeDTO> getEmployees(Pageable pageable);

}
