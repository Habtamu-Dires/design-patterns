package org.example;

public class PaymentEventLogger implements PaymentListener{

    @Override
    public void paymentMade(PaymentEvent e) {
        // e is information /event from the subject
        logEvent();
    }

    private void logEvent(){
        System.out.println("Payment received");
    }
}
