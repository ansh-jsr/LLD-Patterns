package behavioral.observer.generic;

public class YtSubscriber implements Subscriber{
    String name;
    int id;

    public void update(Channel channel){
        System.out.println("Video upload notification "+channel.getTitle()+" file name: "+channel.getVideoFile());
    }
}
