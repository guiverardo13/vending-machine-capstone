package com.techelevator;

public class Purchase {
    private int balance = 0; //current money provided (in whole dollar amounts/pennies**)
    private int changeTotal;

    public void insertCash(int dollars){
        balance += dollars * 100; //this shows pennies

    }

    public String selectProduct(String keyCode){
        return "(this will some info about the product)"
    }

    public int getBalance(){
        return balance;
    }

    public void finishTransaction(){}



}
