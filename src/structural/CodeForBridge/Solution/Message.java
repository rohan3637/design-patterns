package structural.CodeForBridge.Solution;

public abstract class Message {
    
    private String from;
    private String to;
    private String title;
    protected String body;
    private MessageSender sender;

    public Message(String from, String to, String title, String body, MessageSender sender){
        this.from = from;
        this.to = to;
        this.title = title;
        this.body = body;
        this.sender = sender; 
    }

    public void send(){
        sender.send(from, to, title, body);
    }
}
