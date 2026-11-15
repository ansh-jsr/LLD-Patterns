package creational.factory.abstractfactory.notification;

public class SmsFactory implements NotificationFactory{
    public Notification create(){
        return new SmsNotification();
    }
}
