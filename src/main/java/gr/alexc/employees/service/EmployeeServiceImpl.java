package gr.alexc.employees.service;

import gr.alexc.employees.dto.EmployeeDTO;
import gr.alexc.employees.entity.Employee;
import gr.alexc.employees.mapper.EmployeeMapper;
import gr.alexc.employees.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Page<EmployeeDTO> getEmployees(Pageable pageable) {
        return this.employeeRepository.findAll(pageable).map(EmployeeMapper::employeeToEmployeeDto);
    }


}
