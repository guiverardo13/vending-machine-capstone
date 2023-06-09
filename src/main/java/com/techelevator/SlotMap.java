package com.techelevator;


import java.util.HashMap;
import java.util.Map;

public class SlotMap {
////<keycode , SLOT>
    private Map<String, Slot> slotMap = new HashMap<>();

    public void addItem(Slot newSlot){
        slotMap.put(newSlot.getCode(), newSlot); //Should create a map of the String of the KEYCODE and it's SLot
    }
    public Map<String, Item> getSlotMap() {
        return slotMap;} // this creates a copy of our list
    }



