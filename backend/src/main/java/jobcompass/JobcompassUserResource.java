package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.JobcompassUserException;
import jobcompass.model.JobcompassUser;
import jobcompass.service.JobcompassUserService;
import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

@RestController @RequestMapping("/jobcompass_user") @Transactional
public class JobcompassUserResource {
    private final JobcompassUserService jobcompassUserService;

    private final Random random = new Random();

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public JobcompassUserResource(JobcompassUserService jobcompassUserService) {
        this.jobcompassUserService = jobcompassUserService;
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

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody JobcompassUser jobcompassUser) {
        StrongTextEncryptor passwordEncryptor = new StrongTextEncryptor();
        if (jobcompassUser.getFirstName() == null || jobcompassUser.getLastName() == null || jobcompassUser.getUsername() == null || jobcompassUser.getEmail() == null || jobcompassUser.getPassword() == null || !jobcompassUser.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
            return new ResponseEntity<>(new JobcompassUserException("Nem adtál meg minden paramétert!"), HttpStatus.BAD_REQUEST);
        }
        passwordEncryptor.setPassword("jobcompass");
        jobcompassUser.setPassword(passwordEncryptor.encrypt(jobcompassUser.getPassword())); // TODO: ez egyelőre nem használható verifikációra
        jobcompassUser.setProfileId(random.nextLong());   // TODO: ennél kb. csak jobb megoldás van :D
        jobcompassUser.setAdmin(false);
        jobcompassUser.setSellerId(random.nextLong());
        jobcompassUser.setBalance(0);
        jobcompassUser.setOnline(false);
        JobcompassUser newJobcompassUser = jobcompassUserService.addUser(jobcompassUser);
        return new ResponseEntity<>(newJobcompassUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<JobcompassUser> updateUser(@RequestBody JobcompassUser jobcompassUser) { //TODO: adatok ellenőrzése, pl. pozitív egyenleg
        JobcompassUser updatedJobcompassUser = jobcompassUserService.updateUser(jobcompassUser);
        return new ResponseEntity<>(updatedJobcompassUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        jobcompassUserService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
