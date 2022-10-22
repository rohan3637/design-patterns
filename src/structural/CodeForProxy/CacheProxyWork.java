package structural.CodeForProxy;

import java.util.HashMap;

public class CacheProxyWork implements ISomeWork{

    RealWork realWork = new RealWork();
    HashMap<Integer, Integer> f1map = new HashMap<>();
    HashMap<String, Integer> f2map = new HashMap<>();

    @Override
    public int fun1(int x) {
        if(f1map.containsKey(x) == true){
            return f1map.get(x);
        } 
        int res = realWork.fun1(x);
        f1map.put(x, res);
        return res;
    }

    @Override
    public int fun2(int x, int y) {
        String key = Integer.toString(x) + Integer.toString(y);
        if(f2map.containsKey(key) == true){
            return f2map.get(key);
        } 
        int res = realWork.fun2(x, y);
        f2map.put(key, res);
        return res;
    }
    
}
