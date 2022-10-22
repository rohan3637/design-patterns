package behavioral.CodeForState.Solution;

public class RadioState extends AudioPlayerState{

    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Changing station !!");
    }

    @Override
    public void pressChangeSource(AudioPlayer audioPlayer) {
        System.out.println("Setting source to mp3 !!");
        audioPlayer.audioPlayerState = new MP3PausedState();
    }
    
}
