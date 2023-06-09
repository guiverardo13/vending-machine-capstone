package com.techelevator;

import java.util.Map;

public class Application {

	// created a field for the User Interface
	private UI userInput = new UI();

	public static void main(String[] args) throws MalformedItemException {

		Application vendingMachine = new Application();
		vendingMachine.run();
	}

	private void run() throws MalformedItemException {
		// display welcome
		userInput.displayWelcome();
		// display main menu
		userInput.displayMainMenu();
		// get userInput
		String answer = userInput.getUserInput();

		if (answer.equals(" ")) {
			System.out.println("Not a valid selection. Please try again!");
		}
		// still need to test for other inputs

			if (answer.contains("1")) {
				userInput.displayItems();

			} else if (answer.contains("2")) {
				System.out.println("purchase");
				// call display purchase menu

			} else if (answer.contains("3")) {
				System.out.println("exit");
				// exit program
			}
		}
	}







