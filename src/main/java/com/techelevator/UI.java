package com.techelevator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UI {
    private final Scanner userInput = new Scanner(System.in);
    private String usersResponse;
    private SlotMap slotMap = new SlotMap();


    public String getUserInput(){
        return userInput.nextLine();
    }


    public void displayWelcome(){
        System.out.println("Welcome to the Vendo-o-Matic 800!");
    }
    public void displayMainMenu(){
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                "(1) Display Vending Machine Items\n" +
                "(2) Purchase\n" +
                "(3) Exit\n");
    }

    public void displayPurchaseMenu(){
        System.out.println(
                "Please select (1)(2)or(3) from the menu options:\n\n" +
                "(1) Feed Money\n"+
                "(2) Select Product\n"+
                "(3) Finish Transaction\n");
    }

    Map<String, Slot> stockMap = new HashMap<>();
    public void displayStock(){
        stockMap = slotMap.getSlotMap();
        //A1 PotatoCrisps 3.05
        String slotCode = null;
        String choiceName;
        Double price;
        System.out.println(stockMap.get("A1"));
        
        for (String key : stockMap.keySet()) {

           // choiceName = stockMap.get(stockMap).currentItem.getName();
           // price = stockMap.get(stockMap).currentItem.getPrice();

            System.out.println(key);
        }
        
    }

    public void displayIncorrect(){
        System.out.println("Invalid entry! Please try again.");
    }

    public void displayFeedMoney(){

    }

    public void SelectProduct(){

    }

    public void FinishTransaction(){

    }

}
