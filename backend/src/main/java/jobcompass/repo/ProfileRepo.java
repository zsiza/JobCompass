package jobcompass.repo;

import jobcompass.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepo extends JpaRepository<Profile, Long> {

    Optional<Profile> findProfileByProfileId(Long profileId);

    void deleteProfileByProfileId(Long profileId);
}
