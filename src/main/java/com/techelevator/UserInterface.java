package com.techelevator;

import java.util.Scanner;

public class UserInterface {

    private final Scanner userInput = new Scanner(System.in);

    // display main menu
    public String getMainMenuAnswer(){
        return userInput.nextLine();
    }
}


