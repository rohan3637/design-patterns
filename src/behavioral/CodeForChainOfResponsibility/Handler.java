package behavioral.CodeForChainOfResponsibility;

public abstract class Handler {

    protected Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public abstract void handleRequest(Request request);
}
