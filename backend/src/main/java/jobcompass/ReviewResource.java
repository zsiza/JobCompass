package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.ReviewException;
import jobcompass.model.Review;
import jobcompass.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

@RestController @RequestMapping("/review") @Transactional
public class ReviewResource {
    private final ReviewService reviewService;

    public ReviewResource(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Review>> getAllReviews() {
        List<Review> reviews = reviewService.findAllReviews();
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable("id") Long id) {
        Review review = reviewService.findReviewById(id);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addReview(@RequestBody Review review) {
        if (review.getRating() == 0 || review.getTitle() == null || review.getDescription() == null) {
            return new ResponseEntity<>(new ReviewException("Nem adtál meg minden paramétert!"), HttpStatus.BAD_REQUEST);
        }
        Review newReview = reviewService.addReview(review);
        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Review> updateReview(@RequestBody Review review) {
        Review updatedReview = reviewService.updateReview(review);
        return new ResponseEntity<>(updatedReview, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable("id") Long id) {
        reviewService.deleteReview(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
