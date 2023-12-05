package jobcompass.controller;

import jobcompass.JobcompassUserResource;
import jobcompass.exception.JobcompassUserException;
import jobcompass.model.JobcompassUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    private final JobcompassUserResource jobcompassUserResource;
    private final PasswordEncoder passwordEncoder;

    public RegisterController(JobcompassUserResource jobcompassUserResource, PasswordEncoder passwordEncoder) {
        this.jobcompassUserResource = jobcompassUserResource;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("")
    public ResponseEntity<?> register(@RequestBody JobcompassUser jobcompassUser) {
        if (jobcompassUser.getFirstName() == null || jobcompassUser.getLastName() == null || jobcompassUser.getUsername() == null || jobcompassUser.getEmail() == null || jobcompassUser.getPassword() == null) {
            return new ResponseEntity<>(new JobcompassUserException("Nem adtál meg minden paramétert!"), HttpStatus.BAD_REQUEST);
        }
        return jobcompassUserResource.addUser(jobcompassUser);
    }
}
