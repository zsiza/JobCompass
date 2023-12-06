package jobcompass;

import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;

public class HerokuBackup {

    @Scheduled(cron = "0 0 0 * * *")
    public static void adatbazisMentes() {
        try {
            // heroku parancs futtatása
            Process process = Runtime.getRuntime().exec("heroku pg:backups:capture");

            // várakozás a folyamatra
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Heroku biztonsági mentés sikeresen megörtént.");
            } else {
                System.err.println("Hiba a Heroku biztonsági mentés során. Hibakód: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}