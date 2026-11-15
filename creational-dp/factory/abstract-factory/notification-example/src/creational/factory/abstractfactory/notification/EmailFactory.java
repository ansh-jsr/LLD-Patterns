package creational.factory.abstractfactory.notification;

public class EmailFactory implements NotificationFactory{
    public Notification create(){
        return new EmailNotification();
    }
}
