package com.techelevator;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
	private final Map<String, Slot> startingMap = new LinkedHashMap<>();
	public Application(){
	}

	public static void main(String[] args) throws MalformedItemException {
		do {
			SlotMapClass slotMap = new SlotMapClass("");//this should set up new machine
			UI ui = new UI();
			Menu menu = new Menu();
			ui.displayWelcome();
			menu.displaysMain();
		}while (true);
	}
}





