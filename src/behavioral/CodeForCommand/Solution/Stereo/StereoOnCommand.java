package behavioral.CodeForCommand.Solution.Stereo;

import behavioral.CodeForCommand.Solution.Command;

public class StereoOnCommand extends Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
