package com.techelevator;

import java.util.Map;

public class Menu {

    public Menu() throws MalformedItemException {
    }

    UI ui = new UI();
    private String userInput;
    private SlotMapClass slotMap = new SlotMapClass();
    private Map<String, Slot> stockMapCopy;
    String name;


    public void displayMain() {

        // display welcome
        ui.displayWelcome();
        // display main menu
        ui.displayMainMenu();

        userInput = ui.getUserInput();
        //stockMapCopy = slotMap.getSlotMap();

        //check that it's valid
        //see if it equals 1 , 2 , 3 with if statements
        if (userInput.equals("1")){
            ui.displayStock();
        } else if (userInput.equals("2")) {
            ui.displayPurchaseMenu();
        } else if (userInput.equals("3")){
            ///
        }

    }
//    public void displayPurchaseMenu() {
//            ui.displayPurchaseMenu();
//            //another if stuff + loop
//    }
}



