package structural.CodeForBridge.Solution;

public class SMSSender implements MessageSender{

    @Override
    public void send(String from, String to, String title, String body) {
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println("From: " + from);
        System.out.println("To: " + to);

        System.out.println("Sent via SMS !!");
    }
    
}
