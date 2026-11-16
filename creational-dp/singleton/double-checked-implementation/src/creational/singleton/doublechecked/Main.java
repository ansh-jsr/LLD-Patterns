package creational.singleton.doublechecked;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Singleton[] instances=new Singleton[2];
        Thread t1=new Thread(()->{
            instances[0]=Singleton.getInstance();
        });
        Thread t2=new Thread(()->{
            instances[1]=Singleton.getInstance();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(instances[0]==instances[1]);


    }
}
