package com.techelevator;

public class Application {

	// created a field for the User Interface
	private UserInterface ui = new UserInterface();

	public static void main(String[] args) {

		Application vendingMachine = new Application();
		vendingMachine.runMainMenu();
	}

	private void runMainMenu() {
		// we will run the main menu

		System.out.println("Welcome to Vendo-Matic 800!");
		System.out.println(" ");

		Menu mainMenu = new Menu();

		System.out.println("(" + "1" + ") " + mainMenu.getMAIN_MENU_DISPLAY_ITEMS());
		System.out.println("(" + "2" + ") " + mainMenu.getMAIN_MENU_PURCHASE());
		System.out.println("(" + "3" + ") " + mainMenu.getMAIN_MENU_EXIT());

		System.out.println(" ");
		System.out.println("Please enter 1, 2, or 3.");


		if (ui.getMainMenuAnswer().contains("1")) {
			//opens list of items
			ItemMap map = new ItemMap();
			System.out.println("Here is the list of items");
			System.out.println(map.getItemMap());
		} else if (ui.getMainMenuAnswer().contains("2")){
				System.out.println("here is purchase");
		}
					System.out.println("Here is the Purchase class");
		}
}







