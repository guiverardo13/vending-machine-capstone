package com.techelevator;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
	private final Map<String, Slot> startingMap = new LinkedHashMap<>();

	public static void main(String[] args) throws MalformedItemException {


		SlotMapClass slotMap = new SlotMapClass();//this should set up new machine
		UI ui = new UI();
		Menu menu = new Menu();

		menu.displayMain(); // and get user input here to use in loop <<<<MAYBE NO LOOP IN MAIN APP..idk
	}


}





