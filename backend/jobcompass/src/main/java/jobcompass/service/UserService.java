package jobcompass.service;

import jobcompass.exception.UserNotFoundException;
import jobcompass.model.User;
import jobcompass.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public User findUserByUserId(Long userId) throws UserNotFoundException {
        return userRepo.findUserByUserId(userId)
                .orElseThrow(() -> new UserNotFoundException("Nincs " + userId + " azonosíójú felhasználó!"));
    }

    public void deleteUser(Long userId) {
        userRepo.deleteUserByUserId(userId);
    }
}
