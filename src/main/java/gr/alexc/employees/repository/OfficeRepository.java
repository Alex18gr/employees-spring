package gr.alexc.employees.repository;

import gr.alexc.employees.entity.office.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
