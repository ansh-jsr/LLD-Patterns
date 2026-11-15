package creational.factory.abstractfactory.notification;

public class DeliveryService {
   public void sendNotification(){
       NotificationFactory factory=new SmsFactory();
       Notification notification=factory.create();
       notification.send();

   }
}
