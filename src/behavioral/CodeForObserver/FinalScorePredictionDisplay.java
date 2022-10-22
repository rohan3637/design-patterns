package behavioral.CodeForObserver;

public class FinalScorePredictionDisplay implements Observer {

    @Override
    public void update(Subject subject) {
        display((CricketData)subject);
    }

    private void display(CricketData data) {
        System.out.println("Predicted score --------------------------------- ");
        if(data.getWickets() == 0){
            double nrr = data.getRuns() * 1.0 / data.getOvers();
            int pfscore = (int)nrr * 50;
            System.out.println("Predicted final score: " + pfscore);
        }
        else{
            double rpw = data.getRuns() * 1.0 / data.getWickets();
            int pfscore = (int)rpw * 10;
            System.out.println("Predicted final score: " + pfscore);
        } 
    }
    
}
