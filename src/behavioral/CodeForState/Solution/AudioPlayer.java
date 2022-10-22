package behavioral.CodeForState.Solution;

public class AudioPlayer {
    
    public AudioPlayerState audioPlayerState;

    public AudioPlayer(){
        this.audioPlayerState = new StandByState();
    }

    public void pressPlay(){
        this.audioPlayerState.pressPlay(this);
    }

    public void pressChangeSource(){
        this.audioPlayerState.pressChangeSource(this);
    }
}
