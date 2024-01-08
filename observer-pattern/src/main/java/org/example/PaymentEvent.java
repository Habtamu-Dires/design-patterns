package org.example;

public class PaymentEvent {
    // any details
    //example one of the detail could be the payment object itself.
    private final PaymentSubject paymentSubject;

    public PaymentEvent(PaymentSubject paymentSubject) {
        this.paymentSubject = paymentSubject;
    }

}
