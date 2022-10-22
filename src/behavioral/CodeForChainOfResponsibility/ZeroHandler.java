package behavioral.CodeForChainOfResponsibility;

public class ZeroHandler extends Handler {

    public ZeroHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.state == 0){
            System.out.println("All zeros are handle here !!");
        }
        else if(next != null){
            System.out.println("Not a zero, hence delegating forward !!");
            next.handleRequest(request);
        }
    }
}
