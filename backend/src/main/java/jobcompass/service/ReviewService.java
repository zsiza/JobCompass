package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.ReviewNotFoundException;
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

    public Review findReviewByReviewId(Long reviewId) throws ReviewNotFoundException {
        return reviewRepo.findReviewByReviewId(reviewId)
                .orElseThrow(() -> new ReviewNotFoundException("Nincs " + reviewId + " azonosíójú értékelés!"));
    }

    public void deleteReview(Long reviewId) {
        reviewRepo.deleteReviewByReviewId(reviewId);
    }
}
