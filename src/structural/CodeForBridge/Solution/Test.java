package structural.CodeForBridge.Solution;

public class Test {
    
    public static void main(String[] args){

        MessageSender messageSender = new EmailSender();
        Message msg = new EncryptedMessage("abc", "xyz", "xyz", "tfufy hjfhf jggfuhyiu jhih vhg jh", messageSender, "pqrs");
        msg.send();
    }
}
