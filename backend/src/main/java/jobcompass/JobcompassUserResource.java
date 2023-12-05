package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.JobcompassUserException;
import jobcompass.model.JobcompassUser;
import jobcompass.service.JobcompassUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Pattern;

@RestController @RequestMapping("/jobcompass_user") @Transactional
public class JobcompassUserResource {
    private final JobcompassUserService jobcompassUserService;
    private final PasswordEncoder passwordEncoder;

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public JobcompassUserResource(JobcompassUserService jobcompassUserService, PasswordEncoder passwordEncoder) {
        this.jobcompassUserService = jobcompassUserService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/all")
    public ResponseEntity<List<JobcompassUser>> getAllUsers() {
        List<JobcompassUser> jobcompassUsers = jobcompassUserService.findAllUsers();
        return ResponseEntity.ok(jobcompassUsers);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<JobcompassUser> getUserByUserId(@PathVariable("id") Long id) {
        JobcompassUser jobcompassUser = jobcompassUserService.findUserById(id);
        return new ResponseEntity<>(jobcompassUser, HttpStatus.OK);
    }

    @GetMapping("/find/{username}")
    public ResponseEntity<JobcompassUser> getUserByUserId(@PathVariable("username") String username) {
        JobcompassUser jobcompassUser = jobcompassUserService.findUserByUsername(username);
        return new ResponseEntity<>(jobcompassUser, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody JobcompassUser jobcompassUser) {
        if (!jobcompassUser.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
            return new ResponseEntity<>(new JobcompassUserException("Hibás email cím!"), HttpStatus.BAD_REQUEST);
        }
        List<JobcompassUser> jobcompassUsers = jobcompassUserService.findAllUsers();
        for (JobcompassUser user : jobcompassUsers) {
            if (user.getUsername().equals(jobcompassUser.getUsername())) {
                return new ResponseEntity<>(new JobcompassUserException("Ez a felhasználónév már foglalt!"), HttpStatus.BAD_REQUEST);
            }
            if (user.getEmail().equals(jobcompassUser.getEmail())) {
                return new ResponseEntity<>(new JobcompassUserException("Ez az email cím már foglalt!"), HttpStatus.BAD_REQUEST);
            }
        }
        jobcompassUser.setPassword(passwordEncoder.encode(jobcompassUser.getPassword()));
        jobcompassUser.setAdmin(false);
        jobcompassUser.setBalance(0);
        jobcompassUser.setOnline(false);
        JobcompassUser newJobcompassUser = jobcompassUserService.addUser(jobcompassUser);
        return new ResponseEntity<>(newJobcompassUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody JobcompassUser jobcompassUser) {
        List<JobcompassUser> jobcompassUsers = jobcompassUserService.findAllUsers();
        if (!jobcompassUser.isAdmin()) {
            boolean adminExists = false;
            for (JobcompassUser user : jobcompassUsers) {
                if (user.getId().equals(jobcompassUser.getId()) && user.isAdmin()) {
                    adminExists = true;
                    break;
                }
            }
            if (!adminExists) {
                return new ResponseEntity<>(new JobcompassUserException("Legalább egy felhasználónak adminnak kell lennie!"), HttpStatus.BAD_REQUEST);
            }
        }
        if (jobcompassUser.getBalance() < 0) {
            return new ResponseEntity<>(new JobcompassUserException("A felhasználó egyenlege nem lehet negatív!"), HttpStatus.BAD_REQUEST);
        }
        JobcompassUser updatedJobcompassUser = jobcompassUserService.updateUser(jobcompassUser);
        return new ResponseEntity<>(updatedJobcompassUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        jobcompassUserService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
