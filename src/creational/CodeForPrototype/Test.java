package creational.CodeForPrototype;

public class Test {
    
    public static void main(String[] args){

        Shape circle1 = new Circle();
        Shape circle2 = circle1.cloneShape();

        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = rectangle1.cloneShape();
    }
}
