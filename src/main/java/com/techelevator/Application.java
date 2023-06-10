package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Application {
	private final Map<String, Slot> startingMap = new HashMap<>();

	public static void main(String[] args) throws MalformedItemException {

	//////while(true)
		SlotMapClass slotMap = new SlotMapClass();
		UI ui = new UI();
		Menu menu = new Menu();

		slotMap.setUpMachine();
		menu.displayMain();

	}


}






