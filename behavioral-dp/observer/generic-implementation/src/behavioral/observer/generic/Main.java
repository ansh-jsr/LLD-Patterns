package behavioral.observer.generic;

public class Main {
    public static void main(String[] args){
        Channel channel=new Channel();
        YtSubscriber subscriber1=new YtSubscriber();
        YtSubscriber subscriber2=new YtSubscriber();

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.uploadVideo("Generic implementation","cdir");
        channel.uploadVideo("Further implementation","ddir");

    }
}
