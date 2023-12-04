package jobcompass.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="jobcompass_user", schema = "public")
public class JobcompassUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Long profileId;
    private boolean admin;
    private Long sellerId;
    private double balance;
    private boolean online;

    public JobcompassUser() {}

    public JobcompassUser(String firstName, String lastName, String username, String email, String password, Long profileId, boolean admin, Long sellerId, double balance, boolean online) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
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
