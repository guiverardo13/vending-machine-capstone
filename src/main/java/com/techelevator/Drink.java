package com.techelevator;

public class Drink extends Item {
    private String sound = "Glug Glug, Yum!";
    private String type = "Drink";

    public Drink(String key, String name, String price, String type, String sound) {
        super(key, name, price, type, sound);
    }
}
