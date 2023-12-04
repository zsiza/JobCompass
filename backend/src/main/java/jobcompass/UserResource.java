package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.UserException;
import jobcompass.model.User;
import jobcompass.service.UserService;
import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

@RestController @RequestMapping("/user") @Transactional
public class UserResource {
    private final UserService userService;

    private final Random random = new Random();

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public UserResource(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserByUserId(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        StrongTextEncryptor passwordEncryptor = new StrongTextEncryptor();
        if (user.getFirstName() == null || user.getLastName() == null || user.getUsername() == null || user.getEmail() == null || user.getPassword() == null || !user.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
            return new ResponseEntity<>(new UserException("Nem adtál meg minden paramétert!"), HttpStatus.BAD_REQUEST);
        }
        passwordEncryptor.setPassword("jobcompass");
        user.setPassword(passwordEncryptor.encrypt(user.getPassword())); // TODO: ez egyelőre nem használható verifikációra
        user.setProfileId(random.nextLong());   // TODO: ennél kb. csak jobb megoldás van :D
        user.setAdmin(false);
        user.setSellerId(random.nextLong());
        user.setBalance(0);
        user.setOnline(false);
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) { //TODO: adatok ellenőrzése, pl. pozitív egyenleg
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
