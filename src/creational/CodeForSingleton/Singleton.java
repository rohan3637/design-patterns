package creational.CodeForSingleton;

public class Singleton {

    private static Singleton inst;
    
    private Singleton(){
    }

    public static Singleton getSingleInstance(){
        if(inst == null){
            synchronized(Singleton.class){
                if(inst == null) inst = new Singleton();
            }
        } 
        return inst;
    }
}
