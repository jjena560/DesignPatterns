package com.designpattern.facade;

//The Facade class
public class OnlineShoppingFacade {
 private InventorySystem inventorySystem;
 private OrderSystem orderSystem;
 private PaymentSystem paymentSystem;
 
 public OnlineShoppingFacade() {
     inventorySystem = new InventorySystem();
     orderSystem = new OrderSystem();
     paymentSystem = new PaymentSystem();
 }
 
 public void purchaseItem(String itemName, int quantity, String paymentMethod) {
     boolean itemAvailable = inventorySystem.checkItemAvailability(itemName, quantity);
     if (itemAvailable) {
         orderSystem.createOrder(itemName, quantity);
         paymentSystem.makePayment(paymentMethod);
         System.out.println("\norder Purchased.");
     } else {
         System.out.println("Sorry, the item is not available in the requested quantity.");
     }
 }
}