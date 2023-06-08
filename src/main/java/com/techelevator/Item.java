package com.techelevator;

// this class will create item
// Use it for: display it to the customer, creating the log and sales report
public class Item {

    private String name;
    private String type;
    private int price;
    private String keyCode;
    private int quantity = 5; // changed howMany to quantity

    public Item(String keyCode, String name, int price, String type) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.keyCode = keyCode;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public int getQuantity(){
        return quantity;
    }

    public void takeOne(){
       quantity = quantity - 1;
    }

    public boolean isAvailableToPurchase(){ // added boolean to check if item/product is available for sale
        return this.quantity >= 1;
    }


}
