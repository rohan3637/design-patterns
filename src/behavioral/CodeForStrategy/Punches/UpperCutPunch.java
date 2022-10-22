package behavioral.CodeForStrategy.Punches;

public class UpperCutPunch implements IPunchingBehaviour {
    
    @Override
    public void punch() {
        System.out.println("Hits with upper-cut punches !!");
    }
}
