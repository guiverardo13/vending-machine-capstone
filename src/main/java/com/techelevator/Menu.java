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
    PurchaseOption purchaseOption = new PurchaseOption();




    public void displayMain() {

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
                    userInput = ui.getUserInput();
                    this.displayPurchaseMenu();

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



    public void displayPurchaseMenu() {
        boolean isReadyToQuit = false;
        do{
            System.out.println("\n...\n");
            ui.displayPurchaseMenu();
            userInput = ui.getUserInput();
            if (userInput.equals("3")){
                isReadyToQuit = true;
            }
            switch (userInput){
                case "1":
                    ui.displayFeedMoney();
                    System.out.println("====more to come====");
                    ////Call a method from purchase options CLASS


                    break;
                case "2":
                    ui.displayStock();
                    ui.displaySelectProduct();

                    ////Call a method from purchase options CLASS
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



