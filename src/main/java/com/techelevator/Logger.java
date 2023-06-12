package com.techelevator;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Logger {
    private final String fileName = "log.txt";
    private File logFile = new File(fileName);


    public Logger() {}
    public void createNewLocalFile() {
        try (FileOutputStream fileWriter = new FileOutputStream("log.txt", true);
             PrintWriter fileAppender = new PrintWriter(fileWriter)) {

            PrintWriter print = new PrintWriter(fileAppender);
            print.print(logFile);

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

        ///BONUS
        ////FINISH TRANSACTION AND FINISH PRINTWRITING RECEIPT.
        //Chiclets|1 <---WE CAN GET THIS NUMBER BY
        //Triplemint|0      SUBTRACTING AMT LEFT BY 5.
        //
        //**TOTAL SALES** $11.05
//        public void FinishTransaction() {
//
//        }

