package creational.CodeForSingleton;

public class Test {
     
    public static void main(String[] args){

        Singleton singleton1 = Singleton.getSingleInstance();
        Singleton singleton2 = Singleton.getSingleInstance();
        
        System.out.println(singleton1 == singleton2);
    }
}
