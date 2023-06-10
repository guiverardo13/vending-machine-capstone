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
        // display main menu
        boolean isReadyToQuit = false;
        ui.displayMainMenu();
        userInput = ui.getUserInput();
        if (userInput.equals("3")){
                isReadyToQuit = true;
        }
        while (!isReadyToQuit) {
            System.out.println("\n...\n");
            ui.displayMainMenu();
            userInput = ui.getUserInput();
            switch (userInput){
                case "1":
                    ui.displayStock();
                    break;
                case "2":
                    userInput = ui.getUserInput();
                    this.displayPurchaseMenu();
                    break;
                case "3":
                    isReadyToQuit = true;
                    break;
                default:
                    ui.displayIncorrect();
                    break;
            }


//            if (userInput.equals("1")) {
//                ui.displayStock();
//            } else if (userInput.equals("2")) {
//                userInput = ui.getUserInput();
//                this.displayPurchaseMenu();
//            } else if (userInput.equals("3")) {
//                isReadyToQuit = true;
//            }
        }

    }
    public void displayPurchaseMenu() {
        boolean isReadyToQuit = false;
        System.out.println("\n...\n");
        ui.displayPurchaseMenu();
        while (!isReadyToQuit) {
            if (userInput.equals("1")) {
                ui.displayFeedMoney();
                userInput = ui.getUserInput();
                ////I want to put the purchas logic into the PurchaseOption Class
            }
            if (userInput.equals("2")) {
                ///purchase logic
                System.out.println("trying to buy!"); //for now
            }
            if (userInput.equals("3")) {
                isReadyToQuit = true;
            }
        }


    }
}



