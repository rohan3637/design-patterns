package creational.CodeForAbstractFactory;

public class Test {
    
    public static void main(String[] args){
        
        CarRentService rentService1 = new CarRentService();
        rentService1.setCarFactory(new HyundaiCarFactory());
        System.out.println(rentService1.rentCar(100));

        CarRentService rentService2 = new CarRentService();
        rentService2.setCarFactory(new MarutiCarFactory());
        System.out.println(rentService2.rentCar(800));
    }
}
