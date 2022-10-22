package behavioral.CodeForStrategy;

import behavioral.CodeForStrategy.Kicks.RoundHouseKick;
import behavioral.CodeForStrategy.Punches.HookPunch;
import behavioral.CodeForStrategy.Wrestle.NoWrestle;

public class Test {
    
    public static void main(String[] args){

        Fighter fighter1 = new Fighter();

        fighter1.pb = new HookPunch();
        fighter1.kb = new RoundHouseKick();
        fighter1.wb = new NoWrestle();

        fighter1.fight();;
    }
}
