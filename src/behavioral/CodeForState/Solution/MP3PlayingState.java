package behavioral.CodeForState.Solution;

public class MP3PlayingState extends AudioPlayerState {

    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Paused mp3 !!");
        audioPlayer.audioPlayerState = new MP3PausedState();
    }

    @Override
    public void pressChangeSource(AudioPlayer audioPlayer) {
        System.out.println("Setting source to radio !!");
        audioPlayer.audioPlayerState = new RadioState();
    }
    
}
