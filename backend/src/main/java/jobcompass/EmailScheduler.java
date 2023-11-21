package jobcompass;

import jobcompass.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 16 * * *")
    public void sendScheduledEmail() {
        String to = "TODO";
        String subject = "Napi értesítő";
        String body = "Szia!\n\nLesd meg a profilod, hátha kaptál új megbízást!";

        // Send the email
        emailService.sendEmail(to, subject, body);
    }
}
