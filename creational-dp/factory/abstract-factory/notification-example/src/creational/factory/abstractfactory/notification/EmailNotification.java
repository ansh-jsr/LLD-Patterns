package creational.factory.abstractfactory.notification;

public class EmailNotification implements Notification {
    public void send(){
        System.out.println("Email Notification");
    }
}
