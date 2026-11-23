package behavioral.observer.yt;

import java.util.ArrayList;
import java.util.List;

public class YtChannel {
    String videoTitle;
    String videoFile;
    List<YtSubscriber> subscriberList=new ArrayList<>();

    public String getVideoTitle() {
        return videoTitle;
    }
    public String getVideoFile(){
        return videoFile;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void subscribe(YtSubscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void notifySubscribers(){
        for(YtSubscriber subscriber:subscriberList){
            subscriber.update(this);
        }
    }
    public void uploadVideo(String videoTitle,String videoFile){
        this.videoTitle=videoTitle;
        this.videoFile=videoFile;
        System.out.println(videoTitle + " has been uploaded");
        notifySubscribers();
    }
}
