package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaymentManger implements PaymentSubject{

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

//    private final NotificationManager notificationManager = new NotificationManager();
//    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();

    public void pay(){
        //do something
//        notificationManager.sendNotification();
//        paymentEventLogger.logEvent();

//        PaymentEvent e = new PaymentEvent(); // any event you want to send to listener.
        //what if we to send the object itself. --> use interface(PaymentSubject) as shown
        PaymentEvent e = new PaymentEvent(this);
        paymentListeners.forEach(p -> p.paymentMade(e));
    }

    public void registerPaymentListener(PaymentListener p){
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p){
        paymentListeners.remove(p);
    }
}
