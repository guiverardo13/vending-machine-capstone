package com.techelevator;
import TrashBin.CoinsAndBills;

import java.util.Map;

public class PurchaseOption {

    private SlotMapClass slotMapClass = new SlotMapClass();
    private Map<String, Slot> slotMap = slotMapClass.getSlotMap();
    public int balance; //in pennies
    private int changeTotal;
    private boolean isValidInput = false;
    private String userInput;
    UI ui = new UI();
    private Sale sale = new Sale();

    public PurchaseOption() throws MalformedItemException {

    }


    // if user input equals a valid key code, call dispense method from UI.
    // dispense method prints name, cost and remaining balance and displays sound.


    ////do while !=3 && while !valid input number
    ////do{sout the menu option from ui class
    //       take customer choices as numbers}


    //////Option 1) feed money:
    public void insertCash() {
        ui.displayFeedMoneyMenu();
        String userInput = ui.getUserInput();

        switch (userInput){
            case "1":
                this.balance += 100; //dollar bill
                break;
            case "5":
                this.balance += 500; // five dollar bill
                break;
            case "10":
                balance += 1000; //..etc
                break;
            case "20":
                balance += 2000;
                break;
            case "50":
                balance += 5000;
                break;
            case "100":
                balance += 10000;
                break;
            default:
                ui.displayBillError();
                break;
        }
    }

    //////Option 2) Select Item
    public void selectProduct() throws MalformedItemException {

//        slotMap = slotMapClass.getSlotMap();
        String price;
        // make do while loop to check valid input
        do {
            userInput = ui.getUserInput();
            if (slotMap.containsKey(userInput)) {
                isValidInput = true;
            } else {
                ui.displayIncorrect();
            }
        } while (!isValidInput);

        price = slotMap.get(userInput).currentItem.getPrice();
        Integer priceI = Integer.parseInt(price.replace(".", ""));


        if (balance >= priceI) {
            if (slotMap.get(userInput).inventory > 0) {
                balance -= priceI;
                slotMapClass.takeOneOut(userInput);
                ui.displaySuccessfulPurchase(userInput, balance);
//                prints the item name, cost, and the money remaining. Dispensing also returns a message:
//                All chip items print "Crunch Crunch, Yum!"
            } else if (slotMap.get(userInput).inventory <= 0) {
                ui.displaySoldOut();}
        } else if (balance < priceI) {
            ui.displayNotEnoughFunds();
        }
    }

        //////Option 3) Finish Transaction
        public void finishTransaction() {
            sale.getAndPrintChangeCoins(balance);
            balance = 0;
            ////LOOOOOOOOOOG method
        }
        ///returns to last menu. somehow.


        public int getBalance() {
            return balance;
        }
}








