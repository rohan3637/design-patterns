package creational.CodeForFactoryMethod;

public abstract class CarRentService {

    public int rentCar(int kms){
        ICar car = getCar();
        car.start();
        System.out.println("Drive for allowed kms !!");
        int bill = car.pricePerKm() * kms;
        car.stop();
        return bill;
    }

    public abstract ICar getCar();
}