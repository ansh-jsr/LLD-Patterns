package behavioral.strategy.notification;

public class ZIP implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("ZIP Compression");
    }
}
