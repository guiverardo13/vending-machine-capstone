package com.techelevator;

import java.util.List;

// this class will create item
// Use it for: display it to the customer, creating the log and sales report
public class Item {

    private String name;
    private String type;
    private double price;
    private String keyCode;

    public Item(String keyCode, String name, double price, String type) {
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

    public double getPrice() {
        return price;
    }

    public String getKeyCode() {
        return keyCode;
    }
}
