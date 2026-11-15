package creational.factory.factorymethod.notification;

public class OrderService {
   public void sendNotification(){
       NotificationFactory factory=new SmsFactory();
       Notification notification=factory.createNotification();
       notification.send();
   }
}
