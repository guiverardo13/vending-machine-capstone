package com.techelevator;
import java.util.Map;

public class PurchaseOption {

    private SlotMapClass slotMapClass = new SlotMapClass();
    private Map<String, Slot> slotMap = slotMapClass.getSlotMap();
    UI ui;
    private int balance; //in pennies
    private int changeTotal;
    private boolean isValidInput = false;
    private String userInput;

    public PurchaseOption() throws MalformedItemException {
    }


    // if user input equals a valid key code, call dispense method from UI.
        // dispense method prints name, cost and remaining balance and displays sound.


        ////do while !=3 && while !valid input number
        ////do{sout the menu option from ui class
        //       take customer choices as numbers}




    //////Option 1) feed money:
    public void insertCash() {
        System.out.println(balance); //this shows pennies
        // we also should add a print to file
    }


    //////Option 2) Select Item
    public void selectProduct() throws MalformedItemException {
        ui = new UI();
//        slotMap = slotMapClass.getSlotMap();
        String price;
        // make do while loop to check valid input
       do {
           userInput = ui.getUserInput();
               if(slotMap.containsKey(userInput)){
                   isValidInput = true;
                   System.out.println("test1");
               } else {
                   ui.displayIncorrect();
                   System.out.println("test2");
               }
       } while (!isValidInput);

       System.out.println("test3");

       price = slotMap.get(userInput).currentItem.getPrice();
       Integer priceI = Integer.parseInt(price.replace(".", ""));

        System.out.println(priceI + "<-----Test");
       if(balance >= priceI){
           if(slotMap.get(userInput).inventory > 0){
               balance -= priceI;
               slotMapClass.takeOneOut(userInput);
               System.out.println("test4");
           } else {
           ui.displayNotEnoughFunds();
           System.out.println("test5");}
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





