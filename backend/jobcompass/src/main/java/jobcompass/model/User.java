package jobcompass.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;



@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long userId;
    private String email;
    private String password;
    private int balance;
    /*
    private List<Integer> services;
    private List<Message> messages;*/

    public User(Long userId, String email, String password, int balance) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public User() {

    }

    public Long getUserId() {
        return userId;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
    /*


    public boolean isOnline() {

    };
    public Service addService() {
        return new Service(); // TODO
    };

    public Review addReview() {
        return new Review(); // TODO
    };
        return true; // TODO

    public boolean pay(int amount, User user) {
        return true; // TODO
    };
}*/
