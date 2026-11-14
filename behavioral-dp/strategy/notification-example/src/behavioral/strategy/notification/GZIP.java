package behavioral.strategy.notification;

public class GZIP implements CompressionStrategy {
    public void compress(){
        System.out.println("GZIP Compression");
    }
}
