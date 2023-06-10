package com.techelevator;

import java.util.Map;

public class Menu {
    ////CONSTRUCTOR
    public Menu() throws MalformedItemException {
    }

    UI ui = new UI();
    private String userInput;
    private SlotMapClass slotMap = new SlotMapClass();
    private Map<String, Slot> stockMapCopy;
    String name;
    PurchaseOption purchaseOption = new PurchaseOption();




    public void displaysMain() throws MalformedItemException {

        boolean isReadyToQuit = false;
        do {

            System.out.println("\n...\n");
            ui.displayMainMenu();
            userInput = ui.getUserInput();
            if (userInput.equals("3")){
                isReadyToQuit = true;
            }
            switch (userInput){
                case "1":
                    ui.displayStock();
                    break;
                case "2":
                    this.displaysPurchaseMenu();
                    userInput = ui.getUserInput();

                    break;
                case "3":
                    isReadyToQuit = true;
                    ui.displayGoodbye();
                    break;
                default:
                    ui.displayIncorrect();
                    break;
            }

        }while (!isReadyToQuit);
    }



    public void displaysPurchaseMenu() throws MalformedItemException {
        boolean isReadyToQuit = false;
        do{
            System.out.println("\n...\n");
            ui.displayPurchaseMenu(purchaseOption.balance);
            userInput = ui.getUserInput();
            if (userInput.equals("3")){
                isReadyToQuit = true;
            }
            switch (userInput){
                case "1":
                    ui.displayFeedMoney();
                    ////Call a method from purchase options CLASS
                    ui.getUserInput();

                    break;
                case "2":
                    ui.displayStock();
                    ui.displaySelectProduct();
                    ////Call a method from purchaseoptionsCLASS
                    purchaseOption.insertCash();
                    purchaseOption.selectProduct();

                    break;
                case "3":
                    System.out.println("--going back to main menu--");
                    isReadyToQuit = true;
                    break;
                default:
                    ui.displayIncorrect();
                    break;
            }
        } while (!isReadyToQuit);


    }
}



