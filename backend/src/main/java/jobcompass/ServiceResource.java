package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.model.Service;
import jobcompass.service.ServiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/service") @Transactional
public class ServiceResource {
    private final ServiceService serviceService;

    public ServiceResource(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Service>> getAllServices() {
        List<Service> services = serviceService.findAllServices();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/find/{serviceId}")
    public ResponseEntity<Service> getServiceByServiceId(@PathVariable("serviceId") Long serviceId) {
        Service service = serviceService.findServiceByServiceId(serviceId);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Service> addService(@RequestBody Service service) {
        Service newService = serviceService.addService(service);
        return new ResponseEntity<>(newService, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Service> updateService(@RequestBody Service service) {
        Service updatedService = serviceService.updateService(service);
        return new ResponseEntity<>(updatedService, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{serviceId}")
    public ResponseEntity<?> deleteService(@PathVariable("serviceId") Long serviceId) {
        serviceService.deleteService(serviceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
