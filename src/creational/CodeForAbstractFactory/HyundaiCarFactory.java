package creational.CodeForAbstractFactory;

public class HyundaiCarFactory implements ICarFactory {

    @Override
    public ICar getCar() {
        return new HyundaiCar();
    }
}
