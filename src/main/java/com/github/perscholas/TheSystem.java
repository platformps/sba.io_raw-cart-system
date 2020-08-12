package com.github.perscholas;


import java.util.HashMap;
import java.util.Map;

public abstract class TheSystem {
    private HashMap<String, Item> itemCollection;

    TheSystem() {
        itemCollection = new HashMap<>();
    }

    public Boolean checkAvailability(Item item) {
        return null;
    }

    public Boolean add(Item item) {
        return null;
    }

    public Item remove(String itemName) {
        return null;
    }

    public abstract void display();

    public abstract Map<String, Item> getItemCollection();

}
