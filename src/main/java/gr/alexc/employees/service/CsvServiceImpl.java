package gr.alexc.employees.service;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import gr.alexc.employees.dto.csv.EmployeeCsvDto;
import gr.alexc.employees.entity.employee.Employee;
import gr.alexc.employees.repository.EmployeeRepository;
import gr.alexc.employees.util.CsvUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CsvServiceImpl implements CsvService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void writeEmployeesToCsv(OutputStream outputStream) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {

        List<Employee> employeeList = employeeRepository.findAll();

        List<EmployeeCsvDto> employeeCsvDtos = CsvUtils.employeeListToEmployeeCsvDtoList(employeeList);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        StatefulBeanToCsv<EmployeeCsvDto> statefulBeanToCsv = new StatefulBeanToCsvBuilder<EmployeeCsvDto>(outputStreamWriter)
                .withApplyQuotesToAll(true)
                .withSeparator(';')
                .withLineEnd("," + System.lineSeparator())
                .build();

        statefulBeanToCsv.write(employeeCsvDtos);

        outputStreamWriter.close();

        outputStream.close();

    }
}
