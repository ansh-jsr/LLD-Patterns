package creational.factory.factorymethod.notification;

public class Main {
    public static void main(String[] args){
        OrderService os=new OrderService();
        os.sendNotification();
    }
}
