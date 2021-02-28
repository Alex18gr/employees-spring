package gr.alexc.employees.controller;

import gr.alexc.employees.dto.OfficeDTO;
import gr.alexc.employees.service.OfficeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "offices")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @RequestMapping(value = "")
    public Page<OfficeDTO> getOffices(Pageable pageable) {
        return this.officeService.getOffices(pageable);
    }

}
