package behavioral.CodeForObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    private List<Observer> observers;

    public Subject(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer){
        observers.add(observer);
    }

    public void unregister(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
