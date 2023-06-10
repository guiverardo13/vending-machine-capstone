package com.techelevator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class UI {
    private final Scanner userInput = new Scanner(System.in);
    private String usersResponse;
    public UI() throws MalformedItemException {
    }
    public String getUserInput() {
        return userInput.nextLine();
    }


    public void displayWelcome() {
        System.out.println("Welcome to the Vendo-o-Matic 800!\n");
    }

    public void displayMainMenu() {
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                        "(1) Display Vending Machine Items\n" +
                        "(2) Purchase\n" +
                        "(3) Exit\n\n");
    }

    public void displayPurchaseMenu() {
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                        "(1) Feed Money\n" +
                        "(2) Select Product\n" +
                        "(3) Finish Transaction\n\n");
    }

    SlotMapClass slotMap = new SlotMapClass();
    String keyCode;
    String name;
    String price;
    int amtLeft;
    String inventoryLeft = "";
    Map<String, Slot> stockMapCopy = new LinkedHashMap<>(slotMap.getSlotMap());

    //String type;
    public void displayStock() {
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

            System.out.println("(" + keyCode + ") \"" + name + "\" $" + price + " >>> " + inventoryLeft +" <<<\n\n");
        }
    }

        //        System.out.println(stockMapCopy.get("A1").currentItem.getName());


    public void displayIncorrect() {
        System.out.println("Invalid entry! Please try again.");
    }

    public void displayFeedMoney() {
        System.out.println("$$$\nPlease feed your bill by selecting (1)(5)(10)(20)(50)or(100)\n" +
                "(1)   : One-Dollar-Bill\n" +
                "(5)   : Five-Dollar-Bill\n" +
                "(10)  : Ten-Dollar-Bill\n" +
                "(20)  : Twenty-Dollar-Bill\n" +
                "(50)  : Fifty-Dollar-Bill\n" +
                "(100) : Hundred-Dollar-Bill\n");

    }

    public void SelectProduct() {

    }

    public void FinishTransaction() {

    }


}

