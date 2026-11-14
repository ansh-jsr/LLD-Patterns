package behavioral.strategy.notification;

public class Push extends StrategyNotification {
    public Push(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send(){
        System.out.println("Sending SMS");
    }


}
