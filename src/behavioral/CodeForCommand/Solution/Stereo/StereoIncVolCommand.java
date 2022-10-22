package behavioral.CodeForCommand.Solution.Stereo;

import behavioral.CodeForCommand.Solution.Command;

public class StereoIncVolCommand extends Command {
    
    private Stereo stereo;

    public StereoIncVolCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.incVolume(1);;
    }

    @Override
    public void undo() {
        stereo.incVolume(-1);;
    }
}
