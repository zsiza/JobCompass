package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.ServiceException;
import jobcompass.model.Service;
import jobcompass.service.ServiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController @RequestMapping("/service") @Transactional
public class ServiceResource {
    private final ServiceService serviceService;
    private final Random random = new Random();

    public ServiceResource(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Service>> getAllServices() {
        List<Service> services = serviceService.findAllServices();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Service> getServiceByServiceId(@PathVariable("id") Long id) {
        Service service = serviceService.findServiceById(id);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addService(@RequestBody Service service) {
        if (service.getTitle() == null || service.getDescription() == null || service.getPrice() == 0 || service.getDeliveryTime() == null || service.getCategoryId() == null) {
            return new ResponseEntity<>(new ServiceException("Nem adtál meg minden paramétert!"), HttpStatus.BAD_REQUEST);
        }
        service.setSellerId(random.nextLong());
        Service newService = serviceService.addService(service);
        return new ResponseEntity<>(newService, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Service> updateService(@RequestBody Service service) {
        Service updatedService = serviceService.updateService(service);
        return new ResponseEntity<>(updatedService, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteService(@PathVariable("id") Long id) {
        serviceService.deleteService(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
