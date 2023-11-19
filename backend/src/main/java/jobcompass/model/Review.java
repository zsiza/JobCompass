package jobcompass.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="review", schema = "public")
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long reviewId; //TODO: db bigint, név
    private int rating;
    private String title;
    private String description;
    @Column(nullable = false, updatable = false)
    private Long reviewerId;
    @Column(nullable = false, updatable = false)
    private Long reviewedId;

    public Review() {}

    public Review(Long reviewId, int rating, String title, String description, Long reviewerId, Long reviewedId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.title = title;
        this.description = description;
        this.reviewerId = reviewerId;
        this.reviewedId = reviewedId;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getReviewedId() {
        return reviewedId;
    }

    public void setReviewedId(Long reviewedId) {
        this.reviewedId = reviewedId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", rating=" + rating +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", reviewerId=" + reviewerId +
                ", reviewedId=" + reviewedId +
                '}';
    }
}