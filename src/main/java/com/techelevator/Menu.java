package com.techelevator;

public class Menu {

    // Here I created final Strings for the menu options called main menu

    private final String MAIN_MENU_DISPLAY_ITEMS = "Display Vending Machine Items";
    private final String MAIN_MENU_PURCHASE = "Purchase";
    private final String MAIN_MENU_EXIT = "Exit";

    // Here I created sub menus for second menu inside Purchase

    private final String SUB_MENU_FEED_MONEY = "Feed Money";
    private final String SUB_MENU_SELECT_PRODUCT = "Select Product";
    private final String SUB_MENU_FINISH_TRANSACTION = "Finish Transaction";

    // Getters
    public String getMAIN_MENU_DISPLAY_ITEMS() {
        return MAIN_MENU_DISPLAY_ITEMS;
    }

    public String getMAIN_MENU_PURCHASE() {
        return MAIN_MENU_PURCHASE;
    }

    public String getMAIN_MENU_EXIT() {
        return MAIN_MENU_EXIT;
    }

    // These getters aren't in use yet
    public String getSUB_MENU_FEED_MONEY() {
        return SUB_MENU_FEED_MONEY;
    }

    public String getSUB_MENU_SELECT_PRODUCT() {
        return SUB_MENU_SELECT_PRODUCT;
    }

    public String getSUB_MENU_FINISH_TRANSACTION() {
        return SUB_MENU_FINISH_TRANSACTION;
    }
}

