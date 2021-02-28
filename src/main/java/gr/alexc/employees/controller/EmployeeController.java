package gr.alexc.employees.controller;

import gr.alexc.employees.dto.EmployeeDTO;
import gr.alexc.employees.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "")
    public Page<EmployeeDTO> getEmployees(Pageable pageable) {
        return this.employeeService.getEmployees(pageable);
    }

}
