package creational.factory.abstractfactory.notification;

public class SmsNotification implements Notification{
    public void send(){
        System.out.println("Sms Notification");
    }
}
