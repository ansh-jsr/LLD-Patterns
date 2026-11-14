package creational.factory.factorymethod.notification;

public class EmailFactory implements NotificationFactory {
    public Notification createNotification(){
        return new EmailNotification();
    }
}
