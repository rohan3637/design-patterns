package creational.CodeForFactoryMethod;

public class Test {
    
    public static void main(String[] args){

        CarRentService rentService1 = new HyundaiService();
        System.out.println(rentService1.rentCar(1000));

        CarRentService rentService2 = new MarutiService();
        System.out.println(rentService2.rentCar(800)); 
    }
}