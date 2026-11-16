package creational.singleton.eager;

public class Singleton {
    private static Singleton instance=new Singleton();

    private Singleton(){
        System.out.println("Object created");
    }
    public static Singleton getInstance(){
        return instance;
    }
}
