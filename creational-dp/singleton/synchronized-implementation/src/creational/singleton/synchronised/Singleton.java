package creational.singleton.synchronised;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Object created");
    }
    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
