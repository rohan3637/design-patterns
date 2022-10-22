package structural.CodeForFacade;

public class Facade {

    public static void work() {
        A a = new A();
        B b = new B();
        C c = new C();

        int x = a.fun1();
        int y = a.fun2(x);

        String a1 = b.fun3();
        String a2 = b.fun4();

        c.fun5(y, a1);
        c.fun6(a2);
    }
}
