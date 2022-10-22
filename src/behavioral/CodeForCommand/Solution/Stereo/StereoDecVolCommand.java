package behavioral.CodeForCommand.Solution.Stereo;

import behavioral.CodeForCommand.Solution.Command;

public class StereoDecVolCommand extends Command {
    
    private Stereo stereo;

    public StereoDecVolCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.decVolume(1);;
    }

    @Override
    public void undo() {
        stereo.decVolume(-1);;
    }
}
