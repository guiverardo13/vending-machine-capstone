package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ItemBuilder {

    private String pathName = "vendingmachine.csv";

    public String buildItem() throws MalformedItemException {

        ItemMap map = new ItemMap();
        Item currentItem = null;
        File fileName = new File(pathName);
        ItemMap itemList = null;

        try (Scanner fileReader = new Scanner(fileName)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                currentItem = parseLine(line);
                map.addItem(currentItem);

                System.out.println(currentItem.getKeyCode() + " " + currentItem.getName() + " " + currentItem.getPrice());
            }

        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
        return "";
    }
    private Item parseLine(String line) {
        String[] lineParts = line.split("\\|");
        String key = lineParts[0];
        String name = lineParts[1];
        double price = Double.parseDouble(lineParts[2]);

        return new Item(key, name, price);
    }
}
