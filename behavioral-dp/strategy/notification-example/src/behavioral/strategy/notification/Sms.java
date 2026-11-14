package behavioral.strategy.notification;

public class Sms extends StrategyNotification {
    public Sms(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send(){
        System.out.println("Sending SMS");
    }
}
