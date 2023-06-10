package com.techelevator;

public class Candy extends Item {
    private String sound = "Munch Munch, Yum!";
    private String type = "Candy";

    public Candy(String key, String name, String price) {
        super(key, name, price);
    }
}
