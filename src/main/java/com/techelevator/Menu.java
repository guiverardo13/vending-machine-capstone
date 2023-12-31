package com.techelevator;


import java.io.IOException;
import java.util.Map;

public class Menu {

    ////CONSTRUCTOR
    public Menu(){}

    UI ui = new UI();
    private String userInput;
    private Map<String, Slot> stockMapCopy;
    String name;
    PurchaseOption purchaseOption = new PurchaseOption();
    private Application application = new Application();



    public void displaysMain() throws MalformedItemException, IOException {
        PurchaseOption purchaseOption = new PurchaseOption();
        boolean isReadyToQuit = false;
        do {
            System.out.println("~~~~~~~~~~~~\n");
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
                    purchaseOption.selectProduct();
                    break;
                case "3":
                    isReadyToQuit = true;
                    ui.displayGoodbye();
                    String[] box = new String[1];
                    application.main(box);
                    break;
                default:
                    ui.displayIncorrect();
                    break;
            }
        }while (!isReadyToQuit);
    }



    public void displaysPurchaseMenu() throws MalformedItemException, IOException {

        boolean isReadyToQuit = false;
        do{
            System.out.println("\n~~~~~~~~~~~~\n");
            ui.displayPurchaseMenu(purchaseOption.balance);
            userInput = ui.getUserInput();
            if (userInput.equals("3")){
                isReadyToQuit = true;
            }
            switch (userInput){
                case "1":
                    ////Call a method from purchase options CLASS
                    purchaseOption.insertCash();
                    purchaseOption.logFeedMoney();
                    break;
                case "2":
                    ui.displayStock();
                    ui.displaySelectProduct();
                    ////Call a method from purchase options CLASS
                    purchaseOption.selectProduct();
                    purchaseOption.logItem();
                    break;
                case "3":
                    purchaseOption.logChange();
                    purchaseOption.finishTransaction();
                    System.out.println("\n--going back to main menu--\n--stay in school. don't do drugs--");

                    //isReadyToQuit = true;
                    this.displaysMain();
                    break;

                default:
                    ui.displayIncorrect();

                    break;
            }
        } while (!isReadyToQuit);

    }
}



