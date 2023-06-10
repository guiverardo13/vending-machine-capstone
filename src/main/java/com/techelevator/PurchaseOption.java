package com.techelevator;

public class PurchaseOption {



    UI ui = new UI();
    private int balance = 0; //current money provided (in whole dollar amounts/pennies**)
    private int changeTotal;

    public PurchaseOption() throws MalformedItemException {

        // if user input equals a valid key code, call dispense method from UI.


        }
        









    ////do while !=3 && while !valid input number
    ////do{sout the menu option from ui class
    //       take customer choices as numbers}





//////Option 1) feed money:
    public void insertCash(int dollars){
        balance += dollars * 100; //this shows pennies




    }
//////Option 2) Select Item
    public String selectProduct(String keyCode){
        return "(valid key code)";
    }
//////Option 3) Finish Transaction
    public void finishTransaction(){}
        ///returns to last menu. somehow.


    public int getBalance(){
        return balance;
    }

    public String validKeyCode(){

        return null;
    }



}
