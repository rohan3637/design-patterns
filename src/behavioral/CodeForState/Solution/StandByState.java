package behavioral.CodeForState.Solution;

public class StandByState extends AudioPlayerState {

    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Invalid operation !!");
    }

    @Override
    public void pressChangeSource(AudioPlayer audioPlayer) {
        System.out.println("Setting source to radio !!");
        audioPlayer.audioPlayerState = new RadioState();
    }
    
}
