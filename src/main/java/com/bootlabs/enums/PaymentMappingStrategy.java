package com.bootlabs.enums;

import java.util.Arrays;

public enum PaymentMappingStrategy {
    CREDIT_CARD("cc") {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Credit Card.\n", amount);
        }
    },
    PAYPAL("paypal") {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using PayPal.\n", amount);
        }
    },
    BITCOIN("btc") {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Bitcoin.\n", amount);
        }
    };

    private final String code;

    PaymentMappingStrategy(String code) {
        this.code = code;
    }

    public abstract void pay(double amount);

    public static PaymentMappingStrategy fromCode(String code) {
        return Arrays.stream(values()).filter(value -> value.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown payment code: " + code));
    }
}