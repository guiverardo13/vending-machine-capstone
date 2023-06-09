package com.techelevator;
import java.util.Scanner;


public class UI {
    private final Scanner userInput = new Scanner(System.in);
    private String usersResponse;
   private ItemBuilder itemList = new ItemBuilder();


    public String getUserInput(){
        return userInput.nextLine();
    }


    public void displayWelcome(){
        System.out.println("Welcome to the Vendo-o-Matic 800! \nPlease select (1)(2)or(3) from the menu options: ");
    }
    public void displayMainMenu(){
        System.out.println(
                "(1) Display Vending Machine Items\n" +
                "(2) Purchase\n" +
                "(3) Exit\n");
    }

    public void displayPurchaseMenu(){
        System.out.println(
                "(1) Feed Money\n"+
                "(2) Select Product\n"+
                "(3) Finish Transaction\n");
    }

    public void displayItems() throws MalformedItemException {
        ItemBuilder itemList = new ItemBuilder();

        System.out.println(itemList.buildItem());
    }


}
