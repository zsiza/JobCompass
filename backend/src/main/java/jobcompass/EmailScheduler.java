package jobcompass;

import jobcompass.model.JobcompassUser;
import jobcompass.service.EmailService;
import jobcompass.service.JobcompassUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailScheduler {
    private JobcompassUserService jobcompassUserService;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 16 * * *")
    public void sendScheduledEmail() {
        List<JobcompassUser> jobcompassUsers = jobcompassUserService.findAllUsers();
        for(JobcompassUser jobcompassUser : jobcompassUsers){
            String to = jobcompassUser.getEmail();
            String subject = "Napi értesítő";
            String body = "Szia!\n\nLesd meg a profilod, hátha kaptál új megbízást!\n\nÜdv.,\nA JobCompass csapata";

            // Send the email
            emailService.sendEmail(to, subject, body);
        }


    }
}
