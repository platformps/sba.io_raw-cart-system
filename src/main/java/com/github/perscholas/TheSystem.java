package com.github.perscholas;


import java.util.HashMap;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() {
        itemCollection = new HashMap<String, Item>();
        // Your code here
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
	}
	
	public Boolean add(Item item) {
		// Your code here
	}

	public Item remove(String itemName) {
		// Your code here
	}

	public abstract void display();
}
