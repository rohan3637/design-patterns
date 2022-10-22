package behavioral.CodeForState.Solution;

public class MP3PausedState extends AudioPlayerState {

    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Playing mp3 !!");
        audioPlayer.audioPlayerState = new MP3PlayingState();
    }

    @Override
    public void pressChangeSource(AudioPlayer audioPlayer) {
        System.out.println("Setting source to radio !!");
        audioPlayer.audioPlayerState = new RadioState();
    }
    
}
