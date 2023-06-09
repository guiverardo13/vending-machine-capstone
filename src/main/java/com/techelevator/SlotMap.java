package com.techelevator;

import java.util.Scanner; //new
import java.io.File; //new
import java.io.FileNotFoundException; //new
import java.util.HashMap;
import java.util.Map;

public class SlotMap {
////<keycode , SLOT>

    public SlotMap(){

    }

    private String pathName = "vendingmachine.csv";

    private Map<String, Slot> slotMap = new HashMap<>();
    public String line = null;

    
    public void setUpMachine() throws MalformedItemException {
        File filename = new File(pathName);

        try (Scanner fileReader = new Scanner(filename)) {
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                Slot slot = new Slot(line);

                slotMap.put(slot.currentItem.getKeyCode(), slot);
            }
        } catch (FileNotFoundException e) {
            throw new MalformedItemException();
        }
    }

    //GETTER
    public Map<String, Slot> getSlotMap() {
        return new HashMap<>(slotMap);} // this creates a copy of our list
    //pass userinput from ui
    public void takeOneOut(String userInput){
        slotMap.get(userInput).inventory -= 1;
    }
}
