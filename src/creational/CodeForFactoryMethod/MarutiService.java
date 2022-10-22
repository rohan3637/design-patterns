package creational.CodeForFactoryMethod;

public class MarutiService extends CarRentService {

    @Override
    public ICar getCar() {
        return new MarutiCar();
    }
    
}
