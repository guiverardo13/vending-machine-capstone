package com.techelevator;
import java.util.Map;

public class PurchaseOption {

    private SlotMapClass slotMapClass = new SlotMapClass();
    private Map<String, Slot> slotMap = slotMapClass.getSlotMap();
    private CoinsAndBills coinsAndBills = new CoinsAndBills();
    public int balance; //in pennies
    private int changeTotal;
    private boolean isValidInput = false;
    private String userInput;
    UI ui = new UI();

    public PurchaseOption() throws MalformedItemException {

    }


    // if user input equals a valid key code, call dispense method from UI.
    // dispense method prints name, cost and remaining balance and displays sound.


    ////do while !=3 && while !valid input number
    ////do{sout the menu option from ui class
    //       take customer choices as numbers}


    //////Option 1) feed money:
    public void insertCash() {
        ui.displayFeedMoneyMenu();
        String userInput = ui.getUserInput();
        System.out.println(balance);
        System.out.println("test");
        switch (userInput){
            case "1":
                this.balance += 100; //dollar bill
                break;
            case "5":
                this.balance += 500; // five dollar bill
                break;
            case "10":
                balance += 1000; //..etc
                break;
            case "20":
                balance += 2000;
                break;
            case "50":
                balance += 5000;
                break;
            case "100":
                balance += 10000;
                break;
            default:
                ui.displayBillError();
                break;
        }
        System.out.println(balance);
    }
    
    //////Option 2) Select Item
    public void selectProduct() throws MalformedItemException {

//        slotMap = slotMapClass.getSlotMap();
        String price;
        // make do while loop to check valid input
        do {
            userInput = ui.getUserInput();
            if (slotMap.containsKey(userInput)) {
                isValidInput = true;
                System.out.println("test1");
            } else {
                ui.displayIncorrect();
                System.out.println("test2");
            }
        } while (!isValidInput);

        System.out.println("test3");

        price = slotMap.get(userInput).currentItem.getPrice();
        Integer priceI = Integer.parseInt(price.replace(".", ""));

        System.out.println(priceI + "<-----TestPRICE");
        System.out.println(slotMap.get(userInput).inventory + "<----testSTOCK");
        System.out.println(balance + "<----testBALANCE");
        if (balance >= priceI) {
            if (slotMap.get(userInput).inventory > 0) {
                balance -= priceI;
                System.out.println(balance + "<----testBALANCE");
                slotMapClass.takeOneOut(userInput);
                System.out.println(slotMap.get(userInput).inventory + "<----testSTOCK");
                System.out.println("test4");
            } else if (balance < priceI) {
                ui.displayNotEnoughFunds();
                System.out.println("test5");
            } else if (slotMap.get(userInput).inventory <= 0) {
                ui.displaySoldOut();
            }
        }

    }

    //////Option 3) Finish Transaction
    public void finishTransaction () {
    }
        ///returns to last menu. somehow.


    public int getBalance () {
        return balance;
    }

}





