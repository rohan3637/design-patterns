package behavioral.CodeForStrategy;

import behavioral.CodeForStrategy.Kicks.IKickingBehaviour;
import behavioral.CodeForStrategy.Punches.IPunchingBehaviour;
import behavioral.CodeForStrategy.Wrestle.IWrestlingBehaviour;

public class Fighter {
    
    public IKickingBehaviour kb;
    public IPunchingBehaviour pb;
    public IWrestlingBehaviour wb;

    void fight(){
        kb.kick();
        pb.punch();
        wb.wrestle();
    }
}
