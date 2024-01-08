package org.example;

@FunctionalInterface
public interface PaymentListener {
    void paymentMade(PaymentEvent e);
}
