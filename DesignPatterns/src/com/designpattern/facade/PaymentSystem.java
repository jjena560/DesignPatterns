package com.designpattern.facade;

public class PaymentSystem {
    public void makePayment(String paymentMethod) {
        System.out.print("Payment made through- " + paymentMethod);
    }
}