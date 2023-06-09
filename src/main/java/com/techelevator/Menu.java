package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

public class Menu {

    UI userInput = new UI();

    public void MainMenuOptions() throws MalformedItemException {

        // display welcome
        userInput.displayWelcome();
        // display main menu
        userInput.displayMainMenu();
        // get userInput
        String answer = userInput.getUserInput();


        do {
            userInput.displayMainMenu();

        } while (userInput.getUserInput().contains("1"));


    }
}


         //   if (userInput.getUserInput().contains("1")) {
          //          userInput.displayItems();
           //         } else if (userInput.getUserInput().contains("2")){
            //        userInput.displayPurchaseMenu();
             //       } else if (answer.contains("3")){
              //      System.out.println("exit");
                //    }


