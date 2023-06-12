package com.techelevator;

import java.io.IOException;

public class Application {
	public Application(){
	}

	public static void main(String[] args) throws MalformedItemException, IOException {
		do {
			 SlotMapClass slotMap = new SlotMapClass("");//this should set up new machine
			 UI ui = new UI();
			 Menu menu = new Menu();
//			 logger.createNewLocalFile();
			 ui.displayWelcome();
			 menu.displaysMain();
		}while (true);
	}
}





