package com.designpattern.facade;

public class TestFacade {
	public static void main(String[] args) {
        OnlineShoppingFacade facade = new OnlineShoppingFacade();
        facade.purchaseItem("Shirt", 2, "Credit Card");
    }
}
