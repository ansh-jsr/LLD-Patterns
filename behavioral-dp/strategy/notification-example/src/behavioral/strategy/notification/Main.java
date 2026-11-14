package behavioral.strategy.notification;

public class Main {
    public static void main(String[] args){
        StrategyNotification email=new Email(new AESEncryption(),new ZIP());
        email.compress();
        email.encrypt();

        StrategyNotification sms=new Sms(new AESEncryption(),new GZIP());
        sms.encrypt();
        sms.compress();

        StrategyNotification push=new Push(new RSAEncryption(),new ZIP());
        push.encrypt();
        push.compress();
    }
}
