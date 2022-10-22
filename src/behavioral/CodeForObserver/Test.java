package behavioral.CodeForObserver;

public class Test {
    
    public static void main(String[] args){
        
        CricketData data = new CricketData();
        data.setData(53, 1, 10);

        ScoreCardDisplay scd = new ScoreCardDisplay();
        NRRDisplay nrrd = new NRRDisplay();
        FinalScorePredictionDisplay fsd = new FinalScorePredictionDisplay();

        data.register(scd);
        data.register(nrrd);
        data.register(fsd);

        data.setData(112, 2, 21);
        data.setData(143, 2, 28);
        data.setData(218, 5, 41);

        data.unregister(fsd);
        data.setData(264, 7, 47);
    }
}
