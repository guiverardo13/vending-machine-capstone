package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slot {

    private String pathName = "vendingmachine.csv";
    //SlotMap <String(SlotKEy),Map<Item , int (quantity)
    private String[] lineParts;

    public String buildItem() throws MalformedItemException {

        SlotMap map = new SlotMap();
        Item currentItem = null;
        File fileName = new File(pathName);
        SlotMap itemList = null;


        try (Scanner fileReader = new Scanner(fileName)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                currentItem = parseLine(line);

                System.out.println(currentItem.getKeyCode() + " " + currentItem.getName() + " " + currentItem.getPrice());
            }

        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
        return "";
    }
    private Item parseLine(String line) {
        lineParts = line.split("\\|");
        String key = lineParts[0];
        String name = lineParts[1];
        double price = Double.parseDouble(lineParts[2]);
        String type = lineParts[3];

        if (type.equals("Chip")){
            return new Chip(key, name, price);
        } else if (type.equals("Drink")){
            return new Drink(key, name, price);
        } else if (type.equals("Gum")){
            return new Gum(key, name, price);
        } else if (type.equals("Candy")){
            return new Candy(key, name, price);
        } else {return null;}


    }
    public String getCode(){
        return lineParts[0];
    }
}
               // map.addItem(currentSlot);//////<------- might want to loop and add to a different MAP outside of scanner
