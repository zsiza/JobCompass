package jobcompass.repo;

import jobcompass.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepo extends JpaRepository<Service, Long> {

    Optional<Service> findServiceByServiceId(Long serviceId);

    void deleteServiceByServiceId(Long serviceId);
}
