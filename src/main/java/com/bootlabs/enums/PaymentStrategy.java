package com.bootlabs.enums;


public enum PaymentStrategy {

    CREDIT_CARD {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Credit Card.\n", amount);
        }
    },
    PAYPAL {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using PayPal.\n", amount);
        }
    },
    BITCOIN {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Bitcoin.\n", amount);
        }
    };

    public abstract void pay(double amount);
}