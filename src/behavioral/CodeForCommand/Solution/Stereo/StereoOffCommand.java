package behavioral.CodeForCommand.Solution.Stereo;

import behavioral.CodeForCommand.Solution.Command;

public class StereoOffCommand extends Command {
    
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
