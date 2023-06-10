package com.techelevator;

public class Slot {

    private final int STARTING_INVENTORY = 5;
    public int inventory;
    private String[] lineParts;
    public Item currentItem;

    public Slot(String line) {
        lineParts = line.split("\\|");
        String key = lineParts[0];
        String name = lineParts[1];
        String price = lineParts[2];
        String type = lineParts[3];

        if (type.equals("Chip")) {
            currentItem = new Chip(key, name, price);
        } else if (type.equals("Drink")) {
            currentItem = new Drink(key, name, price);
        } else if (type.equals("Gum")) {
            currentItem = new Gum(key, name, price);
        } else if (type.equals("Candy")) {
            currentItem = new Candy(key, name, price);
        }
            inventory = STARTING_INVENTORY;

    }
//    public String[] getLineParts(){
//        return lineParts;
//    }

}
