package jobcompass.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="user", schema = "public")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;        // TODO: ez az adatbázisban legyen BigInt, és ne id legyen a neve
    private String email;
    private String password;
    @Column(nullable = false, updatable = false)
    private Long profileId;     // TODO: ez az adatbázisban legyen BigInt (amúgy erre van szükség?)
    private boolean admin;      // TODO: ez az adatbázisban ne isAdmin legyen
    @Column(nullable = false, updatable = false)
    private Long sellerId;      //TODO: ez az adatbázisban legyen BigInt

    private double balance;
    private boolean online;

    public User() {}

    public User(String email, String password, Long profileId, boolean admin, Long sellerId, double balance, boolean online) {
        this.email = email;
        this.password = password;
        this.profileId = profileId;
        this.admin = admin;
        this.sellerId = sellerId;
        this.balance = balance;
        this.online = online;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profileId=" + profileId +
                ", admin=" + admin +
                ", sellerId=" + sellerId +
                ", balance=" + balance +
                ", online=" + online +
                '}';
    }
}
