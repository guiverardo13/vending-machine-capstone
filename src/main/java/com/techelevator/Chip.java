package com.techelevator;

public class Chip extends Item {
    private String sound = "Crunch Crunch, Yum!";
    private String type = "Chip";

    public Chip(String key, String name, String price, String type, String sound) {
        super(key, name, price, type, sound);
    }

}
