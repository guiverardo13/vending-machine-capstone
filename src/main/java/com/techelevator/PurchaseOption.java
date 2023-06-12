package com.techelevator;

import java.text.NumberFormat;
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
    private Logger logActivity = new Logger();
    private int cashInput;

    public PurchaseOption() {
    }

    //////Option 1) feed money:
    public void insertCash() {
        ui.displayFeedMoneyMenu();
        String userInput = ui.getUserInput();

        switch (userInput) {
            case "1":
               // this.balance += 100; //dollar bill
                cashInput = 100;
                break;
            case "5":
               // this.balance += 500; // five dollar bill
                cashInput = 500;
                break;
            case "10":
               // balance += 1000; //..etc
                cashInput = 1000;
                break;
            case "20":
               // balance += 2000;
                cashInput = 2000;
                break;
            case "50":
               // balance += 5000;
                cashInput = 5000;
                break;
            case "100":
               // balance += 10000;
                cashInput = 10000;
                break;
            default:
                ui.displayBillError();
                break;

        }

        balance += cashInput;
    }

    //////Option 2) Select Item
    public void selectProduct() throws MalformedItemException {

        String price;
        do {
            String tempUserInput = ui.getUserInput().toUpperCase();
            if (slotMap.containsKey(tempUserInput)){
                userInput = tempUserInput;
                isValidInput = true;
                price = slotMap.get(userInput).currentItem.getPrice();
                Integer priceI = Integer.parseInt(price.replace(".", ""));
                if (balance >= priceI) {
                    if (slotMap.get(userInput).inventory > 0) {
                        balance -= priceI;
                        slotMapClass.takeOneOut(userInput);
                        ui.displaySuccessfulPurchase(userInput, balance);

                    } else if (slotMap.get(userInput).inventory <= 0) {
                        ui.displaySoldOut();
                    }
                } else if (balance < priceI) {
                    ui.displayNotEnoughFunds();
                }
            } else if (tempUserInput.equals("X")){
                isValidInput = true;
            } else {
                ui.displayIncorrect();
                System.out.println("- Or hit (X) to cancel and return to menu.");
                isValidInput = false;
            }
        } while (!isValidInput);
    }

    //////Option 3) Finish Transaction
    public void finishTransaction() {
        sale.getAndPrintChangeCoins(balance);
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void logFeedMoney() {
        double moneys = (double) balance / 100;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(moneys);
        String moneyIn = formatter.format((double) cashInput/100);


       logActivity.logEvent("FEED MONEY:", moneyIn, moneyString);
    }

    public void logItem() {
        if (slotMap.containsKey(userInput)) {
            double moneys = (double) balance / 100;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String moneyString = formatter.format(moneys);

            String name = "~" + slotMap.get(userInput).currentItem.getName().toUpperCase() + "~";
            String price = ("$" + slotMap.get(userInput).currentItem.getPrice());


            logActivity.logEvent(name, price, moneyString);
        }
    }

    public void logChange() {
        double moneys = (double) balance / 100;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(moneys);
        String balanceAfterChange = formatter.format((double)(balance - balance)/100); //should always be 0.00


        logActivity.logEvent("GIVE CHANGE:", moneyString, balanceAfterChange);
    }

}








