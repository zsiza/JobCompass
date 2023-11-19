package jobcompass.repo;

import jobcompass.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

    Optional<Purchase> findPurchaseByPurchaseId(Long purchaseId);

    void deletePurchaseByPurchaseId(Long purchaseId);
}
