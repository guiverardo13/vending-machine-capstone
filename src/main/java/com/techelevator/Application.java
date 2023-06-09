package com.techelevator;

import java.util.Map;

public class Application {

	// created a field for the User Interface
	private final Menu menu = new Menu();

	public static void main(String[] args) throws MalformedItemException {

		Application vendingMachine = new Application();
		vendingMachine.run();
	}

	private void run() throws MalformedItemException {

		menu.MainMenuOptions();

	}

	}







