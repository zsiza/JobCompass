package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.exception.ProfileNotFoundException;
import jobcompass.model.Profile;
import jobcompass.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/profile") @Transactional
public class ProfileResource {
    private final ProfileService profileService;

    public ProfileResource(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Profile>> getAllProfiles() {
        List<Profile> profiles = profileService.findAllProfiles();
        return ResponseEntity.ok(profiles);
    }

    @GetMapping("/find/{profileId}")
    public ResponseEntity<Profile> getProfileByProfileId(@PathVariable("profileId") Long profileId) throws ProfileNotFoundException {
        Profile profile = profileService.findProfileByProfileId(profileId);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Profile> addProfile(@RequestBody Profile profile) {
        Profile newProfile = profileService.addProfile(profile);
        return new ResponseEntity<>(newProfile, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile) {
        Profile updatedProfile = profileService.updateProfile(profile);
        return new ResponseEntity<>(updatedProfile, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{profileId}")
    public ResponseEntity<?> deleteProfile(@PathVariable("profileId") Long profileId) {
        profileService.deleteProfile(profileId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
