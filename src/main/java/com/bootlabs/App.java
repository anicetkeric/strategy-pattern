package com.bootlabs;

import com.bootlabs.enums.PaymentMappingStrategy;
import com.bootlabs.enums.PaymentStrategy;
import com.bootlabs.traditional.BitcoinPayment;
import com.bootlabs.traditional.CreditCardPayment;
import com.bootlabs.traditional.PayPalPayment;
import com.bootlabs.traditional.PaymentContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        // Traditional Approach
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.checkout(100);

        context.setStrategy(new PayPalPayment());
        context.checkout(250);

        context.setStrategy(new BitcoinPayment());
        context.checkout(500);

        // Enum Approach
        PaymentStrategy.CREDIT_CARD.pay(100);
        PaymentStrategy.PAYPAL.pay(250);
        PaymentStrategy.BITCOIN.pay(500);


        // Enum Mapping Approach
        PaymentMappingStrategy.fromCode("cc").pay(100);
        PaymentMappingStrategy.fromCode("paypal").pay(250);
        PaymentMappingStrategy.fromCode("btc").pay(500);
    }
}
