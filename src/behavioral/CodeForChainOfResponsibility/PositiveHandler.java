package behavioral.CodeForChainOfResponsibility;

public class PositiveHandler extends Handler {

    public PositiveHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.state > 0){
            System.out.println("All negative numbers are handle here !!");
        }
        else if(next != null){
            System.out.println("Not a negative number, hence delegating forward !!");
            next.handleRequest(request);
        }
    }
}
