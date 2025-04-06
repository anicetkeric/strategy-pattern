package com.bootlabs.traditional;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f using Credit Card.\n", amount);
    }
}
