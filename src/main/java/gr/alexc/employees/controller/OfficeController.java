package gr.alexc.employees.controller;

import gr.alexc.employees.dto.OfficeDTO;
import gr.alexc.employees.service.OfficeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "offices")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    public Page<OfficeDTO> getOffices(Pageable pageable) {
        return this.officeService.getOffices(pageable);
    }

}
