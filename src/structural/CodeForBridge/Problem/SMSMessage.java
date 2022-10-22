package structural.CodeForBridge.Problem;

public class SMSMessage extends Message {

    @Override
    public void send() {
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println("From: " + from);
        System.out.println("To: " + to);

        System.out.println("Sent via SMS !!");
    }
    
}
