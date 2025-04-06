package com.bootlabs.traditional;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f using PayPal.\n", amount);
    }
}