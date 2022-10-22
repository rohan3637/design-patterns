package structural.CodeForBridge.Solution;

public class PriorityMessage extends Message {
    public int priority;

    public PriorityMessage(String from, String to, String title, String body, MessageSender sender, int priority) {
        super(from, to, title, body, sender);
        this.priority = priority;
        if(priority > 50){
            this.body += "Important message";
        }
        else if(priority > 30){
            this.body += "Slightly important message";
        }
        else{
            this.body += "Normal message";
        } 
    }
}
