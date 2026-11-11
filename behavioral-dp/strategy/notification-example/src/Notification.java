public abstract class Notification {
    CompressionStrategy compressionStrategy;
    EncryptionStrategy encryptionStrategy;

    public Notification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
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
