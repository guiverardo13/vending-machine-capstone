package com.techelevator;

public class Menu {

    UI ui = new UI();
    private String userInput;
    public void displayMain() {

        // display welcome
        ui.displayWelcome();
        // display main menu
        ui.displayMainMenu();

        userInput = ui.getUserInput();

        //check that it's valid
        //see if it equals 1 , 2 , 3 with if statements
        if (userInput.equals("1")){
            ui.displayStock();
        } if (userInput.equals("2")) {
            //menu.displayPurchaseMenu();
        } if (userInput.equals("3")){
            ///
        }

    }
//    public void displayPurchaseMenu() {
//            ui.displayPurchaseMenu();
//            //another if stuff + loop
//    }
}



