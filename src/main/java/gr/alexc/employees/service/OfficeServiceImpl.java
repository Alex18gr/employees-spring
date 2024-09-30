package gr.alexc.employees.service;

import gr.alexc.employees.dto.office.OfficeDTO;
import gr.alexc.employees.mapper.office.OfficeMapper;
import gr.alexc.employees.repository.OfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OfficeServiceImpl implements OfficeService {

    private final OfficeRepository officeRepository;
    private final OfficeMapper officeMapper;

    @Override
    public Page<OfficeDTO> getOffices(Pageable pageable) {
        return this.officeRepository.findAll(pageable).map((officeMapper::officeToOfficeDto));
    }
}
