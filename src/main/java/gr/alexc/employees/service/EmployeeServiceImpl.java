package gr.alexc.employees.service;

import gr.alexc.employees.dto.EmployeeDTO;
import gr.alexc.employees.entity.Employee;
import gr.alexc.employees.mapper.EmployeeMapper;
import gr.alexc.employees.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public Page<EmployeeDTO> getEmployees(Pageable pageable) {
        return this.employeeRepository.findAll(pageable).map(employeeMapper::employeeToEmployeeDto);
    }


}
