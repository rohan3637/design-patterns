package structural.CodeForBridge.Problem;

public abstract class Message {
    
    public String from;
    public String to;
    public String title;
    public String body;
    public abstract void send();
}
