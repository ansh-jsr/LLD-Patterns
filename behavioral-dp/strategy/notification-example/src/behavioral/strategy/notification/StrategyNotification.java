package behavioral.strategy.notification;

public abstract class StrategyNotification {
    CompressionStrategy compressionStrategy;
    EncryptionStrategy encryptionStrategy;

    public StrategyNotification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
        this.encryptionStrategy = encryptionStrategy;
    }

    abstract void send();
    void encrypt(){
        encryptionStrategy.encrypt();
    }
    void compress(){
        compressionStrategy.compress();
    }

}
