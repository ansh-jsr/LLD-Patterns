package creational.factory.simplefactory.notification;

public class Main {
    public static void main(String[] args){
        OrderService os=new OrderService();
        os.sendNotification();
        DeliveryService ds=new DeliveryService();
        ds.sendNotification();
    }
}
