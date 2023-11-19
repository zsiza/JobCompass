package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.PurchaseNotFoundException;
import jobcompass.model.Purchase;
import jobcompass.repo.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="purchase", schema = "public")
public class PurchaseService {
    private final PurchaseRepo purchaseRepo;

    @Autowired
    public PurchaseService(PurchaseRepo purchaseRepo) {
        this.purchaseRepo = purchaseRepo;
    }

    public Purchase addPurchase(Purchase purchase) {
        return purchaseRepo.save(purchase);
    }

    public List<Purchase> findAllPurchases() {
        return purchaseRepo.findAll();
    }

    public Purchase updatePurchase(Purchase purchase) {
        return purchaseRepo.save(purchase);
    }

    public Purchase findPurchaseById(Long id) throws PurchaseNotFoundException {
        return purchaseRepo.findPurchaseById(id)
                .orElseThrow(() -> new PurchaseNotFoundException("Nincs " + id + " azonosíójú vásárlás!"));
    }

    public void deletePurchase(Long id) {
        purchaseRepo.deletePurchaseById(id);
    }
}
