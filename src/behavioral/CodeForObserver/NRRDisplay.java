package behavioral.CodeForObserver;

public class NRRDisplay implements Observer{

    @Override
    public void update(Subject subject) {
        display((CricketData)subject);
    }

    private void display(CricketData data) {
        System.out.println("NRR --------------------------------- ");
        double nrr = data.getRuns() * 1.0 / data.getOvers();
        System.out.println("NRR: " + nrr);
    }

}
