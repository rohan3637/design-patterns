package creational.CodeForAbstractFactory;

public class MarutiCarFactory implements ICarFactory{

    @Override
    public ICar getCar() {
        return new MarutiCar();
    }
}
