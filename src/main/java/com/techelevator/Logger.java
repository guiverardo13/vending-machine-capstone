package com.techelevator;

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
            System.out.println("File cannot be created.");
        }
    }

    private String getCurrentTime() {
        String date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return date;
    }

    public void logEvent(String event, String balanceBeforeTransaction, String afterTransaction) {
        String logString = String.format("%-24s %-22s %-14s %-14s", getCurrentTime(), event, balanceBeforeTransaction,
                afterTransaction);

        try (FileOutputStream fileWriter = new FileOutputStream("log.txt", true);
             PrintWriter fileAppender = new PrintWriter(fileWriter)) {

            PrintWriter print = new PrintWriter(fileAppender);
            print.print(logString + "\n");

        } catch (IOException e) {

        }
       


    }
}


