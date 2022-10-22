package behavioral.CodeForObserver;

public class CricketData extends Subject {
    
    private int runs;
    private int overs;
    private int wickets;
    
    public int getRuns() {
        return runs;
    }

    private void setRuns(int runs) {
        this.runs = runs;
    }

    public int getOvers() {
        return overs;
    }

    private void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    private void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setData(int runs, int wickets, int overs){
        this.setRuns(runs);
        this.setOvers(overs);
        this.setWickets(wickets);
        super.notifyObservers();
    }
}
