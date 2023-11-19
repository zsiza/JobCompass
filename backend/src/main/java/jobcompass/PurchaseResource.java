package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.PurchaseNotFoundException;
import jobcompass.model.Purchase;
import jobcompass.service.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/find/{purchaseId}")
    public ResponseEntity<Purchase> getPurchaseByPurchaseId(@PathVariable("purchaseId") Long purchaseId) {
        Purchase purchase = purchaseService.findPurchaseByPurchaseId(purchaseId);
        return new ResponseEntity<>(purchase, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Purchase> addPurchase(@RequestBody Purchase purchase) {
        Purchase newPurchase = purchaseService.addPurchase(purchase);
        return new ResponseEntity<>(newPurchase, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Purchase> updatePurchase(@RequestBody Purchase purchase) {
        Purchase updatedPurchase = purchaseService.updatePurchase(purchase);
        return new ResponseEntity<>(updatedPurchase, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{purchaseId}")
    public ResponseEntity<?> deletePurchase(@PathVariable("purchaseId") Long purchaseId) {
        purchaseService.deletePurchase(purchaseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
