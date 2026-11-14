package creational.factory.simplefactory.notification;

public class SmsNotification implements Notification {

    public void send(){
        System.out.println("Sending Sms");
    }
}
