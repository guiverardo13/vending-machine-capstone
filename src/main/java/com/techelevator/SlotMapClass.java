package com.techelevator;

import java.util.LinkedHashMap;
import java.util.Scanner; //new
import java.io.File; //new
import java.io.FileNotFoundException; //new
import java.util.Map;

public class SlotMapClass {
    ////<KEYCODE, SLOT>
    String pathName;
    String line;
    static Map<String, Slot> slotMap = new LinkedHashMap<>();
    ///CONSTRUCTORS
    public SlotMapClass(String falseString) throws MalformedItemException {
        this.setUpMachine();
    }
    public SlotMapClass() {
    }

    private void setUpMachine() throws MalformedItemException {
        pathName = "vendingmachine.csv";

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
    public Map<String, Slot> getSlotMap(){
       return new LinkedHashMap<>(slotMap);
    } // this creates a copy of our map
    //METHOD
    public void takeOneOut(String userInput) {
        slotMap.get(userInput).inventory -= 1;
    }
}







//the reason it wasn't working is I had to move the setUpMachine method into the constructor. Following this, IntelliJ had me move things into other constructors in other classes. Which also made them have to throw the Exception
