package org.example;

public class NotificationManager implements PaymentListener {


    @Override
    public void paymentMade(PaymentEvent e) {
        //we can use e as information from the subject
        sendNotification();
    }

    private void sendNotification(){
        System.out.println("Notification sent");
    }

}
