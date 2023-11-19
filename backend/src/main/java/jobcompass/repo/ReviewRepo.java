package jobcompass.repo;

import jobcompass.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepo extends JpaRepository<Review, Long> {

    Optional<Review> findReviewById(Long id);

    void deleteReviewById(Long id);
}
