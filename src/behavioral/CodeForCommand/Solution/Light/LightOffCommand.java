package behavioral.CodeForCommand.Solution.Light;

import behavioral.CodeForCommand.Solution.Command;

public class LightOffCommand extends Command{
    
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
