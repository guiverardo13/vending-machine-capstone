package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item newItem){
        itemList.add(newItem);
    }
    public List<Item> getItemList() {
        return new ArrayList<>(itemList); // this creates a copy of our list
    }
}
