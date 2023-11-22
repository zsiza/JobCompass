package jobcompass;

import jobcompass.model.User;
import jobcompass.service.EmailService;
import jobcompass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailScheduler {
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 16 * * *")
    public void sendScheduledEmail() {
        List<User> users = userService.findAllUsers();
        for(User user: users){
            String to = user.getEmail();
            String subject = "Napi értesítő";
            String body = "Szia!\n\nLesd meg a profilod, hátha kaptál új megbízást!";

            // Send the email
            emailService.sendEmail(to, subject, body);
        }


    }
}
