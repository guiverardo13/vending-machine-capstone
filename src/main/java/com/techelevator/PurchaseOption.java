package com.techelevator;

import java.util.Map;

public class PurchaseOption {

    private Menu menu;
    private Slot item;
    private UI ui;
    private int balance = 0; //current money provided (in whole dollar amounts/pennies**)
    private int changeTotal;


    public PurchaseOption() {
        // if user input equals a valid key code, call dispense method from UI.
        // dispense method prints name, cost and remaining balance and displays sound.





        ////do while !=3 && while !valid input number
        ////do{sout the menu option from ui class
        //       take customer choices as numbers}
    }


    //////Option 1) feed money:
    public void insertCash(int dollars) {
        balance += dollars * 100; //this shows pennies
        // we also should add a print to file
    }


    //////Option 2) Select Item
    public String selectProduct(String keyCode) {
        Slot key = new Slot(keyCode);
        return key.currentItem.getKeyCode();
    }


    //////Option 3) Finish Transaction
    public void finishTransaction() {
    }
    ///returns to last menu. somehow.


    public int getBalance() {
        return balance;
    }


    public void dispenseItem() {
        // dispense prints item name, cost, and money remaining
        String itemName = item.currentItem.getName();
        int itemCost = Integer.parseInt(item.currentItem.getPrice());
        int remainingBalance = balance - itemCost;

        System.out.println(itemName + itemCost + remainingBalance);

        switch (item.currentItem.getType()) {
            case "Chip":
                System.out.println(item.currentItem.getSound());
                break;
            case "Candy":
                System.out.println(item.currentItem.getSound());
                break;
            case "Drink":
                System.out.println(item.currentItem.getSound());
                break;
            case "Gum":
                System.out.println(item.currentItem.getSound());
                break;
        }
    }
}
