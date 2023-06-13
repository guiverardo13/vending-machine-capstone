package com.techelevator;
import java.util.Map;
import java.util.Scanner;
import java.text.NumberFormat;

public class UI {
    private final Scanner userInput = new Scanner(System.in);
    public String moneyString;
    public UI() {}
    private SlotMapClass slotMapClass = new SlotMapClass();
    private Slot item;

    ///USER INPUT GETTER
    public String getUserInput() {
        return userInput.nextLine();
    }

    ///WELCOME MESSAGE
    public void displayWelcome() {
        System.out.println("Welcome to the Vendo-o-Matic 800!");
    }

    ///GOODBYE!!!
    public void displayGoodbye() {
        System.out.println("\nHave a Great Day! Goodbye!\n" +
                "~~~~~~~~~~~~\n");
    }

    ///DISPLAY MAIN MENU
    public void displayMainMenu() {
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n" +
                        " (1) Display Vending Machine Items\n" +
                        " (2) Purchase\n" +
                        " (3) Exit\n\n");
    }

    ///DISPLAY PURCHASE MENU
    public void displayPurchaseMenu(int balance) {
       // DecimalFormat dFormat = new DecimalFormat();
        double moneys = (double) balance / 100;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        moneyString = formatter.format(moneys);
        System.out.println("Current Money Provided: " + moneyString + "\n");
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n" +
                        " (1) Feed Money\n" +
                        " (2) Select Product\n" +
                        " (3) Finish Transaction\n\n");
    }

    //// DISPLAY STOCK
    SlotMapClass slotMap = new SlotMapClass();
    String keyCode;
    String name;
    String price;
    int amtLeft;
    String inventoryLeft = "";
    Map<String, Slot> stockMapCopy = slotMapClass.getSlotMap();

    ////DISPLAY INVENTORY AND REMAINING AMOUNTS
    public void displayStock() {
        System.out.println("\n");
        for (String key : stockMapCopy.keySet()) {
            keyCode = stockMapCopy.get(key).currentItem.getKeyCode();
            name = stockMapCopy.get(key).currentItem.getName();
            price = stockMapCopy.get(key).currentItem.getPrice();
            amtLeft = stockMapCopy.get(key).inventory;
            if (amtLeft > 0) {
                inventoryLeft = stockMapCopy.get(key).inventory + " remaining";
            } else if (amtLeft == 0) {
                inventoryLeft = "!!!SOLD OUT!!!";
            }

            System.out.println(" (" + keyCode + ") \"" + name + "\" $" + price + " >>> " + inventoryLeft + " <<<");
        }
    }

    ////SOLD OUT!!!
    public void displaySoldOut(){
        System.out.println("\n>>> SOLD OUT <<<\n");
    }

    ////INVALID ENTRY
    public void displayIncorrect() {
        System.out.println("Invalid entry! Please try again. ");
    }

    ////FEED MONEY
    public void displayFeedMoneyMenu() {
        System.out.println("$$$\nPlease feed your bill by selecting (1)(5)(10)(20)(50)or(100)\n" +
                " (1)   : One-Dollar-Bill\n" +
                " (5)   : Five-Dollar-Bill\n" +
                " (10)  : Ten-Dollar-Bill\n" +
                " (20)  : Twenty-Dollar-Bill\n" +
                " (50)  : Fifty-Dollar-Bill\n" +
                " (100) : Hundred-Dollar-Bill\n");

    }

    ////SELECT PRODUCT TO TRY AND BUY
    public void displaySelectProduct() {
        System.out.println("Enter the KeyCode of the Item you would like to buy:");
        System.out.println(" ");
    }

    ////DISPLAY SUCCESSFUL PURCHASE
    public void displaySuccessfulPurchase(String keyCode, int balance) {
        double moneys = (double) balance / 100;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        moneyString = formatter.format(moneys);

        String name = stockMapCopy.get(keyCode).currentItem.getName();
        String priceS = stockMapCopy.get(keyCode).currentItem.getPrice();
        String sound = stockMapCopy.get(keyCode).currentItem.getSound();
        System.out.println("\n" + name + " : PRICE= $" + priceS + " : REMAINING FUNDS = " + moneyString + " : " + sound);
    }

    ////NOT ENOUGH FUNDS
    public void displayNotEnoughFunds(){
        System.out.println("\nSorry!!! You do not have enough funds in your balance.\n");
    }

    ////BILL ERROR
    public void displayBillError(){
        System.out.println("\nInvalid entry!!! Try again.\n");
    }

}

