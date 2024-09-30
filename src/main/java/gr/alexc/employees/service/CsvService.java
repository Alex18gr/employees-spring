package gr.alexc.employees.service;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.OutputStream;

public interface CsvService {

    void writeEmployeesToCsv(OutputStream outputStream) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException;

}
