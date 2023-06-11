package com.techelevator;

public class Slot {

    private final int STARTING_INVENTORY = 5;
    public int inventory;
    private String[] lineParts;
    public Item currentItem;
    private String sound;

    public Slot(String line) {
        lineParts = line.split("\\|");
        String key = lineParts[0];
        String name = lineParts[1];
        String price = lineParts[2];
        String type = lineParts[3];

        if (type.equals("Chip")) {
            sound = "\"Crunch Crunch, Yum!\"";
            currentItem = new Chip(key, name, price, type, sound);
        } else if (type.equals("Drink")) {
            sound  = "\"Glug Glug, Yum!\"";
            currentItem = new Drink(key, name, price, type, sound);
        } else if (type.equals("Gum")) {
            sound = "\"Chew Chew, Yum!\"";
            currentItem = new Gum(key, name, price, type, sound);
        } else if (type.equals("Candy")) {
            sound = "\"Munch Munch, Yum!\"";
            currentItem = new Candy(key, name, price, type, sound);
        }
            inventory = STARTING_INVENTORY;

    }
//    public String[] getLineParts(){
//        return lineParts;
//    }

}
