package behavioral.observer.generic;

import java.util.ArrayList;

public class Channel {
    String title;
    String videoFile;
    ArrayList<Subscriber> subscriberList=new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void notifySubscribers(){
        for(Subscriber subscriber:subscriberList){
            subscriber.update(this);
        }
    }
    public String getVideoFile(){
        return videoFile;
    }

    public String getTitle(){
        return title;
    }
    public void uploadVideo(String title,String videoFile){
        this.title=title;
        this.videoFile=videoFile;
        System.out.println("Video has been uploaded, title: "+ title);
        notifySubscribers();
        
    }
}
