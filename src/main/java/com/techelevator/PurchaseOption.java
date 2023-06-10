package com.techelevator;

import java.util.LinkedHashMap;
import java.util.Map;

public class PurchaseOption {

    private Menu menu;
    private SlotMapClass slotMapClass;
    private Map<String, Slot> slotMap = new LinkedHashMap<>();
    private UI ui;
    private int balance; //current money provided (in whole dollar amounts/pennies**)
    private int changeTotal;
    private boolean isValidInput = false;


    public  PurchaseOption() {
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
    public void selectProduct() {
        slotMap = slotMapClass.getSlotMap();
        String price;
        String userInput;
        // make do while loop to check valid input
       do {
           userInput = ui.getUserInput();
               if(slotMap.containsKey(userInput)){
                   isValidInput = true;
               } else {
                   ui.displayIncorrect();
               }

       } while (!isValidInput);
       price = slotMap.get(userInput).currentItem.getPrice();
       Integer priceI = Integer.parseInt(price.replace(".", ""));
       priceI = priceI * 100;
       if(balance >= priceI){
           if(slotMap.get(userInput).inventory > 0){
               balance -= priceI;
               slotMapClass.takeOneOut(userInput);
           }
           ui.displayNotEnoughFunds();
       }
    }


    //////Option 3) Finish Transaction
    public void finishTransaction() {
    }
    ///returns to last menu. somehow.


    public int getBalance() {
        return balance;
    }
}





