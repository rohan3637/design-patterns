package structural.CodeForProxy;

public class Test {
    
    public static void main(String[] args){

        ISomeWork iSomeWork = new CacheProxyWork();

        System.out.println(iSomeWork.fun2(7, 21));
        System.out.println(iSomeWork.fun1(4));
    }
}
