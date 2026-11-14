package creational.factory.simplefactory.notification;

public class OrderService {

    public void sendNotification(){
        Notification notification=NotificationFactory.sendNotification("EMAIL");
        notification.send();

    }
}
