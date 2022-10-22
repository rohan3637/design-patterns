package structural.CodeForFlyweight.Solution;

import java.util.HashMap;

public class TankTypeFactory {

    static HashMap<String, TankType> mp = new HashMap<>();
    
    public static TankType getTankType(String tankType){

        TankType res = null;
        if(mp.containsKey(tankType)){
            res = mp.get(tankType);
        }
        else{
            switch(tankType){
                case "typeA":
                    res = new TankType("typeA", 10, 20, null);
                    break;

                case "typeB":
                    res = new TankType("typeB", 100, 10, null);
                    break;

                case "typeC":
                    res = new TankType("typeC", 50, 30, null);
                    break;   
                    
                default: break;    
            }
            mp.put(tankType, res);
        }
        return res;
    }
}
