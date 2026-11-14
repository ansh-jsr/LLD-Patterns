package creational.factory.factorymethod.notification;

public class OrderService {
   public void sendNotification(){
       Notification notification=new EmailNotification();
       notification.send();
   }
}
