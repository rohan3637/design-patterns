package behavioral.CodeForCommand.Solution.Stereo;

public class Stereo {
    
    private int volume;

    public Stereo(){
        volume = 5;
    }

    public void on(){
        System.out.println("Turn on the stereo !!");
    }

    public void off(){
        System.out.println("Turn off the stereo !!");
    }

    public void incVolume(int delta){
        volume += delta;
        System.out.println("Volume set to " + volume);
    }

    public void decVolume(int delta){
        volume -= delta;
        System.out.println("Volume set to " + volume);
    }
}
