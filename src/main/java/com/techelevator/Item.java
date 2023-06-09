package com.techelevator;

// this class will create item
// Use it for: display it to the customer, creating the log and sales report
public abstract class Item {

    private String name;
    private String type;
    private double price;
    private String keyCode;
    private String sound;

    public Item(String keyCode, String name, double price) {
        this.name = name;
        this.price = price;
        this.keyCode = keyCode;
    }

    public String getName() {return this.name;}

    public String getType() {return type;}

    public double getPrice() {
        return price;
    }

    public String getKeyCode() {
        return keyCode;
    }
    public String getSound(){
        return sound;
    }

}

//TRASH:
//    public Item(String keyCode, String name, double price, String type){
//        this.keyCode = keyCode;
//        this.name = name;
//        this.price = price;
//        this.type = type;
//    }
