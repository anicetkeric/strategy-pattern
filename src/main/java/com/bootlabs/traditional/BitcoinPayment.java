package com.bootlabs.traditional;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f using Bitcoin.\n", amount);
    }
}