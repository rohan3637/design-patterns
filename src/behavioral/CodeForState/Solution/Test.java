package behavioral.CodeForState.Solution;

public class Test {
    
    public static void main(String[] args){

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.pressPlay();
        audioPlayer.pressChangeSource();
        audioPlayer.pressPlay();
        audioPlayer.pressChangeSource();
        audioPlayer.pressPlay();
        audioPlayer.pressPlay();
    }
}
