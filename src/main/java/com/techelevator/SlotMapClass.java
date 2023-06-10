package com.techelevator;

import java.util.Scanner; //new
import java.io.File; //new
import java.io.FileNotFoundException; //new
import java.util.HashMap;
import java.util.Map;

public class SlotMapClass {
////<keycode , SLOT>

    public SlotMapClass() {

    }

    private String pathName = "vendingmachine.csv";

    public Map<String, Slot> slotMap = new HashMap<>();
    public String line = null;

    public void setUpMachine() throws MalformedItemException {
        File filename = new File(pathName);

        try (Scanner fileReader = new Scanner(filename)) {
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                Slot slot = new Slot(line);
                System.out.println(slot.currentItem.getKeyCode());
                slotMap.put(slot.currentItem.getKeyCode(), slot);
            }


        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
    }

    //GETTER
    public Map<String, Slot> getSlotMap() {
        return new HashMap<>(slotMap);
    } // this creates a copy of our list

    //pass userinput from ui
    public void takeOneOut(String userInput) {
        slotMap.get(userInput).inventory -= 1;
    }
}

//    public void printStock(){
//        for (String key : slotMap.keySet()){
//            String slotCode = slotMap.get(key).currentItem.getKeyCode();
//            String choiceName;
//            String price;
//
//            System.out.println(slotMap.get(key).currentItem.getName());
//        }

