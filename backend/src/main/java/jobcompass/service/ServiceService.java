package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.ServiceNotFoundException;
import jobcompass.model.Service;
import jobcompass.repo.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@Table(name="service", schema = "public")
public class ServiceService {
    private final ServiceRepo serviceRepo;

    @Autowired
    public ServiceService(ServiceRepo serviceRepo) {
        this.serviceRepo = serviceRepo;
    }

    public Service addService(Service service) {
        return serviceRepo.save(service);
    }

    public List<Service> findAllServices() {
        return serviceRepo.findAll();
    }

    public Service updateService(Service service) {
        return serviceRepo.save(service);
    }

    public Service findServiceById(Long id) throws ServiceNotFoundException {
        return serviceRepo.findServiceById(id)
                .orElseThrow(() -> new ServiceNotFoundException("Nincs " + id + " azonosíójú szolgáltatás!"));
    }

    public void deleteService(Long id) {
        serviceRepo.deleteServiceById(id);
    }
}
