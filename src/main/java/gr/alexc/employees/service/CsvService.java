package gr.alexc.employees.service;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import gr.alexc.employees.entity.Employee;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public interface CsvService {

    void writeEmployeesToCsv(OutputStream outputStream) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException;

}
