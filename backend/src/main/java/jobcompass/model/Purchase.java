package jobcompass.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="purchase", schema = "public")
public class Purchase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private Long buyerId;
    @Column(nullable = false, updatable = false)
    private Long serviceId;
    private Timestamp purchaseTime;
    private String status;

    public Purchase() {}

    public Purchase(Long buyerId, Long serviceId, Timestamp purchaseTime, String status) {
        this.buyerId = buyerId;
        this.serviceId = serviceId;
        this.purchaseTime = purchaseTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Timestamp getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Timestamp purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", buyerId=" + buyerId +
                ", serviceId=" + serviceId +
                ", purchaseTime=" + purchaseTime +
                ", status='" + status + '\'' +
                '}';
    }
}