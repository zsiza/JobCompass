package jobcompass.repo;

import jobcompass.model.JobcompassUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobcompassUserRepo extends JpaRepository<JobcompassUser, Long> {

    Optional<JobcompassUser> findUserById(Long id);

    Optional<JobcompassUser> findUserByUsername(String username);

    void deleteUserById(Long id);

}
