package jobcompass.controller;

import jobcompass.JobcompassUserResource;
import jobcompass.exception.JobcompassUserException;
import jobcompass.model.JobcompassUser;
import jobcompass.model.LoginCredentials;
import jobcompass.repo.JobcompassUserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class LoginController {

    JobcompassUserRepo jobcompassUserRepo;
    JobcompassUserResource jobcompassUserResource;

    private final PasswordEncoder passwordEncoder;

    public LoginController(JobcompassUserRepo jobcompassUserRepo, PasswordEncoder passwordEncoder, JobcompassUserResource jobcompassUserResource) {
        this.jobcompassUserRepo = jobcompassUserRepo;
        this.passwordEncoder = passwordEncoder;
        this.jobcompassUserResource = jobcompassUserResource;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginCredentials loginCredentials) {
        List<JobcompassUser> users = jobcompassUserRepo.findAll();
        for (JobcompassUser user : users) {
            if (user.getUsername().equals(loginCredentials.getUsername())) {
                if (passwordEncoder.matches(loginCredentials.getPassword(), user.getPassword())) {
                    user.setOnline(true);
                    jobcompassUserResource.updateUser(user);
                    return new ResponseEntity<>(user, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(new JobcompassUserException("Hibás jelszó!"), HttpStatus.BAD_REQUEST);
                }
            }
        }
        return new ResponseEntity<>(new JobcompassUserException("Nincs ilyen felhasználó!"), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/logout/{id}")
        public ResponseEntity<?> logout(@PathVariable("id") Long id) {
            JobcompassUser jobcompassUser = jobcompassUserRepo.findById(id).get();
            jobcompassUser.setOnline(false);
            jobcompassUserResource.updateUser(jobcompassUser);
            return new ResponseEntity<>("Sikeres kijelentkezés!", HttpStatus.OK);
        }
}

