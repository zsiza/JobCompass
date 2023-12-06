package jobcompass.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="service", schema = "public")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String description;
    private double price;
    private int deliveryTime;
    @Column(nullable = false, updatable = false)
    private Long categoryId;
    @Column(nullable = false, updatable = false)
    private Long sellerId;

    public Service() {}

    public Service(Long id, String title, String description, double price, int deliveryTime, Long categoryId, Long sellerId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.deliveryTime = deliveryTime;
        this.categoryId = categoryId;
        this.sellerId = sellerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", deliveryTime=" + deliveryTime +
                ", categoryId=" + categoryId +
                ", sellerId=" + sellerId +
                '}';
    }
}