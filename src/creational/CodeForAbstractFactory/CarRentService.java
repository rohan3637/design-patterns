package creational.CodeForAbstractFactory;

public class CarRentService {

    private ICarFactory carFactory;

    void setCarFactory(ICarFactory carFactory){
        this.carFactory = carFactory;
    }

    public int rentCar(int kms){
        ICar car = carFactory.getCar();
        car.start();
        System.out.println("Drive for allowed kms...");
        int bill = car.pricePerKm() * kms;
        car.stop();
        return bill;
    }
}