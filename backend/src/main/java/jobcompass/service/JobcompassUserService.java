package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.JobcompassUserException;
import jobcompass.model.JobcompassUser;
import jobcompass.repo.JobcompassUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="jobcompass_user", schema = "public")
public class JobcompassUserService {
    private final JobcompassUserRepo jobcompassUserRepo;

    @Autowired
    public JobcompassUserService(JobcompassUserRepo jobcompassUserRepo) {
        this.jobcompassUserRepo = jobcompassUserRepo;
    }

    public JobcompassUser addUser(JobcompassUser jobcompassUser) {
        return jobcompassUserRepo.save(jobcompassUser);
    }

    public List<JobcompassUser> findAllUsers() {
        return jobcompassUserRepo.findAll();
    }

    public JobcompassUser updateUser(JobcompassUser jobcompassUser) {
        return jobcompassUserRepo.save(jobcompassUser);
    }

    public JobcompassUser findUserById(Long id) throws JobcompassUserException {
        return jobcompassUserRepo.findUserById(id)
                .orElseThrow(() -> new JobcompassUserException("Nincs " + id + " azonosíójú felhasználó!"));
    }

    public JobcompassUser findUserByUsername(String username) throws JobcompassUserException {
        return jobcompassUserRepo.findUserByUsername(username)
                .orElseThrow(() -> new JobcompassUserException("Nincs " + username + " nevű felhasználó!"));
    }

    public void deleteUser(Long id) {
        jobcompassUserRepo.deleteUserById(id);
    }
}
