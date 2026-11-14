package behavioral.strategy.notification;

public class Email extends StrategyNotification {
    public Email(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("behavioral.strategy.notification.ZIP Compression");
    }
}
