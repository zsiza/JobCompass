package jobcompass;

import org.apache.commons.io.FileUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class WebsiteBackupScheduler {

    @Scheduled(cron = "0 0 0 * * *")
    public void performWebsiteBackup() {
        // forras
        String sourceDirectory = "src/main/java";

        // hova
        String backupDirectory = "backup";

        try {
            // fajlok mentese
            FileUtils.copyDirectory(new File(sourceDirectory), new File(backupDirectory));
            System.out.println("Sikeres biztonsagi mentes.");

        } catch (IOException e) {
            System.err.println("Hiba a biztonsagi mentes soran: " + e.getMessage());
        }
    }
}
