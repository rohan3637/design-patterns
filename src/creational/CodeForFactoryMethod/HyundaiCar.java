package creational.CodeForFactoryMethod;

public class HyundaiCar implements ICar {
    
    @Override
    public void start(){
        System.out.println("Hyundai Car start logic !!");
    }

    @Override
    public void stop(){
        System.out.println("Hyundai Car stop logic !!");
    }

    @Override
    public int pricePerKm() {
        return 10;
    }
}