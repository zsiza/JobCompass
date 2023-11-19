package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.UserNotFoundException;
import jobcompass.model.User;
import jobcompass.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="user", schema = "public")
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Long id) throws UserNotFoundException {
        return userRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("Nincs " + id + " azonosíójú felhasználó!"));
    }

    public void deleteUser(Long id) {
        userRepo.deleteUserById(id);
    }
}
