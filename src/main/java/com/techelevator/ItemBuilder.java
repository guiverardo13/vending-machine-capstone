package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ItemBuilder {

    private String pathName = "vendingmachine.csv";

    public ItemMap buildItem() throws MalformedItemException {

        ItemMap itemMap = new ItemMap();

        File inventory = new File(pathName);

        try (Scanner fileReader = new Scanner(inventory)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Item currentItem = parseLine(line);
                itemMap.addItem(currentItem);
            }

        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
        return itemMap;
    }

    private Item parseLine(String line) {
        String[] lineParts = line.split("\\|");

        String itemKey = lineParts[0];
        String name = lineParts[1];
        int price = Integer.parseInt(lineParts[2]);
        String type = lineParts[3];

        return new Item(itemKey, name, price, type);
    }
}
