package com.techelevator;


import java.util.HashMap;
import java.util.Map;

public class ItemMap {

    private Map<String, Item> itemMap = new HashMap<>();

    public void addItem(Item newItem){
        itemMap.put(newItem.getKeyCode(), newItem);
    }
    public Map<String, Item> getItemMap() {
        return new HashMap();// this creates a copy of our list
    }

}
