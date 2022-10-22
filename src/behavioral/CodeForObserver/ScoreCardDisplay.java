package behavioral.CodeForObserver;

public class ScoreCardDisplay implements Observer {

    @Override
    public void update(Subject subject) {
        display((CricketData) subject);
    }

    public void display(CricketData data){
        System.out.println("Scorecard --------------------------------- ");
        System.out.println("Runs: " + data.getRuns());
        System.out.println("Wickets: " + data.getWickets());
        System.out.println("Overs: " + data.getOvers());
    }
    
}
