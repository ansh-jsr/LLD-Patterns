package behavioral.observer.yt;

public class YtSubscriber {
    private String name;
    private int id;

    public YtSubscriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void update(YtChannel channel){
        System.out.println("YtChannel uploaded a new video: "+channel.getVideoTitle()+" video file: "+channel.getVideoFile()+" received by "+name);
    }
}
