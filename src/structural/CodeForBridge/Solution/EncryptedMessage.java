package structural.CodeForBridge.Solution;

public class EncryptedMessage extends Message {
    public String encryptionKey;

    public EncryptedMessage(String from, String to, String title, String body, MessageSender sender, String encryptionKey) {
        super(from, to, title, body, sender);
        this.encryptionKey = encryptionKey;
        this.body = encryptionKey + body;
    }
}
