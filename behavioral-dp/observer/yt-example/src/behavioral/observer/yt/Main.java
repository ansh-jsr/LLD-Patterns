package behavioral.observer.yt;

public class Main {
    public static void main(String[] args){
        YtSubscriber subscriber1=new YtSubscriber(1,"Naman");
        YtSubscriber subscriber2=new YtSubscriber(2,"Raman");
        YtSubscriber subscriber3=new YtSubscriber(3,"Aman");
        YtSubscriber subscriber4=new YtSubscriber(4,"Suman");

        YtChannel channel=new YtChannel();
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber4);
        channel.uploadVideo("Observer design pattern","mkdir1");
        channel.uploadVideo("Strategy design pattern","mkdir2");
    }
}
