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

        // psql adatok
        String databaseHost = "localhost";
        String databasePort = "5432";
        String databaseName = "postgres";
        String databaseUser = "postgres";
        String databasePassword = "admin";

        try {
            // fajlok mentese
            FileUtils.copyDirectory(new File(sourceDirectory), new File(backupDirectory));

            // adatbazis mentese
            String dumpCommand = String.format(
                    "pg_dump -h %s -p %s -U %s -d %s -F c -b -v -f %s/%s.dump",
                    databaseHost, databasePort, databaseUser, databaseName, backupDirectory, databaseName
            );

            Process process = Runtime.getRuntime().exec(dumpCommand);
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Sikeres biztonsagi mentes.");
            } else {
                System.err.println("Hiba a biztonsagi mentes soran. Hibakod: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Hiba a biztonsagi mentes soran: " + e.getMessage());
        }
    }
}
