package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ItemBuilder {

    private String pathName = "vendingmachine.csv";

    public ItemList buildItem() throws MalformedItemException {

        ItemList itemList = new ItemList();

        File itemFullStock = new File(pathName);

        try (Scanner fileReader = new Scanner(itemFullStock)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Item currentItem = parseLine(line);
                itemList.addItem(currentItem);
            }

        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
        return itemList;
    }

    private Item parseLine(String line) {
        String[] lineParts = line.split("\\|");

        String itemKey = lineParts[0];
        String name = lineParts[1];
        Double price = Double.parseDouble(lineParts[2]);
        String type = lineParts[3];

        return new Item(itemKey,name,price,type);
    }
}
