package creational.CodeForFactoryMethod;

public class MarutiCar implements ICar {
    
    @Override
    public void start(){
        System.out.println("Maruti Car start logic !!");
    }

    @Override
    public void stop(){
        System.out.println("Maruti Car stop logic !!");
    }

    @Override
    public int pricePerKm() {
        return 12;
    }
}