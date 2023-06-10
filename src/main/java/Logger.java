import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private final String fileName = "log.txt";
    private boolean deleteFile = new File(fileName).delete();
    private File logFile = new File(fileName);

    public Logger() {
        createNewFile();
    }

    private void createNewFile() {
        try {
            logFile.createNewFile();
        } catch (IOException e) {
        }
    }

    private String getCurrentTime() {
        String date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return date;
    }

    public String logEvent(String event, String balanceBeforeTransaction, String afterTransaction) {
        String logString = String.format("%-24s %-22s %-14s %-14s", getCurrentTime(), event, balanceBeforeTransaction,
                afterTransaction);

        try (Writer fileWriter = new FileWriter(logFile, true);
             PrintWriter print = new PrintWriter(fileWriter)) {
            print.write(logString + "\n");
        } catch (IOException e) {
        }
        return logString;


    }
}

