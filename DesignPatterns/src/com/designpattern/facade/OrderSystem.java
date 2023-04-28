package com.designpattern.facade;

import java.util.Map;

public class OrderSystem {
//	InventorySystem factory =  new InventorySystem();
	public void createOrder(String itemName, int quantity) {
		Map<String, Integer> inventory;

		inventory = InventorySystem.getInventory();
		inventory.put(itemName, inventory.get(itemName) - quantity);
	}
}