package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ItemBuilder {

    private String pathName = "vendingmachine.csv";

    public Item buildItem() throws MalformedItemException {

        File itemFullStock = new File(pathName);

        try (Scanner fileReader = new Scanner(itemFullStock)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
            }

        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
        // return item  Item item = new Item(...);
    }

    private ItemList parseLine(String line) {
        String[] lineParts = line.split("\\|");

        String itemKey = lineParts[0];
        String name = lineParts[1];
        Double price = Double.parseDouble(lineParts[2]);
        String type = lineParts[3];
    }
}
