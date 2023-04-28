package com.designpattern.facade;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
	static Map<String, Integer> inventory = new HashMap<>();
	
	
	InventorySystem() {
		inventory.put("Shirt", 4);
		inventory.put("Pants", 14);
		inventory.put("Shoes", 50);
		inventory.put("Pen", 32);
		
	}
    public boolean checkItemAvailability(String itemName, int quantity) {
        return inventory.get(itemName) > 0;
    }
    
    public static Map<String, Integer> getInventory() {
        return inventory;
    }
}
