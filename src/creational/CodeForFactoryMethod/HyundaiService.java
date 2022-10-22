package creational.CodeForFactoryMethod;

public class HyundaiService extends CarRentService {

    @Override
    public ICar getCar() {
        return new HyundaiCar();
    }
    
}
