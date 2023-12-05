package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.model.Purchase;
import jobcompass.service.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController @RequestMapping("/purchase") @Transactional
public class PurchaseResource {
    private final PurchaseService purchaseService;

    public PurchaseResource(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAllPurchases() {
        List<Purchase> purchases = purchaseService.findAllPurchases();
        return ResponseEntity.ok(purchases);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Purchase> getPurchaseById(@PathVariable("id") Long id) {
        Purchase purchase = purchaseService.findPurchaseById(id);
        return new ResponseEntity<>(purchase, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Purchase> addPurchase(@RequestBody Purchase purchase) {
        purchase.setPurchaseTime(new Timestamp(new Date().getTime()));
        purchase.setStatus("Szolgáltatás kifizetve");
        Purchase newPurchase = purchaseService.addPurchase(purchase);
        return new ResponseEntity<>(newPurchase, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Purchase> updatePurchase(@RequestBody Purchase purchase) {
        Purchase updatedPurchase = purchaseService.updatePurchase(purchase);
        return new ResponseEntity<>(updatedPurchase, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePurchase(@PathVariable("id") Long id) {
        purchaseService.deletePurchase(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
