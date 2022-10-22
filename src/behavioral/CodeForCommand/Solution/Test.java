package behavioral.CodeForCommand.Solution;

import behavioral.CodeForCommand.Solution.Light.Light;
import behavioral.CodeForCommand.Solution.Light.LightOffCommand;
import behavioral.CodeForCommand.Solution.Light.LightOnCommand;
import behavioral.CodeForCommand.Solution.Stereo.Stereo;
import behavioral.CodeForCommand.Solution.Stereo.StereoDecVolCommand;
import behavioral.CodeForCommand.Solution.Stereo.StereoIncVolCommand;
import behavioral.CodeForCommand.Solution.Stereo.StereoOffCommand;
import behavioral.CodeForCommand.Solution.Stereo.StereoOnCommand;

public class Test {
    
    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.btn1Command = new LightOnCommand(light);
        remoteControl.btn2Command = new LightOffCommand(light);

        remoteControl.btn3Command = new StereoOnCommand(stereo);
        remoteControl.btn4Command = new StereoOffCommand(stereo);

        //testing
        remoteControl.btn1Click();
        remoteControl.btn2Click();
        remoteControl.btn3Click();
        remoteControl.btn4Click();

        //new set-up
        remoteControl.btn1Command = new StereoIncVolCommand(stereo);
        remoteControl.btn2Command = new StereoDecVolCommand(stereo);

        //testing
        remoteControl.btn3Click();
        remoteControl.btn1Click();
        remoteControl.btn2Click();
        remoteControl.btn4Click();
    }
}
