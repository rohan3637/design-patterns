package structural.CodeForBridge.Solution;

import java.util.List;

public class IssueMessage extends Message{
    public List<String> issues; 

    public IssueMessage(String from, String to, String title, String body, MessageSender sender, List<String> issues) {
        super(from, to, title, body, sender);
        this.issues = issues;

        this.body += "Following issues: ";
        for(String issue : issues){
            body += issue;
        }
    }
}
