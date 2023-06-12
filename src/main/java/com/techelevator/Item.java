package com.techelevator;

// this class will create item
// Use it for: display it to the customer, creating the log and sales report
public class Item {

    private String name;
    private String type;
    private String price;
    private String keyCode;
    private String sound;

    public Item(String keyCode, String name, String price, String type, String sound) {
        this.name = name;
        this.price = price;
        this.keyCode = keyCode;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {return this.name;}
    public String getType() {return type;}
    public String getPrice() {
        return price;
    }
    public String getKeyCode() {
        return keyCode;
    }
    public String getSound(){
        return sound;
    }

}

