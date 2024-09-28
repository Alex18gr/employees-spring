package gr.alexc.employees.controller;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import gr.alexc.employees.service.CsvService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("reports")
public class ReportsController {

    private final CsvService csvService;

    public ReportsController(CsvService csvService) {
        this.csvService = csvService;
    }

    @RequestMapping("sheet-report")
    public void getSimpleReport(@RequestParam String type, HttpServletResponse response) {

        if (type.equals("simple-csv")) {
            try {
                csvService.writeEmployeesToCsv(response.getOutputStream());
                response.setContentType("text/plain");
                response.setHeader("Content-disposition", "attachment; filename=" + "simple-csv.txt");
            } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
                e.printStackTrace();
            }
        }

    }

}
