package gr.alexc.employees.dto.csv;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCsvDto {

    @CsvBindByPosition(position = 0, format = "%-4.4s")
    private Long id;

    @CsvBindByPosition(position = 1, format = "%-25.25s")
    private String name;

    @CsvBindByPosition(position = 2, format = "%-25.25s")
    private String surname;

    @CsvBindByPosition(position = 3, format = "%-30.30s")
    private String personalEmail;

    @CsvBindByPosition(position = 4, format = "%-30.30s")
    private String companyEmail;

    @CsvBindByPosition(position = 5, format = "%15.15s")
    private String personalPhoneMobile;

    @CsvBindByPosition(position = 6, format = "%15.15s")
    private String personalPhoneLandline;

    @CsvBindByPosition(position = 7, format = "%15.15s")
    private String companyPhoneMobile;

    @CsvBindByPosition(position = 8, format = "%15.15s")
    private String companyPhoneLandline;
}
