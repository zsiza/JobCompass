package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.ProfileNotFoundException;
import jobcompass.model.Profile;
import jobcompass.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="profile", schema = "public")
public class ProfileService {
    private final ProfileRepo profileRepo;

    @Autowired
    public ProfileService(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    public Profile addProfile(Profile profile) {
        return profileRepo.save(profile);
    }

    public List<Profile> findAllProfiles() {
        return profileRepo.findAll();
    }

    public Profile updateProfile(Profile profile) {
        return profileRepo.save(profile);
    }

    public Profile findProfileById(Long id) throws ProfileNotFoundException {
        return profileRepo.findProfileById(id)
                .orElseThrow(() -> new ProfileNotFoundException("Nincs " + id + " azonosíójú profil!"));
    }

    public void deleteProfile(Long id) {
        profileRepo.deleteProfileById(id);
    }
}
