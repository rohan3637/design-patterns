package behavioral.CodeForCommand.Solution;

public class RemoteControl {
    
    public Command btn1Command;
    public Command btn2Command;
    public Command btn3Command;
    public Command btn4Command;

    void btn1Click(){
        if(btn1Command == null){
            System.out.println("No functionality !!");
            return;
        }
        btn1Command.execute();
    }

    void btn2Click(){
        if(btn2Command == null){
            System.out.println("No functionality !!");
            return;
        }
        btn2Command.execute();
    }

    void btn3Click(){
        if(btn2Command == null){
            System.out.println("No functionality !!");
            return;
        }
        btn3Command.execute();
    }

    void btn4Click(){
        if(btn4Command == null){
            System.out.println("No functionality !!");
            return;
        }
        btn4Command.execute();
    }
}
