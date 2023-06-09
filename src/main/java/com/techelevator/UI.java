package com.techelevator;
import java.util.Scanner;


public class UI {
    private final Scanner userInput = new Scanner(System.in);
    private String usersResponse;
   private Slot itemList = new Slot();


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

    public void displayItems() throws MalformedItemException {
        Slot itemList = new Slot();

        System.out.println(itemList.buildItem());
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
