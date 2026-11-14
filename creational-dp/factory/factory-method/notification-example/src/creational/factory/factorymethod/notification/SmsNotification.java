package creational.factory.factorymethod.notification;

public class SmsNotification implements Notification {
    public void send(){
        System.out.println("Sending Sms");
    }
}
