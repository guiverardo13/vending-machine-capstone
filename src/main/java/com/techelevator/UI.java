package com.techelevator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

////This is where we will log the actions to the txt file.//we could either do it as the things happen or make an array of Strings that we could then printwrite to txt file

public class UI {
    private final Scanner userInput = new Scanner(System.in);
    public UI() throws MalformedItemException{
    }
    private PurchaseOption purchaseInfo = new PurchaseOption();

    ///USER INPUT GETTER
    public String getUserInput() {
        return userInput.nextLine();
    }

    ///WELCOME MESSAGE
    public void displayWelcome() {
        System.out.println("Welcome to the Vendo-o-Matic 800!\n");
    }

    ///DISPLAY MAIN MENU
    public void displayMainMenu() {
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                        "(1) Display Vending Machine Items\n" +
                        "(2) Purchase\n" +
                        "(3) Exit\n\n");
    }

    NumberFormat nfUS=NumberFormat.getCurrencyInstance(Locale.US);
    ///DISPLAY PURCHASE MENU
    public void displayPurchaseMenu() {
        System.out.println("Current Money Provided: " + nfUS. getBalance());
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                        "(1) Feed Money\n" +
                        "(2) Select Product\n" +
                        "(3) Finish Transaction\n\n");
    }
    //// DISPLAY STOCK
    SlotMapClass slotMap = new SlotMapClass();
    String keyCode;
    String name;
    String price;
    int amtLeft;
    String inventoryLeft = "";
    Map<String, Slot> stockMapCopy = new LinkedHashMap<>(slotMap.getSlotMap());

    ////DISPLAY INVENTORY AND REMAINING AMOUNTS
    public void displayStock() {
        System.out.println("\n");
        for (String key: stockMapCopy.keySet()){
            keyCode = stockMapCopy.get(key).currentItem.getKeyCode();
            name = stockMapCopy.get(key).currentItem.getName();
            price = stockMapCopy.get(key).currentItem.getPrice();
            amtLeft = stockMapCopy.get(key).inventory;
            if (amtLeft > 0){
                inventoryLeft = stockMapCopy.get(key).inventory + " remaining";
            } else if (amtLeft == 0){
                inventoryLeft = "!!!SOLD OUT!!!";
            }

            System.out.println("(" + keyCode + ") \"" + name + "\" $" + price + " >>> " + inventoryLeft +" <<<");
        }
        System.out.println("\n");
    }

        //        System.out.println(stockMapCopy.get("A1").currentItem.getName());

    ////INVALID ENTRY
    public void displayIncorrect() {
        System.out.println("Invalid entry! Please try again.");
    }


////FEED MONEY
    public void displayFeedMoney() {
        System.out.println("$$$\nPlease feed your bill by selecting (1)(5)(10)(20)(50)or(100)\n" +
                "(1)   : One-Dollar-Bill\n" +
                "(5)   : Five-Dollar-Bill\n" +
                "(10)  : Ten-Dollar-Bill\n" +
                "(20)  : Twenty-Dollar-Bill\n" +
                "(50)  : Fifty-Dollar-Bill\n" +
                "(100) : Hundred-Dollar-Bill\n");

    }
////SELECT PRODUCT TO TRY AND BUY
    public void displaySelectProduct() {
        System.out.println("Enter the KeyCode of the Item you would like to buy:");
    }

////FINISH TRANSACTION AND FINISH PRINTWRITING RECEIPT.
        //Chiclets|1 <---WE CAN GET THIS NUMBER BY
        //Triplemint|0      SUBTRACTING AMT LEFT BY 5.
        //
        //**TOTAL SALES** $11.05
    public void FinishTransaction() {

    }
}

