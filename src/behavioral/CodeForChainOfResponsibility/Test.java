package behavioral.CodeForChainOfResponsibility;

public class Test {
    
    public static void main(String[] args) {
        
        Handler handler1 = new PositiveHandler(null);
        Handler handler2 = new ZeroHandler(handler1);
        Handler handler3 = new NegativeHandler(handler2);

        Request req = new Request();
        req.state = 10;

        handler3.handleRequest(req);
    }
}