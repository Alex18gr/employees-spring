package gr.alexc.employees.service;

import gr.alexc.employees.dto.OfficeDTO;
import gr.alexc.employees.mapper.OfficeMapper;
import gr.alexc.employees.repository.OfficeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OfficeServiceImpl implements OfficeService {

    private final OfficeRepository officeRepository;

    public OfficeServiceImpl(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }

    @Override
    public Page<OfficeDTO> getOffices(Pageable pageable) {
        return this.officeRepository.findAll(pageable).map((OfficeMapper::officeToOfficeDto));
    }
}
