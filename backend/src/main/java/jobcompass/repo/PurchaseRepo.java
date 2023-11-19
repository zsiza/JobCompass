package jobcompass.repo;

import jobcompass.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

    Optional<Purchase> findPurchaseById(Long id);

    void deletePurchaseById(Long id);
}
