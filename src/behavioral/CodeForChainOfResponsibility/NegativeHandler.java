package behavioral.CodeForChainOfResponsibility;

public class NegativeHandler extends Handler{
    
    public NegativeHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.state < 0){
            System.out.println("All positive numbers are handle here !!");
        }
        else if(next != null){
            System.out.println("Not a positive number, hence delegating forward !!");
            next.handleRequest(request);
        }
    }
}
