package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.ReviewException;
import jobcompass.model.Review;
import jobcompass.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="review", schema = "public")
public class ReviewService {
    private final ReviewRepo reviewRepo;

    @Autowired
    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public Review addReview(Review review) {
        return reviewRepo.save(review);
    }

    public List<Review> findAllReviews() {
        return reviewRepo.findAll();
    }

    public Review updateReview(Review review) {
        return reviewRepo.save(review);
    }

    public Review findReviewById(Long id) throws ReviewException {
        return reviewRepo.findReviewById(id)
                .orElseThrow(() -> new ReviewException("Nincs " + id + " azonosíójú értékelés!"));
    }

    public void deleteReview(Long id) {
        reviewRepo.deleteReviewById(id);
    }
}
