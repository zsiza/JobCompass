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

    public Profile findProfileByProfileId(Long profileId) throws ProfileNotFoundException {
        return profileRepo.findProfileByProfileId(profileId)
                .orElseThrow(() -> new ProfileNotFoundException("Nincs " + profileId + " azonosíójú profil!"));
    }

    public void deleteProfile(Long profileId) {
        profileRepo.deleteProfileByProfileId(profileId);
    }
}
