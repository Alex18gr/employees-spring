package gr.alexc.employees.service;

import gr.alexc.employees.dto.office.OfficeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OfficeService {

    Page<OfficeDTO> getOffices(Pageable pageable);
}
