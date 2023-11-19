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

    public Purchase findPurchaseByPurchaseId(Long purchaseId) throws PurchaseNotFoundException {
        return purchaseRepo.findPurchaseByPurchaseId(purchaseId)
                .orElseThrow(() -> new PurchaseNotFoundException("Nincs " + purchaseId + " azonosíójú vásárlás!"));
    }

    public void deletePurchase(Long purchaseId) {
        purchaseRepo.deletePurchaseByPurchaseId(purchaseId);
    }
}
