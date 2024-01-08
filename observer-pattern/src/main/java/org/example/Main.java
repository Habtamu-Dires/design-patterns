package org.example;

public class Main {
    public static void main(String[] args) {
       PaymentManger paymentManger = new PaymentManger();

//       paymentManger.registerPaymentListener(() -> System.out.println(":)"));

       PaymentListener p1 = new NotificationManager();
       paymentManger.registerPaymentListener(p1);

       PaymentListener p2 = new PaymentEventLogger();
       paymentManger.registerPaymentListener(p2);

       paymentManger.pay();

       paymentManger.unregisterPaymentListener(p1);

       paymentManger.pay();
    }
}

/**
 * case: we have a subject (notifier, the object that creates the events and tells the others)
  and a listener(Observer, that listens the event created by the subject).
 * Observer patterns solve such problems by:
 * 1. decouple notifier and observer
 * 2. being able to register or unregister listeners (observers) dynamically
 */